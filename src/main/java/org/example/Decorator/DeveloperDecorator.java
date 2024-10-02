package org.example.Decorator;

public class DeveloperDecorator implements   Developer {

    Developer dev;
    @Override
    public String makeJob() {
        return dev.makeJob();
    }
}
