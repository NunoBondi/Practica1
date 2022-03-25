/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author prado
 */
public class Estudiante extends Persona{
    public int notaFinal;

    public Estudiante() {
        super();
    }

    public Estudiante(int notaFinal, String nombre, String apellido, String sexo) {
        super(nombre, apellido, sexo);
        this.notaFinal = notaFinal;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void datosEstudiante(){
    notaFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota final: "));
    this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante:");
    this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del Estudiante:");
    this.sexo = JOptionPane.showInputDialog("Ingrese el sexo del Estudiante:");
    }
    public String evaluacion(){
        if(notaFinal>=60){
            return "Aprobado";
        }
        else
            return "Reprobado";
    }
        public void imprimirDatosEstudiante(){
        
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido : " + apellido + "\nSexo: " + sexo + "\nNota final: " + notaFinal);
        
    }
}
