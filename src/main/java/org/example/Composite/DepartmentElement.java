package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentElement {

    List<Department> departmentList ;

    public DepartmentElement(){
        departmentList = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departmentList.add(department);
    }
    public void listDepartment(){
        for(Department de :  departmentList){
            System.out.println(de.departmentName());
        }
    }
}
