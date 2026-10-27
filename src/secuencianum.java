/*
ALVAREZ RODRIGUEZ GADIEL RAMON
26201024
TECNOLOGICO DE PACHUCA
EJERCICIO SECUENCIA NUMERICA
29-10-2026
*/
import java.util.Scanner;
public class secuencianum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DIV4 = 4;
        final int MULT3 = 3;
        final int MULT5 = 5;
        int n, i, mult3, mult5, div, par, impar, suma4;
        int opcion, repetir, continuar;
        do {
            System.out.print("Ingresa un numero positivo: ");
            n = scanner.nextInt();
            while (n <= 0) {
                System.out.print("Error. Ingresa un numero positivo: ");
                n = scanner.nextInt();
            }
            mult3 = 0;
            mult5 = 0;
            div = 0;
            par = 0;
            impar = 0;
            suma4 = 0;
            for (i = 1; i <= n; i++) {
                if (i % DIV4 == 0) {
                    suma4 = suma4 + i;
                }
                if (i % MULT3 == 0) {
                    mult3++;
                }
                if (i % DIV4 == 0 && i % MULT3 == 0) {
                    div++;
                }
                if (i % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                if (i % MULT5 == 0) {
                    mult5++;
                }
            }
            System.out.println("\n*** ESTADISTICAS DEL NUMERO " + n + " ***");
            System.out.println("Suma de numeros divisibles entre 4: " + suma4);
            System.out.println("Cantidad de multiplos de 3: " + mult3);
            System.out.println("Cantidad divisibles entre 4 y 3: " + div);
            do {
                System.out.println("\n*** MENU DE ESTADISTICAS ***");
                System.out.println("1. Numeros pares");
                System.out.println("2. Numeros impares");
                System.out.println("3. Multiplos de 5");
                System.out.print("Elige una opcion: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Numeros pares: ");
                        for (i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println("\nCantidad de numeros pares: " + par);
                        break;
                    case 2:
                        System.out.print("Numeros impares: ");
                        for (i = 1; i <= n; i++) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println("\nCantidad de numeros impares: " + impar);
                        break;
                    case 3:
                        System.out.print("Multiplos de 5: ");
                        for (i = 1; i <= n; i++) {
                            if (i % MULT5 == 0) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println("\nCantidad de multiplos de 5: " + mult5);
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                }
                System.out.println("\n1. Consultar otra estadistica con el mismo numero");
                System.out.println("2. Ingresar otro numero");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                continuar = scanner.nextInt();
                while (continuar < 1 || continuar > 3) {
                    System.out.print("Ingresa 1, 2 o 3: ");
                    continuar = scanner.nextInt();
                }
            } while (continuar == 1);
            repetir = 0;
            if (continuar == 2) {
                repetir = 1;
            }
        } while (repetir == 1);
        System.out.println("Programa finalizado.");
    }
}