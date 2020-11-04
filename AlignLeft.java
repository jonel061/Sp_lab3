package com.company;

import com.company.AlignStrategy;
import com.company.Paragraf;

import javax.naming.Context;

public class AlignLeft implements AlignStrategy {
// TO-DO: ATRIBUTE

    @Override
    public void render(Paragraf paragraf, Context c) {
        System.out.println("Render from AlignLeft.");
    }

    @Override
    public void setAlignment(Paragraf paragraf, Context c) {
        System.out.println(paragraf + " has been aligned to the left.");
    }

    @Override
    public String toString() {
        return "left";
    }
}