
package Figura;

public class Rectangulo implements Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public String devNombFigura() {
        return getClass().getSimpleName();
    }

    @Override
    public double devArea() {
        double area;
        area=this.base*this.altura;
        return area;
    }

    @Override
    public double devPerimetro() {
        double perimetro;
        perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

    @Override
    public void dibujarFigura() {
        for (int i=0; i <this.altura; i++) {
            for (int j=0; j <this.base; j++) {
                System.out.println("*");
            }
        }
    }
    
}
