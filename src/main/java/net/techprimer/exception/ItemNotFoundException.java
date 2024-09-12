package net.techprimer.exception;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String message) {
        super(message);
    }

    //Optional : Add if you want to add the more info about exception 
    public ItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
