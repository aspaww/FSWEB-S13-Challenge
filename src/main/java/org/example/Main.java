package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){
        Healthplan healthplan = new Healthplan(1, "Standard Health", Plan.BASIC);

        String[] emHealthPlans= new String[2];
        Employee employee = new Employee(5,"Ahmet Cakar","skrcnklsss@gmail.com","452-328Abc0",emHealthPlans);
        employee.addHealthPlan(0,"Ahmet cakar");

        String[] emDeveloperNames = new String[5];
        Company company = new Company(5,"Ahmet",15.8,emDeveloperNames);
        company.addEmployee(2,"Memet");

        System.out.println("Healthplan: " + healthplan.toString());
        System.out.println("Employee: " + employee.toString());
        System.out.println("Company: " + company.toString());
    }

}
