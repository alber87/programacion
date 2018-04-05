
package Ej2;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String curso, String nombre, String apellidos, int id, String estCivil) {
        super(nombre, apellidos, id, estCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante:" + "\nCurso=" + curso;
    }
    
    
    
    
    
}
