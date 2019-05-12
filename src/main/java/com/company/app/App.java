package com.company.app;

/**
 * First Jenkins Pipeline!
 *
 */
public class App
{

    private final String message = "Jenkins Pipeline!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}

