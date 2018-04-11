
package AlquilerVehiculos;

public class Vehiculo {
    private String matricula;
    private double kmAcumulado;
    private boolean alquilado = false;

    public Vehiculo(String matricula, double kmAcumulado, boolean alquilado) {
        this.matricula = matricula;
        this.kmAcumulado = kmAcumulado;
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", kmAcumulado=" + kmAcumulado + ", alquilado=" + alquilado + '}';
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    public void alquilar(Vehiculo v){
        if(!v.alquilado){
            v.setAlquilado(true);
            System.out.println("El vehículo con matrícula " + v.matricula +
                    " ha sido alquilado con éxito.");
        }
        else
            System.out.println("El vehículo con matrícula " + v.matricula +
                    "ya está alquilado.");
        
    }
    
    public void devolver(Vehiculo v){
        if(v.alquilado){
            v.setAlquilado(false);
            System.out.println("El vehículo con matrícula " + v.matricula +
                    " ha sido devuelto con éxito.");
        }
        else
            System.out.println("El vehiculo con matricula " + v.matricula + 
                    "no se puede devolver porque no ha sido alquilado previamente.");
    }
    
    
    

}


