package com.practise.inheritance;

public class Fish extends Animal {

    public static void main(String[] args) {

        Animal animal = new Fish();

        animal.setName("shark");
        animal.setWeight(100f);
        animal.setEat("Non Veg");

        System.out.println(animal);
    }

}
