package com.company;

public class Three extends Parent{

    private int number2;

    public Three(int number, String name, int number2) {
        super(number, name);
        this.number2 = number2;
    }

    @Override
    public void print() {
        super.print();
    }
}
