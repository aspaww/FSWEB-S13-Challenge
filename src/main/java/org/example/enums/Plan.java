package org.example.enums;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum Plan {
    BASIC("Basic",100);


    private final String name;
    private final int price;

    Plan(String name,int price){
        this.name = name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }


    @NotNull
    @Contract(pure = true)
    public String toString(){
        return name + price;
    }
}
