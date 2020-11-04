package com.company;


import javax.naming.Context;

public class AlignCenter implements AlignStrategy{
    // TO-DO: ATRIBUTE


    @Override
    public void render(Paragraf paragraf, Context c) {
        System.out.println("Render from AlignRight.");
    }

    @Override
    public void setAlignment(Paragraf paragraf, Context c) {
        System.out.println(paragraf + " has been aligned to the center.");
    }

    @Override
    public String toString() {
        return "center";
    }
}