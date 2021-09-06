/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package org.example;
import java.util.Scanner;

class Name {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is your name?" );
        String name = input.nextLine();

        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.println(greeting);

        // System.out.println("Hello, " + name + ", nice to meet you!");
    }
}