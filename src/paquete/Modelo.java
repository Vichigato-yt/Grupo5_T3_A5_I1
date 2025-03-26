package paquete;

public class Modelo {
    int[] Vector;
    int tamaño;

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
}