package com.company;

public class Two extends Parent{

    private String numbres;

    public Two(int number, String name, String numbres) {
        super(number, name);
        this.numbres = numbres;
    }

    @Override
    public void print() {
        super.print();
    }
}
