package org.example.Observer;

public class ObserverDesignPattern {

    public ObserverDesignPattern() {
        startObserver();
    }

    private void startObserver() {
        ObserverImpl observer1 = new ObserverImpl("ABCD");
        ObserverImpl observer2 = new ObserverImpl("XYZ");
        ObserverImpl observer3 = new ObserverImpl("1213");
        Observerable observerable = new Observerable();
        observerable.addObserver(observer1);
        observerable.addObserver(observer2);
        observerable.addObserver(observer3);

        observerable.notifyAll("Tomorrowland");

        observerable.removeObserver(observer3);

        observerable.notifyAll("Tomorrowland 2");






    }
}
