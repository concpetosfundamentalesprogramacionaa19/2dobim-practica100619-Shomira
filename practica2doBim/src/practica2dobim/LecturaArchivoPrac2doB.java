/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2dobim;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FJTAMATTSH
 */
public class LecturaArchivoPrac2doB {
//

    public static void LeerTabla() {
        double goals = 0;
        double heigth = 0;
        int contador = 0;

        try // lee registros del archivo, usando el objeto Scanner
        {
            // Ubicacion del archivo que se desea leer 
            Scanner entrada = new Scanner(new File("data/tabula-FWC_2018_Squad"
                    + "lists_4.txt"));
            //While mientras exista unalinea siguiente en el archivo 
            while (entrada.hasNext()) {
                //Contador que nos permite guardar el numero de lineas 
                contador = contador + 1;
                //Variable que almacena todo lo que se encuentra en la linea 
                String linea = entrada.nextLine();
                //Array que mediante el split nos permite disgregar las columnas
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                // CONVERSION DE las variables String a cadena 
                double goalss = Double.parseDouble(linea_partes.get(11));
                goals = goalss + goals;
                double heigths = Double.parseDouble(linea_partes.get(9));
                heigth = heigth + heigths;

            } // fin de while
            goals = goals / contador;
            heigth = heigth / contador;
            System.out.printf("El promedio de los Goals es de: %.2f \nEl "
                    + "promedio del Heigth es de: %.2f\n", goals, heigth);
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerTabla
    // cierra el archivo y termina la aplicaci�n

} // fin de la clase LeerArchivoTexto
