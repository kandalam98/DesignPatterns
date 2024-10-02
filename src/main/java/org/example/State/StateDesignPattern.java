package org.example.State;

public class StateDesignPattern {
    
    public StateDesignPattern(){
        startDesignPattern();
    }

    private void startDesignPattern() {

        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}
