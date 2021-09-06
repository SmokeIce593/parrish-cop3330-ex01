package org.example;
import java.util.Scanner;

class Name {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is your name?" );
        String name = input.next();

        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.println(greeting);

        // System.out.println("Hello, " + name + ", nice to meet you!");
    }
}