package ro.ase.dice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

abstract class Readeable {
    protected Scanner scanner;

    public Readeable(String file) throws FileNotFoundException {
        scanner = new Scanner(new File(file));
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public void readAplicant(Scanner scanner, Aplicant aplicant){

        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());

        int nrProiecte = scanner.nextInt();
        String[] proiecte = new String[5];
        for (int i = 0; i < nrProiecte; i++)
            proiecte[i] = scanner.next();

    }
}