/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInstructivo implements ActionListener {
    private Instructivo vista;

    public ControladorInstructivo(Instructivo vista) {
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);  // Centrar la ventana
        this.vista.setVisible(true);

        // Registrar el ActionListener para los botones
        this.vista.getBtnMenuPrincipal().addActionListener(this);
        this.vista.getBtnCrearVector().addActionListener(this);
        this.vista.getBtnMostrarListado().addActionListener(this);
        this.vista.getBtnIngresarDatos().addActionListener(this);
        this.vista.getBtnMostrarMayor().addActionListener(this);
       
    }

    ControladorInstructivo(Vista.Instructivo vista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar cuál botón se presionó
        if (e.getSource() == vista.getBtnMenuPrincipal()) {
            // Acción para el Menú Principal
            System.out.println("Menú Principal seleccionado");
            // Aquí agregas la lógica que desees para este botón

        } else if (e.getSource() == vista.getBtnCrearVector()) {
            // Acción para crear un vector
            System.out.println("Crear Vector seleccionado");
            // Aquí agregas la lógica que desees para este botón

        } else if (e.getSource() == vista.getBtnMostrarListado()) {
            // Acción para mostrar el listado
            System.out.println("Mostrar Listado seleccionado");
            // Aquí agregas la lógica que desees para este botón

        } else if (e.getSource() == vista.getBtnIngresarDatos()) {
            // Acción para ingresar datos
            System.out.println("Ingresar Datos seleccionado");
            // Aquí agregas la lógica que desees para este botón

        } else if (e.getSource() == vista.getBtnMostrarMayor()) {
            // Acción para mostrar el mayor
            System.out.println("Mostrar Mayor seleccionado");
            // Aquí agregas la lógica que desees para este botón

        
    }

    }
}
