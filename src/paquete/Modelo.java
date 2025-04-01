package paquete;

public class Modelo {
    private int[] vector;
    private int tamaño;

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

    public void ingresarDato(int index, int dato) {
        if (index >= 0 && index < tamaño) {
            vector[index] = dato;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public int obtenerMayor() {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < tamaño; i++) {
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
