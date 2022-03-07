package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {
    public static void main(String[] args) {
        IngrijitorZOO ingrijitorZOO = new IngrijitorZOO("0");

        Zebra z1 = new Zebra("1");
        Zebra z2 = new Zebra("2");

        Elefant e1 = new Elefant("3");
        Elefant e2 = new Elefant("4");

        ZOO zoo = new ZOO("Zoo Bucuresti", ingrijitorZOO);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);

        zoo.hranesteAnimale("banane");
    }
}
