
package AlquilerVehiculos;


public class Moto extends Vehiculo{
    private boolean casco;
    static final double PRECIO_KM = 0.6;
    static final double SUPLEMENTO = 10;

    public Moto(boolean casco, String matricula, double kmAcumulado, boolean alquilado) {
        super(matricula, kmAcumulado, alquilado);
        this.casco = casco;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "casco=" + casco + '}';
    }
    
    public double impTotal(double km){
        double importe = km*PRECIO_KM;
        if(casco){
            importe = importe + SUPLEMENTO;
        }
        return importe;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }
    
    
    
    

    
    
    
}
