package org.example.Observer;

public class ObserverImpl implements  Observer{

    String name;
    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public String observerName() {
        return this.name;
    }
}
