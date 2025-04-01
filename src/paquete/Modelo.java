
package paquete;


public class Modelo {
    private int[] Vector;
    private int tamaño;

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
    void crear(){
        Vector=new int[tamaño];
    }
    
}
