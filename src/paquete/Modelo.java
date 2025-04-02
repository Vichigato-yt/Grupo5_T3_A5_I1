

package paquete;

public class Modelo {
    private int[] vector;
    private int tamaño;
    private int dato = 0;

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void crear() {
        vector = new int[tamaño];
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public void ingresarDato(int numero) {
        if (dato < tamaño) {
            vector[dato] = numero;
            dato++;
        }
    }

    public int encontrarMayor() {
        int mayor = vector[0];
        for (int i = 1; i < tamaño; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public String obtenerListado() {
        StringBuilder listado = new StringBuilder();
        for (int i = 0; i < tamaño; i++) {
            listado.append("Posición ").append(i).append(": ").append(vector[i]).append("\n");
        }
        return listado.toString();
    }
}
