package com.scholarcoder.tddintro;

public class UserService {
    public Session session;

    public void login(String username, String password) {
        session = new Session();
        session.user = new User();
    }
}
