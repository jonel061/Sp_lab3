package com.company;

import  javax.naming.Context;

public interface AlignStrategy {
    void render(Paragraf paragraf, Context c);
    void setAlignment(Paragraf paragraf, Context c);

}