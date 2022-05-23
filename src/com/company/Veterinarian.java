package com.company;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal){
        System.out.println("Любимая еда: "+animal.food+"\nМестоположение: "+animal.location+"\n");
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
