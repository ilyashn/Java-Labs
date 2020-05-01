package com.itmo.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException() {
        super("Item already exists");
    }
}
