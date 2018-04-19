
package Figura;


public abstract class Triangulo implements Figura{
    
    private double base, altura;

    public Triangulo(double base, double altura) {
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
        area = (this.base+this.altura)/2;
        return area;
    }

    @Override
    public double devPerimetro() {
        double perimetro, hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        perimetro = this.base + this.altura + hipotenusa;
        return perimetro;
    }

    public double getBase() {
        return base;
    }
    
    
    
}
