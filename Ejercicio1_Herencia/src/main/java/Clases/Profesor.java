
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author prado
 */
public class Profesor extends Persona{
    public int cantCursos;

    public Profesor() {
        super();
    }

    public Profesor(int cantCursos, String nombre, String apellido, String sexo) {
        super(nombre, apellido, sexo);
        this.cantCursos = cantCursos;
    }

    public int getCantCursos() {
        return cantCursos;
    }

    public void setCantCursos(int cantCursos) {
        this.cantCursos = cantCursos;
    }

    public void datosDocente(){
    cantCursos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cursos del docente: "));
    this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del Docente:");
    this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del Docente:");
    this.sexo = JOptionPane.showInputDialog("Ingrese el sexo del Docente:");
    }
    
    public String cursosImpartidos(){
        if(cantCursos > 4){
            return "Excede";
        }
        else
            return "No excede";
    }
    
    public void imprimirDatosDocente(){
        
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido : " + apellido + "\nSexo: " + sexo + "\nCantidad de cursos impartidos: " + cantCursos);
        
    }
}
