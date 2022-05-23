package com.company;

public class Main {

    public static void main(String[] args) {

        Veterinarian veterinarian = new Veterinarian("Добрыня");

        Dog dog = new Dog("Собачий корм","Парк для собак","Лайка");

        Cat cat = new Cat("Кошачий корм","Парк для кошек","Мурка");

        Horse horse = new Horse("Сено","Конюшня","Тень");

        Animal[] animals = new Animal[]{dog,cat,horse};
        for (Animal a: animals) {
            System.out.println(a);
            veterinarian.treatAnimal(a);
        }

    }
}
