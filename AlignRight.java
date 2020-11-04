package com.company;

import com.company.AlignStrategy;
import com.company.Paragraf;

import javax.naming.Context;

public class AlignRight implements AlignStrategy {
    // TO-DO: ATRIBUTE


    @Override
    public void render(Paragraf paragraf, Context c) {
        System.out.println("Render from AlignRight.");
    }

    @Override
    public void setAlignment(Paragraf paragraf, Context c) {
        System.out.println(paragraf + " has been aligned to the right.");
    }

    @Override
    public String toString() {
        return "right";
    }
}