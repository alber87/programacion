
package Ej2;

public class Empleado extends Persona {
    private int anioIngreso;
    private int nDespacho;
    private final int salarioFijo = 1000;
    

    public Empleado(int anioIngreso, int nDespacho, String nombre, String apellidos, int id, String estCivil) {
        super(nombre, apellidos, id, estCivil);
        this.anioIngreso = anioIngreso;
        this.nDespacho = nDespacho;
    }

    public void setnDespacho(int nDespacho) {
        this.nDespacho = nDespacho;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado:" + "\nAño de Ingreso:" + anioIngreso + "\nNúmero de Despacho:" + nDespacho;
    }
    
    public String ImpParcial(){
        return "Nombre:" + super.getNombre() + " \nApellido:" + super.getApellidos() + " \nSalario:";
    }
    
    
}
