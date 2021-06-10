import java.util.Scanner;

/**
 * Ejercicio9
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t1,t2,suma;
        int total =0;
        t1 =0; suma = 0;

        do {
            System.out.println("ingresa 2 temperaturas");
            t1 = scanner.nextDouble();
            t2 = scanner.nextDouble();
            if ((5<=t1)&&(t1<=15)) {
                suma += t1;
                total++;
            }
            if ((5<=t2)&&(t2<=15)) {
                suma += t2;
                total++;
            }
            double pormedio =suma/total;
            System.out.println("promedio es: "+pormedio);
        } while (t1 !=0);
    }
}