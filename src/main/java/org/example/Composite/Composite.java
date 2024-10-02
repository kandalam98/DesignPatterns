package org.example.Composite;

public class Composite {

    //Structural Design Pattern . Core is represented by a tree
    public void startComposite(){
        System.out.println("********Composite******** " + System.lineSeparator() + "Structural Design Pattern . Core is represented by a tree");
        System.out.println("Application : helps to represent hierarchical  structure like trees etc");
        DepartmentElement departmentElement = new DepartmentElement();
        MathDepartment mathDepartment = new MathDepartment();
        ScienceDepartment scienceDepartment = new ScienceDepartment();

        departmentElement.addDepartment(mathDepartment);
        departmentElement.addDepartment(scienceDepartment);

        departmentElement.listDepartment();
    }
}
