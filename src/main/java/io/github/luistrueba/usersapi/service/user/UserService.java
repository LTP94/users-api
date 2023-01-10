package io.github.luistrueba.usersapi.service.user;

import java.util.Optional;

import io.github.luistrueba.usersapi.exception.UserNotFoundException;
import io.github.luistrueba.usersapi.model.user.User;

/**
 * Interface that provides methods for manipulating User objects.
 *
 *  In Java, a service interface is a Java interface that defines a set
 *  of related methods that a service implementation can provide.
 *  A service implementation is a class that implements the service interface
 *  and provides concrete implementations for the methods defined in the interface.
 */
public interface UserService {

    /**
     * Method that saves a user in the database.
     *
     *
     * @param user
     * @return User object
     */
    User save(User user);

    /**
     * Method that find a user by email in the database.
     *
     *
     * @param email
     * @return Optional<User> object
     */
    Optional<User> findByEmail(String email);

    /**
     * Method that find a user by id in the database.
     *
     *
     * @param userId
     * @return Optional<User> object
     */
    User findById(Long userId) throws UserNotFoundException;

}
