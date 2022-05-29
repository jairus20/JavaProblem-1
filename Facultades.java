
package CapaNegocio;

public class Facultades {
    //Atributos
    private String tipo;
    private String vision;
    private String mision;
    private boolean acreditacion;
    
    //Asociacion - Matricula
    public Matricula matriculado;
    
    public Facultades(String t,String v,String m,boolean a){
        tipo=t;
        vision=v;
        mision=m;
        acreditacion=a;
    }
           
    public void agregarMatricula(Matricula M){
        matriculado=M;
    }
    
    //Composicion - Escuela
    public Escuela escuela;
    
    public Facultades(){
        escuela = new Escuela("");
    }
    
    //Get-Set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public boolean isAcreditacion() {
        return acreditacion;
    }

    public void setAcreditacion(boolean acreditacion) {
        this.acreditacion = acreditacion;
    }
    
}
