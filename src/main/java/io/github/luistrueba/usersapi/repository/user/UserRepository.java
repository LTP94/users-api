package io.github.luistrueba.usersapi.repository.user;

import io.github.luistrueba.usersapi.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * The JPA (Java Persistence API) repository is a component that sits on top of a JPA entity manager
 * and provides an interface for CRUD (create, read, update, delete) operations on a database.
 * It allows you to perform basic database operations without writing any SQL code, and can be
 * used to create, read, update, and delete records in a database.
 *
 * A JPA repository is typically used in a Java application to manage the persistence of data in
 * a database. It provides a number of useful methods for performing common database operations,
 * such as saving and deleting entities, finding entities by their primary key, and querying for
 * entities based on various criteria.
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Method to search a User by the email.
     *
     * @author Luis Trueba
     *
     * @param email
     * @return Optional<User>
     */
    Optional<User> findByEmail(String email);
}


