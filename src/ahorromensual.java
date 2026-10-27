/*
ALVAREZ RODRIGUEZ GADIEL RAMON
26201024
TECNOLOGICO DE PACHUCA
EJERCICIO AHORRO MENSUAL
29-10-2026
*/
import java.util.Scanner;
public class ahorromensual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INTERES = 0.01;
        double inicial, meta, ahor, sal, inter, tot;
        int plazo, mes, repetir, op, meses;
        do {
            System.out.print("Ahorro inicial: ");
            inicial = scanner.nextDouble();
            System.out.print("Meta de ahorro: ");
            meta = scanner.nextDouble();
            System.out.print("Ahorro mensual: ");
            ahor = scanner.nextDouble();
            while (inicial <= 0 || meta <= 0 || ahor <= 0) {
                System.out.println("Todos los valores deben ser positivos.");
                System.out.print("Ahorro inicial: ");
                inicial = scanner.nextDouble();
                System.out.print("Meta de ahorro: ");
                meta = scanner.nextDouble();
                System.out.print("Ahorro mensual: ");
                ahor = scanner.nextDouble();
            }
            do {
                System.out.println("\n*** PLAZO DE SIMULACION ***");
                System.out.println("1. 6 meses");
                System.out.println("2. 12 meses");
                System.out.println("3. 24 meses");
                System.out.print("Elige el plazo: ");
                op = scanner.nextInt();
                while (op < 1 || op > 3) {
                    System.out.print("Selecciona opcion 1, 2 o 3: ");
                    op = scanner.nextInt();
                }
                switch (op) {
                    case 1:
                        plazo = 6;
                        break;
                    case 2:
                        plazo = 12;
                        break;
                    default:
                        plazo = 24;
                        break;
                }
                sal = inicial;
                tot = 0;
                meses = 0;
                for (mes = 1; mes <= plazo; mes++) {
                    sal = sal + ahor;
                    inter = sal * INTERES;
                    sal = sal + inter;
                    tot = tot + inter;
                    if (meses == 0 && sal >= meta) {
                        meses = mes;
                    }
                }
                System.out.println("\n--- RESULTADO DEL AHORRO ---");
                System.out.printf("Saldo final: $%.2f%n", sal);
                System.out.printf("Intereses generados: $%.2f%n", tot);
                if (sal >= meta) {
                    System.out.println("Meta alcanzada.");
                    if (meses > 0) {
                        System.out.println("Mes en que alcanzo la meta: " + meses);
                    }
                } else {
                    System.out.println("Meta no alcanzada en " + plazo + " meses.");
                }
                System.out.println("\n*** QUE DESEAS HACER? ***");
                System.out.println("1. Elegir otro plazo con el mismo ahorro");
                System.out.println("2. Realizar una nueva simulacion");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                repetir = scanner.nextInt();
                while (repetir < 1 || repetir > 3) {
                    System.out.print("Selecciona opcion 1, 2 o 3: ");
                    repetir = scanner.nextInt();
                }
            } while (repetir == 1);
        } while (repetir == 2);
    }
}