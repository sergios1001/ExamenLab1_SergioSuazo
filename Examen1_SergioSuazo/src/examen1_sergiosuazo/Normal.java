
package examen1_sergiosuazo;

import java.util.ArrayList;
import java.util.Random;



public class Normal extends Alumnos{
    Random rand=new Random();
    private int nivel,conocimiento;
    private ArrayList<Examen> examenes=new ArrayList<Examen>();
    private ArrayList<Examen> examenesPasados=new ArrayList<Examen>();

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

    public ArrayList<Examen> getExamenesPasados() {
        return examenesPasados;
    }

    public void setExamenesPasados(ArrayList<Examen> examenesPasados) {
        this.examenesPasados = examenesPasados;
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

    @Override
    public void DarTuto() {
        int r=1+rand.nextInt(99);
        setConocimiento(conocimiento + r);
    }
    
}
