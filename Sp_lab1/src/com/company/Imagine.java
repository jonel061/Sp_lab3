package com.company;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element {
    String nume;

    public Imagine() {


    }
    public Imagine(String nume){
        this.nume=nume;
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void render() {
       System.out.format("Imagine %s \n",nume) ;
    }
}
