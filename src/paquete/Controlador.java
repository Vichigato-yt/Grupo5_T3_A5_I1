/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
//importo el menu principal
import Vista.Principal;
//importo los JPanel del menu AYUDA
import Vista.Acerca_de;
import Vista.Instructivo;
//Importo los jPanel del menu OPCIONES
import Vista.Crear_Vector;
import Vista.Ingresar_Datos;
import Vista.Mostrar_Mayor;
import Vista.Mostrar_Listado;
//importo ActionEvent
import java.awt.event.ActionEvent;
//importo ActionListener para poder escuchar lo que hace
import java.awt.event.ActionListener;
    
public class Controlador implements ActionListener{
    //se encarga de recibir desde la vista y enviar al modelo
    //ATRIBUTOS
    //Objeto Vista para la Vista MVC
    private Principal $Principal;
    private Acerca_de $Acerca;
    private Instructivo $Instructivo;
    private Crear_Vector $Crear;
    private Ingresar_Datos $Ingresar;
    private Mostrar_Mayor $MostrarM;
    private Mostrar_Listado $MostrarL;
    
    //Objeto Modelo para el Modelo MVC
    private Modelo $objModelo;
    String r;
    
    public Controlador(Acerca_de $Acerca,Principal $Principal, Modelo $objModelo) {
        this.$Principal = $Principal;
        this.$Acerca = $Acerca;
        this.$objModelo = $objModelo;
        this.$Principal.mCrear.addActionListener(this);
        this.$Principal.mIngresar.addActionListener(this);
        this.$Principal.mMostrarM.addActionListener(this);
        this.$Principal.mMostrarL.addActionListener(this);
        this.$Principal.mSalir.addActionListener(this);
        this.$Principal.mInstructivo.addActionListener(this);
        this.$Principal.mAcercade.addActionListener(this);
        this.$Acerca.btnCerrar.addActionListener(this);
    } 

   
@Override
    public void actionPerformed(ActionEvent e){
        Object botonPresionado = e.getSource();
        //frmAcercade
        if (botonPresionado == this.$Principal.mAcercade) { 
            this.$Acerca.setVisible(true);
        }
        if (botonPresionado == this.$Acerca.btnCerrar) {
            this.$Acerca.setVisible(false);          
        }
        //Instructivo
        if (botonPresionado == this.$Principal.mInstructivo) { 
            this.$Acerca.setVisible(true);
        }
        
        if (botonPresionado == this.$Principal.mMostrarL) { 
            this.$Acerca.setVisible(true);
        }
        if (botonPresionado == this.$Principal.mMostrarM) { 
            this.$Acerca.setVisible(true);
        }
        if (botonPresionado == this.$Principal.mIngresar) { 
            this.$Acerca.setVisible(true);
        }
        if (botonPresionado == this.$Principal.mCrear) { 
            this.$Acerca.setVisible(true);
        }
        if (botonPresionado == this.$Principal.mSalir) {
            System.exit(0);
        }
    }
}
        
