package com.company;

public abstract class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {
    }

    public Animal(Dog[] dogs, Cat[] cats, Horse[] horses) {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeVoice(){
        System.out.println("Какое-то животное издает звук");
    }

    public void eat(){
        System.out.println("Животное ест");
    }

    public void sleep(){
        System.out.println("Какое-то животное спит");
    }

}
