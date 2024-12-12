package org.example.b;

import static org.example.b.Message.message;

public class Greeting {
    static int a = 4;
    static int b;

    static {
        System.out.println("I'm in static block");
        
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        Greeting greeting = new Greeting();
        System.out.println(greeting.a + " " + greeting.b);
        Greeting.b += 3;
        System.out.println(greeting.a + " " + greeting.b);

        Greeting greeting1 = new Greeting();
        System.out.println(greeting1.a + " " + greeting1.b);
//        message();

    }
}
