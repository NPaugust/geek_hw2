package com.company;

public class Parent implements Printable{

    private int number;
    private String name;

    public Parent(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void print(){
        System.out.println("My number is " + number + " and my name is " + name);
    }

}
