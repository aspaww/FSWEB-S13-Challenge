package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id,String fullName,String email,String password,String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthplans;
    }

    public void addHealthPlan(int index,String name){
        if(index<0 || index>healthPlans.length){
            System.out.println("Index dizinin dışında!");
            return;
        }else if(healthPlans[index]==null){
            healthPlans[index]=name;
            System.out.println();
        }else{
            System.out.println("Index: "+index + "zaten dolu, mevcut değer: " +healthPlans[index]);
        }
    }
    public String[] getHealthPlans(){
        return healthPlans;
    }
    // Getter ve Setter metodları
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String[] getHealthplans() {
        return healthPlans;
    }
    public void setHealthplans(String[] healthplans) {
        this.healthPlans = healthplans;
    }



    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }

}
