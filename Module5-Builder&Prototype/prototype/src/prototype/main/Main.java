package prototype.main;

import prototype.classes.Reteta;
import prototype.classes.RetetaAbstracta;
import prototype.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("solutie1", 21.0);
        solutii.put("solutie2", 34.0);
        solutii.put("solutie3", 91.5);
        solutii.put("solutie4", 56.23);
        Reteta prototypeReteta = new Reteta(solutii, "Medicament1");
        RetetaAbstracta reteta2 = prototypeReteta.clone();

        System.out.println(prototypeReteta);
        System.out.println(reteta2);


        RetetaCrema retetaCrema = new RetetaCrema(14, "Ingredient1");
        RetetaAbstracta retetaCrema2 = retetaCrema.clone();
        System.out.println(retetaCrema);
        System.out.println(retetaCrema2);

    }
}