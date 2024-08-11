package com.example.arrays_strings.romans;

public class InvalidRomanException extends Exception {
    private String message;

    public InvalidRomanException(String message) {
        this.message = message;
    }

    public InvalidRomanException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public InvalidRomanException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public InvalidRomanException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
