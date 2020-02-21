
package examen1_sergiosuazo;

import java.util.ArrayList;

public class Normal extends Alumnos{
    private int nivel,conocimiento;
    private ArrayList<Examen> examenes=new ArrayList<Examen>();

    public Normal() {
    }

    public Normal(int nivel, int conocimiento, String nombre, String carrera, String lugar, String user, String contra, int cuenta, int edad) {
        super(nombre, carrera, lugar, user, contra, cuenta, edad);
        this.nivel = nivel;
        this.conocimiento = conocimiento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Normal{" + "nivel=" + nivel + ", conocimiento=" + conocimiento + ", examenes=" + examenes + '}';
    }
    
}