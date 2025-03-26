/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.swing.*;
import java.awt.*;

public class Instructivo extends JFrame {
    // Definición de los botones para las opciones
    private final JButton btnMenuPrincipal;
    private final JButton btnCrearVector;
    private final JButton btnMostrarListado;
    private final JButton btnIngresarDatos;
    private final JButton btnMostrarMayor;
   
    public Instructivo() {
        setTitle("INSTRUCTIVO");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear los botones para las opciones
        btnMenuPrincipal = new JButton("Menú Principal");
        btnCrearVector = new JButton("Crear Vector");
        btnMostrarListado = new JButton("Mostrar Listado");
        btnIngresarDatos = new JButton("Ingresar Datos");
        btnMostrarMayor = new JButton("Mostrar Mayor");
       
        // Crear un JPanel para contener los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 1));  // 5 filas, 1 columna

        // Agregar los botones al panel
        panelBotones.add(btnMenuPrincipal);
        panelBotones.add(btnCrearVector);
        panelBotones.add(btnMostrarListado);
        panelBotones.add(btnIngresarDatos);
        panelBotones.add(btnMostrarMayor);

        // Agregar el panel de botones al JFrame
        add(panelBotones, BorderLayout.CENTER);

    }

    // Métodos para acceder a los botones desde el controlador
    public JButton getBtnMenuPrincipal() {
        return btnMenuPrincipal;
    }

    public JButton getBtnCrearVector() {
        return btnCrearVector;
    }

    public JButton getBtnMostrarListado() {
        return btnMostrarListado;
    }

    public JButton getBtnIngresarDatos() {
        return btnIngresarDatos;
    }

    public JButton getBtnMostrarMayor() {
        return btnMostrarMayor;
    }
}
