
package EjIVA;


public class Tipo4 extends Articulo{
    static final int TIPO = 4;

    public Tipo4(double precio) {
        super("Tipo4", precio);
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
