
package EjIVA;

public class Tipo16 extends Articulo{
    static final int TIPO = 16;

    public Tipo16(double precio) {
        super("Tipo16", precio);
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
