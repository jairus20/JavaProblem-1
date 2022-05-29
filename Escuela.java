
package CapaNegocio;

import java.util.ArrayList;

public class Escuela {
    
    //Atributos
    private String nombre;
    
    //Asociaciones
    public Escuela(String n){
        nombre = n;
    }
    
    //Asociacion-Alumnos
    public ArrayList<Alumno> estudiante = new ArrayList();
    
    public void agregarAlumno(Alumno a){
        estudiante.add(a);
    }
       
    //Get-Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
