package paquete;

public class Modelo {
    private int[] Vector;
    private int tamaño;
    private int cont;
    private int dato;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    

    public int[] getVector() {
        return Vector;
    }

    public void setVector(int[] Vector) {
        this.Vector = Vector;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    void Crear(){
        Vector = new int[tamaño];
    }
    
    void ingresardatos (){
        Vector [cont] = dato;
    }
}