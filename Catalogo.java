
package CapaNegocio;

import java.util.ArrayList;

public class Catalogo {

    // Atributos
    private int creditaje;
    private String grupo;
    private int numClase;
    private boolean Condicion;
    
    // Asociacion-PlanEstudio 
    public ArrayList <PlanEstudio> fueplan = new ArrayList();
    public void agregarCatalogo(PlanEstudio plani){
        fueplan.add(plani);
    }
    
    //Composicion-Asignatura
    public Asignatura asignatura;
    public Catalogo(){
        asignatura=new Asignatura();
    }
    // Get-Set
    public int getCreditaje() {
        return creditaje;
    }

    public void setCreditaje(int creditaje) {
        this.creditaje = creditaje;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNumClase() {
        return numClase;
    }

    public void setNumClase(int numClase) {
        this.numClase = numClase;
    }

    public boolean isCondicion() {
        return Condicion;
    }

    public void setCondicion(boolean Condicion) {
        this.Condicion = Condicion;
    }

}
