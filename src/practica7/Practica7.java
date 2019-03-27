/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Francisco José Gordo Salguero
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int metodo;

        do {
            
            menu_opciones();
            metodo = menu_switch();
        } while (metodo != 4);
        
        System.out.println("---------------------------- "
                + "\n\n Cartelera de Cinefbmoll \n\n "
                + "----------------------------");
    }

    static void menu_opciones() {
        System.out.println("Elija una de las opciones siguientes");
        System.out.println("1. Lectura y escritura del fichero de cartelera"
                + "byte a byte");
        System.out.println("2. Lectura y escritura del fichero de cartelera"
                + "caracter a caracter");
        System.out.println("3. Lectura y escritura del fichero linea a linea"
                + "con buffers");
        System.out.println("4. Salir");
        System.out.print("Opción elegida: ");
    }

    public static int menu_switch() throws IOException {
        Scanner read = new Scanner(System.in);
        int metodo = read.nextInt();
        
        switch (metodo) {
            case 1:
                LecturayEscritura_byteabyte.leer_escribir();
                break;
            case 2:
                //LecturayEscritura_caracteracaracter();
                break;
            case 3:
                //LecturayEscritura_lineaalineabuffer();
                break;
            case 4:
                break;
            default:
                System.out.println("Eleccion erronea");
                break;
        }
        return metodo;
    }
    
    

}
