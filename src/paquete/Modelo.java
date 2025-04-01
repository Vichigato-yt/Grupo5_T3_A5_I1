/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Integer> vector;
    
    public Modelo() {
        vector = new ArrayList<>();
    }
    
    public void crearVector(int tamaño) {
        vector = new ArrayList<>(tamaño);
    }
    
    public void ingresarDato(int dato) {
        vector.add(dato);
    }
    
    public List<Integer> obtenerListado() {
        return vector;
    }
    
    public int obtenerMayor() {
        if (vector.isEmpty()) return Integer.MIN_VALUE;
        int mayor = vector.get(0);
        for (int num : vector) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }
}