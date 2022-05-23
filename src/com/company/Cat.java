package com.company;

public class Cat extends Animal{
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeVoice() {
        System.out.println(name+" издает звук: Мяу!");
    }

    @Override
    public void eat() {
        System.out.println(name+" ест кошачий корм");
    }

    @Override
    public void sleep() {
        System.out.println(name+" спит");
    }

    @Override
    public String toString() {
        return "Кошка\n" +
                "Имя: " + name;
    }
}
