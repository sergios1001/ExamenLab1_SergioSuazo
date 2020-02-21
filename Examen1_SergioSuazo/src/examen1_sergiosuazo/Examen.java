
package examen1_sergiosuazo;

public class Examen {
    private String clase,tema;
    private int conocimiento,puntaje;

    public Examen() {
    }

    public Examen(String clase, String tema, int puntaje) {
        this.clase = clase;
        this.tema = tema;
        this.conocimiento = 0;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examen{" + "clase=" + clase + ", tema=" + tema + ", conocimiento=" + conocimiento + ", puntaje=" + puntaje + '}';
    }
    
}
