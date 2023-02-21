package futtat;

import butorgyar.Butor;
import butorgyar.Butorlap;

public class Futtathato {

    public static void main(String[] args) {
        Butor szek = new Butor();
        Butorlap a = new Butorlap(true, 40, 200);
        Butorlap b = new Butorlap(false, 80, 180);
        Butorlap c = new Butorlap(false, 50, 30);
        szek.lapHozzaad(a);
        szek.lapHozzaad(b);
        szek.lapHozzaad(c);
        System.out.println("/ Butor adatok /\n");
        System.out.println(szek.toString());
        System.out.println("\n\n'Created by Hajdara Patrik'");
    }
}
