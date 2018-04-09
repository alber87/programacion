
package AlquilerVehiculos;

public class Furgoneta extends Vehiculo{
    private double capacidad;
    static final double PRECIO_KM = 0.5;

    public Furgoneta(double capacidad, String matricula, double kmAcumulado, boolean alquilado) {
        super(matricula, kmAcumulado, alquilado);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Furgoneta{" + "capacidad=" + capacidad + '}';
    }
    
    public double impTotal(double km){
        double importe = km*PRECIO_KM;
        return importe;
    }
    
    
    
    
    
    
}
