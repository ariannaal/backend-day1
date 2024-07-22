import java.util.Scanner;

public class esercizio1 {
    public static int moltiplica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Per favore inserisci un numero");
        int primoNumero = scanner.nextInt();
        System.out.println("Inserisci un altro numero");
        int secondoNumero = scanner.nextInt();
        return primoNumero*secondoNumero;
    }

    public static String concatena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Per favore inserisci del testo");
        String stringa = scanner.nextLine();
        System.out.println("Per favore inserisci un numero");
        int numero = scanner.nextInt();
        return stringa + numero;
    }

    public static String[] inserisciInArray(){
        Scanner scanner = new Scanner(System.in);
        String[] array5 = new String[5];
        array5[0] = "Uno";
        array5[1]= "Due";
        array5[2] = "Tre";
        array5[3]= "Quattro";
        array5[4] = "Cinque";

        System.out.println("Per favore inserisci del testo");
        String nuovaStringa = scanner.nextLine();

        String[] array6 = new String[6];

        for (int i = 0; i < 3; i++){
            array6[i] = array5[i];
        }

        array6[3] = nuovaStringa;

        for (int i = 3; i < 5; i++) {
            array6[i + 1] = array5[i];
        }

        return array6;


    }


}
