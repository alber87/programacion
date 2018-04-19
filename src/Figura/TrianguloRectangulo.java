
package Figura;

public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(double cateto) {
        super(cateto, cateto);
    }    
    
    
    @Override
    public void dibujarFigura() {
        for (int i=0; i<this.getBase(); i++) {
            for (int j=0; j<i; j++) {
                System.out.println("*");
            }
            System.out.println("*");
        }
    }
    
    
    
}
