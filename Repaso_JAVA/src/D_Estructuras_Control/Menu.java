package D_Estructuras_Control;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú:\n1. Imprimir 1 a 5\n2. Imprimir pares del 1 al 10\n3. Salir\nElige una opción:"));

            switch (opcion) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    int i = 1;
                    while (i <= 10) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 3);
    }
}

