package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Gato tom = new Gato("tom");
        Raton jerry = new Raton("jerry", 150.0);
        Raton mickey = new Raton("mickey", 250.0);
        Raton speedy = new Raton("speedy gonzalez", 200.0);
        Raton ratatouille = new Raton("ratatouille", 120.0);

        ArrayList<Raton> listaDeRatonesFamosos = new ArrayList<Raton>();


        listaDeRatonesFamosos.add(mickey);
        listaDeRatonesFamosos.add(speedy);
        listaDeRatonesFamosos.add(ratatouille);


        tom.comerRaton(jerry);
        tom.comerRaton(listaDeRatonesFamosos);

        System.out.println(tom.meConvieneComerA(jerry, 300));

    }
}
