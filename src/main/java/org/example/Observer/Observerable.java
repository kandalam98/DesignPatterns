package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observerable {

    List<Observer> observerList ;

    public Observerable() {
        this.observerList = new ArrayList<>();
    }
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        System.out.println("removing " + observer.observerName());
        observerList.remove(observer);
    }
    public void notifyAll(String news){
        for(Observer observer : observerList){
            System.out.println(news + " News sent to " + observer.observerName());
        }
    }
}
