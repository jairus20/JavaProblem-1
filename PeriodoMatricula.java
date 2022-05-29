
package CapaNegocio;

import java.util.ArrayList;

public class PeriodoMatricula {
    
    // Atributos
    private String inicio;
    protected String finall;
    
    // Asociacion - Matricula
    public ArrayList<Matricula> sematriculo = new ArrayList();
    public void agregarMatricula(Matricula M){
        sematriculo.add(M);
    }
  

    //Get-Set
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }
    
}
