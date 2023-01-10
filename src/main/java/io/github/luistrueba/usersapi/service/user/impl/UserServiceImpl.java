package io.github.luistrueba.usersapi.service.user.impl;
import java.util.Optional;

import io.github.luistrueba.usersapi.exception.UserNotFoundException;
import io.github.luistrueba.usersapi.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.luistrueba.usersapi.model.user.User;
import io.github.luistrueba.usersapi.service.user.UserService;

/**
 * Class that implements the user's service methods
 *
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * The @Autowired annotation is a Spring annotation that can be used to inject dependencies into a Java class.
     * It can be used to inject objects of any scope (such as singleton, prototype, request, or session) into a class.
     */
    @Autowired
    UserRepository repository;

    /**
     * @see UserService#save(User)
     * The save() method takes an entity instance as an argument and returns a saved entity instance.
     * The returned instance will contain any generated values, such as a generated primary key value.
     */
    @Override
    public User save(User user) {
        return repository.save(user);
    }

    /**
     * @see UserService#findByEmail(String)
     */
    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public User findById(Long userId) throws UserNotFoundException {
        try {
            return repository.findById(userId).orElseThrow(() ->
                    new UserNotFoundException("User id=" + userId + " not found"));
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
