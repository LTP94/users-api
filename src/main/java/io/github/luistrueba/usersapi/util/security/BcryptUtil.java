package io.github.luistrueba.usersapi.util.security;


/**
 * This class implements some utility methods to generate
 * a password hashing based on Bcrypt algorithm.
 *
 */
public class BcryptUtil {


    /**
     * Method that check if the password is already encoding.
     *
     *
     * @param password
     * @return boolean
     */
    public static boolean isEncrypted(String password) {
        return password.startsWith("$2a$");
    }



}

