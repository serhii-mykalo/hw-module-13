package org.example.task1.httpurlconnection;

import static org.example.task1.httpurlconnection.UserCrudApp.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createUser());
        System.out.println(updateUser(1));
        System.out.println(deleteUser(1));
        System.out.println(getUsers());
        System.out.println(getUserById(1));
        System.out.println(getUserByUsername("Karianne"));
    }
}