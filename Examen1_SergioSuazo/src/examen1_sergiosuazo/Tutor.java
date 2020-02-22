
package examen1_sergiosuazo;

import java.util.ArrayList;

public class Tutor extends Alumnos{
    private ArrayList<Tutoria> clases=new ArrayList<>();
    private int ganancias,tutorias,nivel;

    public Tutor() {
    }

    public Tutor( int tutorias, int nivel, String nombre, String carrera, String lugar, String user, String contra, int cuenta, int edad) {
        super(nombre, carrera, lugar, user, contra, cuenta, edad);
        this.ganancias = 0;
        this.tutorias = tutorias;
        this.nivel = nivel;
    }

    public ArrayList<Tutoria> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Tutoria> clases) {
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorias() {
        return tutorias;
    }

    public void setTutorias(int tutorias) {
        this.tutorias = tutorias;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void DarTuto() {
        setGanancias(ganancias+270);
        setTutorias(tutorias+1);
    }
    
    
}
