
package AlquilerVehiculos;

public class Coche extends Vehiculo{
    private boolean extras;
    static final double PRECIO_KM = 0.4;
    static final double SUPLEMENTO = 20;

    public Coche(boolean extras, String matricula, double kmAcumulado, boolean alquilado) {
        super(matricula, kmAcumulado, alquilado);
        this.extras = extras;
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" + "extras=" + extras + '}';
    }
    
    public double impTotal(double km){
         double importe = km*PRECIO_KM;
         if(extras){
             importe = importe + SUPLEMENTO;
         }
         return importe;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }
    
    public void alquilar(){
        
    }
    
    
    
    
    
}
