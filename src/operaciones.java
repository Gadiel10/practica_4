/*
ALVAREZ RODRIGUEZ GADIEL RAMON
26201024
TECNOLOGICO DE PACHUCA
EJERCICIO OPERACIONES MATEMATICAS
29-10-2026
*/
import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op, num, i, suma, res;
        do {
            System.out.println("\n*** MENU DE OPERACIONES ***");
            System.out.println("1. Calcular el cuadrado de un numero");
            System.out.println("2. Calcular el cubo de un numero");
            System.out.println("3. Determinar si es par o impar");
            System.out.println("4. Sumar los numeros desde 1 hasta N");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingresa un numero: ");
                    num = scanner.nextInt();

                    if (num > 0) {
                        res = num * num;
                        System.out.println("El cuadrado es: " + res);
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa un numero: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        res = num * num * num;
                        System.out.println("El cubo es: " + res);
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa un numero: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        if (num % 2 == 0) {
                            System.out.println("El numero es par.");
                        } else {
                            System.out.println("El numero es impar.");
                        }
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 4:
                    System.out.print("Ingresa un numero positivo: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        suma = 0;
                        for (i = 1; i <= num; i++) {
                            suma = suma + i;
                        }
                        System.out.println("La suma desde 1 hasta "
                                + num + " es: " + suma);
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Error. La opcion no existe.");
            }
        } while (op != 5);
    }
}