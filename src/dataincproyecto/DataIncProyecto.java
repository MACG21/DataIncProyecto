/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataincproyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataIncProyecto {
    File archivo; // Creacion del archivo que contendrá los registros de los estudiantes
    Scanner scan = new Scanner(System.in);
    private void crearArchivo(){
        
    archivo = new File("datosEstudiantes.txt"); // El archivo que logré crear fue .txt
        try {
            if (archivo.createNewFile()){
            System.out.println("El archivo se ha creado de manera exitosa"); // El paso inicial para que se cree el archivo dentro de la carpeta del proyecto.
            }
                   
        } catch (IOException ex) {
            System.out.println("Lo sentimos no se pudo crear el archivo"); // En caso de que el archivo no se cree de manera correcta mostrará este mensaje.
        }
    }
    private void escribirEstudiantes(){
       /*Para la creacion de registro de los estudiantes creamos este nuevo método, unicamente logro que los datos 
        a guardar en el archivo fuesen ingresedados desde el código.*/
        try {
            FileWriter escribir = new FileWriter(archivo);
           
           escribir.write("Nombre: panaberto Apellido: Pecopon");
           escribir.write("\r\nCarné:7590-21-3654 Edad: 24 Sexo: Masculino Carrera: Criminología");
           escribir.write("\r\nTotal creditos:15 Cantidad de cursos aprobados:4 Cantidad de cursos reprobados: 1");
                      escribir.close(); 
        } catch (IOException ex) {
            System.out.println("Lo sentimos no se pudo registrar ningún dato"); // En caso de que la escritura no corriera, se mostraría este mensaje.
        }
      }
       
    public static void main(String[] args) {
        DataIncProyecto archivo = new DataIncProyecto();
        
        archivo.crearArchivo(); // De esta forma guardamos los datos escritos en el codigo dentro del archivo.
        archivo.escribirEstudiantes();
               
             DatosEstudiantes registro = new DatosEstudiantes();
        System.out.println("DATA INC\nLECTURA DE DATOS");
        System.out.println("Nombre del estudiante: "+registro.getNombre());
        System.out.println("Apellido del estudiante: "+registro.getApellido());
        System.out.println("Carné: "+registro.getCarne());
        System.out.println("Sexo: "+registro.getSexo());
        System.out.println("Edad: "+registro.getEdad());
        System.out.println("Carrera: "+registro.getCarrera());
        System.out.println("Nombre del estudiante: "+registro.getCant_apro());
        System.out.println("Nombre del estudiante: "+registro.getCant_repro());
        System.out.println("Nombre del estudiante: "+registro.getTotal_cred());
        
        /*Hacemos el llamado de cada una de las variables de la clase de Datos Estudiantes.*/
    }
    
}
