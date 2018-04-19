
package EjIVA;

public class Tipo7 extends Articulo{
    static final int TIPO = 7;

    public Tipo7(double precio) {
        super("Tipo7", precio);
    }
    
    public String devNombre(){
        return getClass().getSimpleName();
    }
    
    
    @Override
    public int getParteIVA() {
        return TIPO;
    }
    
    @Override
    public double getPrecio(){
        double precioFinal;
        precioFinal = super.getPrecio() + ((super.getPrecio() * TIPO) / 100);
        return precioFinal;   
    }
    
}
