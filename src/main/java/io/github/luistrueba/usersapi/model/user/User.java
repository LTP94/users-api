package io.github.luistrueba.usersapi.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import io.github.luistrueba.usersapi.dto.model.user.UserDTO;
import io.github.luistrueba.usersapi.enumeration.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class that implements a User entity in the API.
 *
 * In JPA (Java Persistence API), an entity is a Java class that is used to represent a table in a database.
 * To implement an entity in JPA, you need to follow these steps:
 *
 * Add the @Entity annotation to the class. This annotation is used to mark the class as an entity and to specify
 * the name of the table that the entity will be mapped to.
 *
 * Add the @Id annotation to the primary key field. The primary key field is used to uniquely identify a record
 * in the table, and the @Id annotation is used to mark it as the primary key field.
 *
 * Add the @Column annotation to each persistent field. The @Column annotation is used to specify the name of the
 * column in the table that the field will be mapped to.
 *
 * Implement the Serializable interface. This is not required, but it is recommended because it allows the entity
 * to be serialized and persisted to a database using JPA.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 5514528747731992863L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;


    public User(Long id) {
        this.id = id;
    }
    /**
     * Method that verifies if the user is admin
     *
     *
     * @return boolean
     */
    public boolean isAdmin() {
        return RoleEnum.ROLE_ADMIN.toString().equals(this.role.toString());
    }

    /**
     * Method to convert a User entity to a User DTO
     *
     *
     * @return an UserDTO object
     */
    public UserDTO convertEntityToDTO() {
        return new ModelMapper().map(this, UserDTO.class);
    }


}
