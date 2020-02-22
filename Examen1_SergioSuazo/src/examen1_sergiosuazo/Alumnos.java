
package examen1_sergiosuazo;

public abstract class Alumnos {

    String nombre;
    private String carrera, lugar, user, contra;
    private int cuenta,edad;

    public Alumnos() {
    }

    public Alumnos(String nombre, String carrera, String lugar, String user, String contra, int cuenta, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugar = lugar;
        this.user = user;
        this.contra = contra;
        this.cuenta = cuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", carrera=" + carrera + ", lugar=" + lugar + ", user=" + user + ", contra=" + contra + ", cuenta=" + cuenta + ", edad=" + edad + '}';
    }
    
    public abstract void DarTuto();
}
