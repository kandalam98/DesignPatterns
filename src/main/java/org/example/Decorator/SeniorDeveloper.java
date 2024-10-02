package org.example.Decorator;

public class SeniorDeveloper extends DeveloperDecorator {
    Developer dev;
    SeniorDeveloper(Developer dev){
        this.dev = dev;
    }

    String seniorDevJob(){
        return "Code Review";
    }
    @Override
    public String makeJob() {
        return dev.makeJob() + seniorDevJob();
    }
}
