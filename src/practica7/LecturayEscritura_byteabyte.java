/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class LecturayEscritura_byteabyte {

    public static void leer_escribir() throws FileNotFoundException, IOException {

        int caracter_bite;
        String ruta_salida = "C:\\Users\\Usuario\\Desktop\\Diversas cosas\\1ro Desarrollo de Aplicaciones Web\\Programación\\Java\\Prácticas\\Practica7\\Texto_Practica7_salida.txt";
        String ruta_entrada = "C:\\Users\\Usuario\\Desktop\\Diversas cosas\\1ro Desarrollo de Aplicaciones Web\\Programación\\Java\\Prácticas\\Practica7\\Texto_Practica7_entrada.txt";
        FileInputStream fichero_salida;
        FileOutputStream fichero_entrada;

        //Leer bytes hasta que se encuentre el EOF
        //EOF es un concepto para determinar el final de un archivo
        fichero_salida = new FileInputStream(ruta_salida);
        fichero_entrada = new FileOutputStream(ruta_entrada);

        try {

            do {
                caracter_bite = fichero_salida.read();
                if (caracter_bite != -1) {
                    if ((char) caracter_bite == '#') {
                        fichero_entrada.write(
                 System.getProperty("line.separator").getBytes());
                    } else {
                       fichero_entrada.write(caracter_bite);
                    }
                }
            } while (caracter_bite != -1); //Cuando caracter_bite es igual a -1,
            //se ha alcanzado el final del archivo
        } catch (java.io.FileNotFoundException exc) {
            System.out.println("Archivo no encontrado");
        } catch (IOException exc) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {

                fichero_salida.close();
                //Cerrar el archivo
            } catch (IOException exc) {
                System.out.println("Error cerrando el archivo.");
            }

        }
    }
}
