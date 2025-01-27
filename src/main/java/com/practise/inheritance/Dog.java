package com.practise.inheritance;

public class Dog extends Animal{

    public static void main(String[] args) {

        Animal dog = new Dog();

        dog.setName("chintu");
        dog.setWeight(15.50f);
        dog.setEat("Non veg");

        System.out.println(dog);
    }

}
