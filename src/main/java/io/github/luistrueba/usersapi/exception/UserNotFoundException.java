package io.github.luistrueba.usersapi.exception;


/**
 * Class that implements UserNotFoundException in the API
 *
 */
public class UserNotFoundException extends Exception {

    private static final long serialVersionUID = -2586209354700102349L;

    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String msg){
        super(msg);
    }

    public UserNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }

}
