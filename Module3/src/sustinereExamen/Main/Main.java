package sustinereExamen.Main;

import sustinereExamen.Student;
import sustinereExamen.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student(123, "Denis", "denis@stud.ase.ro", 3);
        Student stud2 = new Student(124, "Laura", "laura@stud.ase.ro", 2);
        Student stud3 = new Student(125, "Denisa", "pop-denis@stud.ase.ro", 1);
        Student stud4 = new Student(126, "Paul", "paul@stud.ase.ro", 3);
        Student stud5 = new Student(127, "Andrei", "andrei@stud.ase.ro", 3);

        SustinereExamen examenPOO = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCTS = new SustinereExamen("Calitate si testare software");

        examenPOO.inregistrareStudent(stud1);
        examenPOO.inregistrareStudent(stud2);
        examenPOO.inregistrareStudent(stud1);
        examenPOO.inregistrareStudent(stud3);
        examenPOO.inregistrareStudent(stud3);

        examenCTS.inregistrareStudent(stud1);

    }
}
