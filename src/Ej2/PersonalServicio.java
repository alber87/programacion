
package Ej2;

public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String seccion, int anioIngreso, int nDespacho, String nombre, String apellidos, int id, String estCivil) {
        super(anioIngreso, nDespacho, nombre, apellidos, id, estCivil);
        this.seccion = seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonal de Servicio:" + "\nSeccion=" + seccion;
    }
    
    public String ImpParcial(){
        String name = super.ImpParcial() + calcSalario();
        return name;
    }
    
    public int calcSalario(){
        int salTotal = super.getSalarioFijo();
        if("casado".equalsIgnoreCase(super.getEstCivil())){
            salTotal = salTotal + (int)(salTotal*0.05);
        }
        return salTotal;
    }
    
    
    
}
