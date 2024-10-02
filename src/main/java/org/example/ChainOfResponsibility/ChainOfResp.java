package org.example.ChainOfResponsibility;

public class ChainOfResp {
    public ChainOfResp() {
        //startChainOfResp();
    }

    public void startChainOfResp(){
        System.out.println("******Chain Of Responsibility*******8");
        //Decorator is a structural design pattern that helps to attach new behaviours to the object
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Hr hr = new Hr();

        teamLead.setSuperior(manager);
        manager.setSuperior(hr);

        teamLead.applyLeave(9);
    }
}
