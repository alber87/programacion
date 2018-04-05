
package Ej2;

public class Persona {
    private String nombre;
    private String apellidos;
    private int id;
    private String estCivil;

    public Persona(String nombre, String apellidos, int id, String estCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estCivil = estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    

    @Override
    public String toString() {
        return "Persona:" + "\nNombre:" + nombre + "\nApellidos:" + apellidos + "\nId:" + id + "\nEstado Civil:" + estCivil;
    }
    
    
}
