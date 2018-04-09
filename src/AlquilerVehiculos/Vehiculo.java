
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
    
    public void alquilar(){
        
    }
    
    
    

}


