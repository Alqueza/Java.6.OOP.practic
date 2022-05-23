package com.company;

public class Dog extends Animal{
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeVoice() {
        System.out.println(name+" издает звук: Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println(name+"  ест корм для собак");
    }

    @Override
    public void sleep() {
        System.out.println(name+" спит");
    }

    @Override
    public String toString() {
        return "Собака\n" +
                "Имя: " + name;
    }
}
