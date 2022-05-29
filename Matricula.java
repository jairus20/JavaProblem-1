
package CapaNegocio;

import java.util.ArrayList;

public class Matricula {
    //Atributos
    private String numMatricula;
    private String sede;
    
    // Asocaciones 
               
    public Matricula(String nm,String s){
        numMatricula = nm;
        sede = s;
    }
    // Asocacion -Facultades
    public ArrayList<Facultades> sematricula = new ArrayList();

    public void agregarFacultad(Facultades F){
        sematricula.add(F);
    }
    
    // Asociaion - PeridoMatricula
    
    public ArrayList<PeriodoMatricula> periodo = new ArrayList();

    public void agregarPerdiodoM(PeriodoMatricula p){
        periodo.add(p);
    }
    
    // Get-Set
    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
       
    
}
