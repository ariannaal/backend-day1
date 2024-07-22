import java.util.Scanner;

public class esercizio3 {
    public static float perimetroRettangolo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il valore della base del rettangolo");
        float base = scanner.nextFloat();

        System.out.println("Inserisci il valore dell'altezza del rettangolo");
        float altezza = scanner.nextFloat();

        float sommaPerimetro = base*2 + altezza*2;

        return sommaPerimetro;
    }

    public static int pariDispari() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero random");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il valore della base del triangolo");
        double baseT = scanner.nextDouble();

        System.out.println("Inserisci il valore del lato del triangolo");
        double lato1T = scanner.nextDouble();

        System.out.println("Inserisci il valore del lato del triangolo");
        double lato2T = scanner.nextDouble();

        double perimetro = baseT+lato1T+lato2T;
        double semiperimetro = perimetro/2;


        return Math.sqrt(semiperimetro*(semiperimetro-baseT)*(semiperimetro-lato1T)*(semiperimetro-lato2T));
    }

}
