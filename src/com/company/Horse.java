package com.company;

public class Horse extends Animal{
    private String name;

    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public Horse(String name) {
        this.name = name;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeVoice() {
        System.out.println(name+" издает звук: Иго-го");
    }

    @Override
    public void eat() {
        System.out.println(name+" ест сено");
    }

    @Override
    public void sleep() {
        System.out.println(name+" спит в конюшне");
    }

    @Override
    public String toString() {
        return "Лошадь\n" +
                "Имя: " + name;
    }
}
