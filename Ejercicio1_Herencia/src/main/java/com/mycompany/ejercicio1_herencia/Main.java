package com.mycompany.ejercicio1_herencia;

import Clases.Estudiante;
import Clases.Profesor;
import javax.swing.JOptionPane;

/**
 *
 * @author prado Clase Practica Poo
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante oEstudiante = new Estudiante();
        Profesor oProfesor = new Profesor();

        oEstudiante.datosEstudiante();
        oEstudiante.imprimirDatosEstudiante();
        JOptionPane.showMessageDialog(null, "Estado : " + oEstudiante.evaluacion());

        oProfesor.datosDocente();
        oProfesor.imprimirDatosDocente();
        JOptionPane.showMessageDialog(null, "Estado : " + oProfesor.cursosImpartidos());
    }

}
