package butorgyar;

public class Butorlap {

    private double hosszusag;
    private double szelesseg;
    private boolean tartolap;
    private final int TARTOLAPAR = 5000;
    private final int HATLAPAR = 500;

    public Butorlap(boolean tartolap, double hosszusagcm, double szelessegcm) {
        this.tartolap = tartolap;
        this.hosszusag = hosszusagcm / 100;
        this.szelesseg = szelessegcm / 100;
    }

    public double arSzamol() {
        if (tartolap) {
            return hosszusag * szelesseg * TARTOLAPAR;
        } else {
            return hosszusag * szelesseg * HATLAPAR;
        }
    }

    public double getHosszusag() {
        return hosszusag;
    }

    public void setHosszusag(double hosszusag) {
        this.hosszusag = hosszusag;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    public void setSzelesseg(double szelesseg) {
        this.szelesseg = szelesseg;
    }

    public boolean isTartolap() {
        return tartolap;
    }

    public void setTartolap(boolean tartolap) {
        this.tartolap = tartolap;
    }

    public int getTARTOLAPAR() {
        return TARTOLAPAR;
    }

    public int getHATLAPAR() {
        return HATLAPAR;
    }
}
