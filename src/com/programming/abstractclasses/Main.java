package com.programming.abstractclasses;

import java.util.List;

public class Main  {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        String stringData = "Drawing Brisbane perth Melbourne Canberra Adelaide Sydney Canberra.";
        String[] data = stringData.split("");

        for (String s : data){


        }

    }

}
