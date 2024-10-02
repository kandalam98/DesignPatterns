package org.example;

import org.example.ChainOfResponsibility.ChainOfResp;
import org.example.Composite.Composite;
import org.example.Decorator.Decorator;
import org.example.Observer.ObserverDesignPattern;
import org.example.State.StateDesignPattern;
import org.example.Strategy.Strategy;

public class Main {
    public static void main(String[] args) {
        ChainOfResp chainOfResp = new ChainOfResp();
        chainOfResp.startChainOfResp();


        Decorator decorator = new Decorator();
        decorator.startDecorator();

        Strategy strategy = new Strategy();
        strategy.startStrategy();

        Composite composite = new Composite();
        composite.startComposite();

        ObserverDesignPattern observerDesignPattern = new ObserverDesignPattern();

        StateDesignPattern stateDesignPattern = new StateDesignPattern();
    }
}