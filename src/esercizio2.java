import java.util.Scanner;

public class esercizio2 {
    public static String stringheInserite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Per favore inserisci del testo");
        String primaStringa = scanner.nextLine();

        System.out.println("Per favore inserisci dell'altro testo");
        String secondaStringa = scanner.nextLine();

        System.out.println("Per favore inserisci dell'altro testo ancora");
        String terzaStringa = scanner.nextLine();

        String ordineOriginale = " " + primaStringa + " " + secondaStringa + " " + terzaStringa;

        String ordineInverso = " " + terzaStringa + " " + secondaStringa + " " + primaStringa;

        return ordineOriginale + ordineInverso;

        }


    }

