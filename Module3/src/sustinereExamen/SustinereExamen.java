package sustinereExamen;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String numeExamen;
    Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String numeExamen) {
        this.numeExamen = numeExamen;
    }

    public String getNumeExamen() {
        return numeExamen;
    }

    public void setNumeExamen(String numeExamen) {
        this.numeExamen = numeExamen;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(Map<Integer, Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void inregistrareStudent(Student student) {
        if (listaStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " a sustinut examenul deja!");
        } else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine acum examenul!");

        }
    }
}
