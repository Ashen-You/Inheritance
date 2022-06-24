package com.travis;

public class Felidae extends Animal{
    public Felidae(int age, double weight, boolean eating, boolean running) {
        super(age, weight, eating, running);
    }

    public void meowing(){
        System.out.println("meowing meowing");
    }
}
