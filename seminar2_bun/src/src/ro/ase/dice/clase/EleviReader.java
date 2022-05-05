package src.ro.ase.dice.clase;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EleviReader extends IReader{
    public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();
        while (super.scanner.hasNext()) {

            Elev elev = new Elev();
            readAplicant(super.scanner, elev);
            elev.setClasa(super.scanner.nextInt());
            elev.setTutore(super.scanner.next());
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }
}