/*
 * Realizar algoritmo que permita ingresar personal a una agenda del tamaño ingresado por consola, 
 * comparar el nombre y decir en que ubicación del vector se encuentra.
 */
package agenda;

import java.util.*;

/**
 *
 * @author Jorge
 */
public class Agenda {

    int f;

    public String[] llenar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad de personas  a agendar");
        f = sc.nextInt();
        String vec[] = new String[f];

        for (int i=0;i<f;i++) {

            System.out.print("Introduzca su nombre: ");
            String nombre = sc.next();

            vec[i] = nombre;
        }
        return vec;
    }

    public void consultar_posicion(String vec[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre del cual desea ubicar la posicion: ");
        String nombre = sc.next();

        for (int i=0;i<f;i++) {
            if (nombre.equalsIgnoreCase(vec[i])) {
                System.out.println("El nombre esta en la pocision : "+(i+1));
            } else {
                System.out.println("no esta la posicion : " +(i+1));
            }
        }
    }

    public static void main(String[] args) {

        Agenda objAgenda = new Agenda();
        String vec[] = objAgenda.llenar();
        objAgenda.consultar_posicion(vec);

    }//Finaliza el main
}
