
package Ej2;

public class Profesor extends Empleado {
    private String dpto;

    public Profesor(String dpto, int anioIngreso, int nDespacho, String nombre, String apellidos, int id, String estCivil) {
        super(anioIngreso, nDespacho, nombre, apellidos, id, estCivil);
        this.dpto = dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor:" + "\nDepartamento:" + dpto;
    }
    
    public String impParcial(){
        String name = super.ImpParcial() + calcSalario();
        return name;
    }
    
    public int calcSalario(){
        int salTotal = super.getSalarioFijo();
        if(super.getAnioIngreso()<2000){
            salTotal = salTotal + (int)(super.getSalarioFijo()*0.08);
        }
        return salTotal;
    }
    
    
}
