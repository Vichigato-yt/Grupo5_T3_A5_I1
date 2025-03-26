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
    
    public Controlador(Acerca_de $Acerca,Principal $Principal, Modelo $objModelo,Instructivo $Instructivo,
    Crear_Vector $Crear, Ingresar_Datos $Ingresar,Mostrar_Mayor $MostrarM,Mostrar_Listado $MostrarL) {
        this.$Principal = $Principal;
        this.$Acerca = $Acerca;
        this.$Instructivo = $Instructivo;
        this.$Crear = $Crear;
        this.$Ingresar = $Ingresar;
        this.$MostrarM = $MostrarM;
        this.$MostrarL = $MostrarL;
        this.$objModelo = $objModelo;
        this.$Principal.mCrear.addActionListener(this);
        this.$Principal.mIngresar.addActionListener(this);
        this.$Principal.mMostrarM.addActionListener(this);
        this.$Principal.mMostrarL.addActionListener(this);
        this.$Principal.mSalir.addActionListener(this);
        this.$Principal.mInstructivo.addActionListener(this);
        this.$Principal.mAcercade.addActionListener(this);
        this.$Acerca.btnCerrar.addActionListener(this);
        this.$Instructivo.btnCerrar.addActionListener(this);
        this.$Crear.btnCerrar.addActionListener(this);
        this.$Ingresar.btnCerrar.addActionListener(this);
        this.$MostrarM.btnCerrar.addActionListener(this);
        this.$MostrarL.btnCerrar.addActionListener(this);
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
            this.$Instructivo.setVisible(true);
        }
        if (botonPresionado == this.$Instructivo.btnCerrar) {
            this.$Instructivo.setVisible(false);          
        }
        //Mostrar listado
        if (botonPresionado == this.$Principal.mMostrarL) { 
            this.$MostrarL.setVisible(true);
        }
        if (botonPresionado == this.$MostrarL.btnCerrar) {
            this.$MostrarL.setVisible(false);          
        }
        //Mostrar Mayor
        if (botonPresionado == this.$Principal.mMostrarM) { 
            this.$MostrarM.setVisible(true);
        }
        if (botonPresionado == this.$MostrarM.btnCerrar) {
            this.$MostrarM.setVisible(false);          
        }
        //ingresar datos
        if (botonPresionado == this.$Principal.mIngresar) { 
            this.$Ingresar.setVisible(true);
            this.$Principal.mMostrarL.setEnabled(true);
            this.$Principal.mMostrarM.setEnabled(true);
        }
        if (botonPresionado == this.$Ingresar.btnCerrar) {
            this.$Ingresar.setVisible(false);          
        }
        //crear vector
        if (botonPresionado == this.$Principal.mCrear) { 
            this.$Crear.setVisible(true);
            this.$Principal.mIngresar.setEnabled(true);
            //modelo
            this.$objModelo.setTamaño(Integer.parseInt(txtTamaño));
        }
        if (botonPresionado == this.$Crear.btnCerrar) {
            this.$Crear.setVisible(false);          
        }
        //salir
        if (botonPresionado == this.$Principal.mSalir) {
            System.exit(0);
        }
    }
}
        
