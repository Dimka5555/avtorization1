package ru.netology.authorizationserviceappspringboot.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        System.out.println("[ERROR: UnauthorizedUser] : " + e.getMessage());
    }
}

