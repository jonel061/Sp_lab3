package com.company;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hi!");

        Section section = new Section();
        List<Autor> autori = Arrays.asList(new Autor("Ion Barbu"));

        Carte c = new Carte(autori, "CarteX");
        c.add(new Paragraf());
        Section s1 = new Section();
        s1.add(new Imagine());
        c.add(s1);
        // c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));

        c.rander();

    }
}