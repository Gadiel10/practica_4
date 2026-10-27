/*
ALVAREZ RODRIGUEZ GADIEL RAMON
26201024
TECNOLOGICO DE PACHUCA
EJERCICIO COMPETENCIA DE RESISTENCIA
29-10-2026
*/
import java.util.Scanner;
public class competencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RONDAS = 5;
        final double BAJO = 2.0;
        final double MEDIO = 4.0;
        int partici, p, r, bajo, medio, alto, op, repet, mejor;
        double distan, tot, prom, mayor, totGeneral;
        do {
            System.out.print("Cantidad de participantes: ");
            partici = scanner.nextInt();
            while (partici <= 0) {
                System.out.print("Error. Ingresa una cantidad positiva: ");
                partici = scanner.nextInt();
            }
            mayor = -1;
            mejor = 0;
            totGeneral = 0;
            bajo = 0;
            medio = 0;
            alto = 0;
            for (p = 1; p <= partici; p++) {
                tot = 0;
                System.out.println("\n*** PARTICIPANTE " + p + " ***");
                for (r = 1; r <= RONDAS; r++) {
                    System.out.print("Distancia de la ronda " + r + " en km: ");
                    distan = scanner.nextDouble();
                    while (distan < 0) {
                        System.out.print("Error. La distancia debe ser mayor o igual a cero: ");
                        distan = scanner.nextDouble();
                    }
                    tot = tot + distan;
                    if (distan < BAJO) {
                        bajo++;
                        System.out.println("Rendimiento bajo.");
                    } else if (distan <= MEDIO) {
                        medio++;
                        System.out.println("Rendimiento medio.");
                    } else {
                        alto++;
                        System.out.println("Rendimiento alto.");
                    }
                }
                prom = tot / RONDAS;
                totGeneral = totGeneral + tot;
                System.out.println("Distancia total: " + tot + " km");
                System.out.println("Promedio por ronda: " + prom + " km");
                if (tot > mayor) {
                    mayor = tot;
                    mejor = p;
                }
            }
            System.out.println("\n*** ESTADISTICAS GENERALES ***");
            System.out.println("1. Distancia total de todos los participantes");
            System.out.println("2. Cantidad de rondas por rendimiento");
            System.out.println("3. Participante con mayor distancia acumulada");
            System.out.print("Elige una opcion: ");
            op = scanner.nextInt();
            while (op < 1 || op > 3) {
                System.out.print("Selecciona opcion 1, 2 o 3: ");
                op = scanner.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("Distancia total general: "
                            + totGeneral + " km");
                    break;
                case 2:
                    System.out.println("Rondas de rendimiento bajo: " + bajo);
                    System.out.println("Rondas de rendimiento medio: " + medio);
                    System.out.println("Rondas de rendimiento alto: " + alto);
                    break;
                case 3:
                    System.out.println("Participante con mayor distancia: " + mejor);
                    System.out.println("Distancia acumulada: " + mayor + " km");
                    break;
            }
            System.out.print("\nDeseas registrar otra competencia? \n1)Si \n2)No) ");
            repet = scanner.nextInt();
            while (repet != 1 && repet != 2) {
                System.out.print("Ingresa 1 para repetir o 2 para salir: ");
                repet = scanner.nextInt();
            }
        } while (repet == 1);
    }
}
