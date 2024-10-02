package org.example.ChainOfResponsibility;

public class Hr implements  Superior{
    Superior nextSuperior;

    public Superior getSuperior() {
        return nextSuperior;
    }

    public void setSuperior(Superior superior) {
        this.nextSuperior = superior;
    }
    @Override
    public void applyLeave(int days) {
        System.out.println("leave for " + days + " days is granted by HR");
    }
}
