/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataincproyecto;

/**
 *
 * @author Admin
 */
public class DatosEstudiantes {
    private String nombre, apellido, carrera, carne, sexo; //declaramos las variables necesarias.
    private String edad, total_cred, cant_apro, cant_repro; /* la variable total_cred hace referencia al total de los creditos del curso
    al igual que la variable cant_apro son la cantidad de cursos aprovados*/
    
    public String getNombre()
   {
       nombre = "Panaberto";
      return nombre; 
   }
    public String getApellido()
   {
       apellido = "Pecopon";
      return apellido; 
   }
    public String getCarrera()
   {
       carrera= "Criminología";
      return carrera; 
   }public String getCarne()
   {
       carne="7590-21-3654";
      return carne; 
   }
   public String getSexo()
   {
       sexo="Masculino";
      return sexo; 
   }
   public String getEdad()
   {
       edad="24 Años";
      return edad; 
   }
   public String getTotal_cred()
   {
       total_cred="15";
      return total_cred; 
   }
   public String getCant_apro()
   {
       cant_apro="4";
      return cant_apro; 
   }
   public String getCant_repro()
   {
       cant_repro="1";
               return cant_repro;
   }
   /*Para este caso unicamente pude agregar directamente los valores a las variables en esta clase y posteriormente
   llamarlas en la clase principal del proyecto en general.
   */
   }
