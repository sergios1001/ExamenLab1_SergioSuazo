
package examen1_sergiosuazo;

import java.util.Date;

public class Tutoria {
    private Tutor tutor;
    private int aula,hora,dia,año;
    private String clase,tema;
    private Date fecha;

    public Tutoria() {
    }

    public Tutoria(Tutor tutor, int aula, String clase, String tema, Date fecha) {
        this.tutor = tutor;
        this.aula = aula;
        this.hora = fecha.getHours();
        this.dia = fecha.getDay();
        this.año = fecha.getYear();
        this.clase = clase;
        this.tema = tema;
        this.fecha = fecha;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "tutor=" + tutor + ", aula=" + aula + ", hora=" + hora + ", dia=" + dia + ", a\u00f1o=" + año + ", clase=" + clase + ", tema=" + tema + ", fecha=" + fecha + '}';
    }
    
    
}
