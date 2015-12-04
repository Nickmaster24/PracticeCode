package com.example.practice;

/**
 * @author nickm_000
 * @since 12/3/2015.
 */
public class Main {
    //SINGLETON Code
    private static Main singletonInstance = new Main(); //Create singleton

    public static Main getInstance() {
        return singletonInstance;
    } //Getter method for singleton

    private Main() { //Called only within the class
    }

    public static void main(String[] args) {
        Main.getInstance().printHelloWorld();
    }

    public void printHelloWorld() {
        System.out.println("Hello World!");
    }
}
