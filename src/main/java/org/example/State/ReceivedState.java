package org.example.State;

public class ReceivedState implements  PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("DONE");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void print() {
        System.out.println("This package is already received by a client.");
    }
}
