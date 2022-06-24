package com.accessmodifier;

public class Animal {

	private String animalName = "Fox";
     String animalType;
    protected boolean canFly;
    public String getAnimalName()
    {
        System.out.println(this.animalName);
        System.out.println(this.canFly);
        System.out.println(this.animalType);
        return this.animalName;
    }
}
