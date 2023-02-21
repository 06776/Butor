package butorgyar;

public class Butor {

    int lapokszama;
    Butorlap[] lapok;

    public Butor() {
        this.lapokszama = 0;
        this.lapok = new Butorlap[100];
    }

    public void lapHozzaad(Butorlap lap) {
        if (lapokszama < 100) {
            this.lapok[lapokszama] = lap;
            lapokszama++;
        }
    }

    public double arSzamol() {
        double ar = 0;
        for (int i = 0; i < lapokszama; i++) {
            ar += this.lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Butor - lapok szama: " + lapokszama + ", Ar: " + arSzamol() + " Ft";
    }
}
