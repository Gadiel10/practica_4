/*
ALVAREZ RODRIGUEZ GADIEL RAMON
26201024
TECNOLOGICO DE PACHUCA
EJERCICIO NUMEROS AMIGOS
29-10-2026
*/
import java.util.Scanner;
public class numerosamigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int INICIO = 1;
        int num1, num2, i, sum1, sum2;
        int cont1, cont2, op, repet;
        do {
            System.out.print("Ingresa el primer numero positivo: ");
            num1 = scanner.nextInt();
            while (num1 <= 0) {
                System.out.print("Error. Ingresa un numero positivo: ");
                num1 = scanner.nextInt();
            }
            System.out.print("Ingresa el segundo numero positivo: ");
            num2 = scanner.nextInt();
            while (num2 <= 0) {
                System.out.print("Error. Ingresa un numero positivo: ");
                num2 = scanner.nextInt();
            }
            sum1 = 0;
            sum2 = 0;
            cont1 = 0;
            cont2 = 0;
            for (i = INICIO; i < num1; i++) {
                if (num1 % i == 0) {
                    sum1 = sum1 + i;
                    cont1++;
                }
            }
            for (i = INICIO; i < num2; i++) {
                if (num2 % i == 0) {
                    sum2 = sum2 + i;
                    cont2++;
                }
            }
            System.out.println("\n*** MENU DE RESULTADOS ***");
            System.out.println("1. Mostrar las sumas de los divisores");
            System.out.println("2. Mostrar solamente la comparacion");
            System.out.print("Elige una opcion: ");
            op = scanner.nextInt();
            while (op < 1 || op > 2) {
                System.out.print("Selecciona opcion 1 o 2: ");
                op = scanner.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("\nSuma de divisores propios de " + num1 + ": " + sum1);
                    System.out.println("Cantidad de divisores propios: " + cont1);
                    System.out.println("Suma de divisores propios de " + num2 + ": " + sum2);
                    System.out.println("Cantidad de divisores propios: " + cont2);
                    break;
                case 2:
                    System.out.println("\nSe mostrara solamente el resultado.");
                    break;
            }
            if (sum1 == num2 && sum2 == num1) {
                System.out.println(num1 + " y " + num2 + " son numeros amigos.");
            } else {
                System.out.println(num1 + " y " + num2 + " no son numeros amigos.");
            }
            System.out.print("\nDeseas analizar otra pareja? \n1)Si \n2)No: ");
            repet = scanner.nextInt();
            while (repet != 1 && repet != 2) {
                System.out.print("Ingresa 1 para continuar o 2 para salir: ");
                repet = scanner.nextInt();
            }
        } while (repet == 1);
    }
}