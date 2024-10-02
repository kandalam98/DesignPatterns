package org.example.Decorator;

public class Decorator {

    public void startDecorator(){
        System.out.println("********Decorator Design Pattern******8");
        //Its a behavioral design pattern that lets pass requests along a chain of handlers
        //Each handler decides and process or send to next handler
        Developer javaDev = new JavaDeveloper();
        System.out.println("javaDev Job is " + javaDev.makeJob());
        Developer  developerDecorator = new SeniorDeveloper(new JavaDeveloper());
        System.out.println( "Senior Dev Job is " + developerDecorator.makeJob());
    }
}
