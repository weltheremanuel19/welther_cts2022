package builder.main;

import builder.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient= new Pacient.BuilderPacient(true).build();
        Pacient pacient1 = new Pacient.BuilderPacient(true).setMicDejun(true).setHalat(true).build();
        System.out.println(pacient1);
        System.out.println(pacient);
    }
}
