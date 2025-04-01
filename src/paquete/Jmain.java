package paquete;

import Vista.Principal;
import Vista.Acerca_de;
import Vista.Instructivo;
import Vista.Crear_Vector;
import Vista.Ingresar_Datos;
import Vista.Mostrar_Mayor;
import Vista.Mostrar_Listado;

public class Jmain {

    public static void main(String[] args) {
        Principal menu = new Principal();
        Acerca_de acerca = new Acerca_de();
        Instructivo instructivo = new Instructivo();
        Crear_Vector crear = new Crear_Vector();
        Ingresar_Datos ingresar = new Ingresar_Datos();
        Mostrar_Mayor mostrarM = new Mostrar_Mayor();
        Mostrar_Listado mostrarL = new Mostrar_Listado();

        Modelo modelo = new Modelo();

        Controlador controlador = new Controlador(acerca, menu, modelo, instructivo, crear, ingresar, mostrarM, mostrarL);

        menu.setVisible(true);
    }
}
