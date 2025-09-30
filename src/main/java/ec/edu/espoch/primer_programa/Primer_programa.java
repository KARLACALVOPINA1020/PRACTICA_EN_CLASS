/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.primer_programa;

/**
 *
 * @author HP
 */
public class Primer_programa {

    public static void main(String[] args) {
       Estudiante estudiante1 = new Estudiante();
       estudiante1.idEstudiante = 2;
       estudiante1.nombre = "Carola";
       estudiante1.calProm = 3;
       
        Clase clase1 = new Clase();
        clase1.idclase = 3;
        clase1.nombreclase = "Jialin";
        
        estudiante1.inscribirse();
        clase1.AgregarEstudiante(estudiante1.idEstudiante);
        estudiante1.retirarse();
        clase1.EliminarEstudiante(estudiante1.idEstudiante);
        
    }
    
}
