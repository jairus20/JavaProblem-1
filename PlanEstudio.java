package CapaNegocio;

import java.util.ArrayList;

public class PlanEstudio {
 
    // Atributos
    private String codigo;
    private String escuela;
    
    // Asociacion-Escuela
    public PlanEstudio(String c,String e){
        codigo=c;
        escuela=e;
    }
    
    // Asociacion-Catalogo 
    public ArrayList <Catalogo> catalogado = new ArrayList();
    public void agregarCatalogo(Catalogo cat){
        catalogado.add(cat);
    }
    // Get-Set

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
