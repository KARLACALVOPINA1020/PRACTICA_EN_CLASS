/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.primer_programa;

/**
 *
 * @author HP
 */
public class Estudiante 
{
    public int idEstudiante;
    public String nombre;
    public float calProm; 
    
    public boolean inscribirse(){
        System.out.println("Estudiante"+nombre+"inscrito");
        return true; 
    }
    public boolean retirarse(){
        System.out.println("Estudiante "+nombre+"retirado");
        return true; 
    }
}
  private - 


