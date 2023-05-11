package com.driver;

public class Main {
    public static void main(String [] args){
        RWOnly obj=new RWOnly();
        //when obj.name accesesd directly it is showing error.Because we can not access private members from other class.
        obj.setName("Areeff");
        System.out.println(obj.getName());
    }

}