package ro.ase.dice.clase;

public record Calator(String nume) implements ICalator {

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit mesajul: " + mesaj);
    }
}