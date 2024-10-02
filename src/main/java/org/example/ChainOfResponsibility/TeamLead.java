package org.example.ChainOfResponsibility;

public class TeamLead implements Superior{
    Superior nextSuperior;

    public Superior getSuperior() {
        return nextSuperior;
    }

    public void setSuperior(Superior superior) {
        this.nextSuperior = superior;
    }

    @Override
    public void applyLeave(int days) {
        if( days <  5){
            System.out.println("leave for " + days + " days is granted by teamlead");
        } else {
            nextSuperior.applyLeave(days);
        }
    }
}
