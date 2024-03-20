package builder.main;

import builder.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder = new Pacient.PacientBuilder();
        Pacient pacient = pacientBuilder
                .setMicDejunInclus(true)
                .setPatRabatabil(true)
                .setPapuciDeCamere(true)
                .build();

        System.out.println(pacient);

    }
}