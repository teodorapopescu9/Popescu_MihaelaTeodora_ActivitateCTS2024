package main;

import builder.classes.Pacient;
import builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient =new PacientBuilder()
                .setHalatPentruInterior(true)
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamere(true)
                .build();
        Pacient pacient2 =new PacientBuilder()
                .setHalatPentruInterior(true)
                .build();


        System.out.println(pacient2);
        System.out.println(pacient);
    }
}