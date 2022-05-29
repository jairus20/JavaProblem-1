
package CapaNegocio;

public class Alumno {

    // Atributos
    private String nombre;
    private String apellidos;
    private String fechaNac;
    
    //Asociacion-Escuela
    public Escuela escuela;
    
    public Alumno(String n,String a,String f){
        nombre = n;
        apellidos = a;
        fechaNac = f;
    }
    
    //Get-Set
    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {    
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


}
