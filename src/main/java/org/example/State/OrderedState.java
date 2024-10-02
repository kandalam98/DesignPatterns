package org.example.State;

public class OrderedState implements  PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("This package is still in the root stage");
    }

    @Override
    public void print() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
