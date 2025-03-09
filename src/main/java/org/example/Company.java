package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro<0){
            this.giro= 0;
        }else{
            this.giro=giro;
        }
        this.developerNames= developerNames;
    }
    public void addEmployee(int index,String name){
        if(index<0 || index > developerNames.length){
            System.out.println("Index dizinin dışında!");
            return;
        }else if(developerNames[index]==null){
            developerNames[index] = name;
            System.out.println("Developer Names eklendi: " + name);
        }else{
            System.out.println("Index: " + index + "zaten dolu, mevcut değer: "+ developerNames[index]);
        }
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGiro(){
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGiro(double giro){
        this.giro=giro;
    }
    public void setDeveloperNames(String [] developerNames){
        this.developerNames= developerNames;
    }




}
