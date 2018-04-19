
package Figura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PruebaFiguras {
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Figura ultFigura = null;
        
        while(!salir){
            System.out.println("1. Crear Rectángulo");
            System.out.println("2. Crear Cuadrado");
            System.out.println("3. Crear Triángulo");
            System.out.println("4. Ver Figura");
            System.out.println("5. Salir");
            try{
                System.out.print("\nElige la opción deseada: ");
                opcion = sc.nextInt();

                switch(opcion){
                    case 1:
                        System.out.print("Introduce la base: ");
                        double base = sc.nextDouble();
                        System.out.print("Introduce la altura: ");
                        double altura = sc.nextDouble();
                        Rectangulo r = new Rectangulo(base, altura);
                        ultFigura = r;
                        break;
                    case 2:
                        System.out.print("Introduce el lado del cuadrado: ");
                        double lado = sc.nextDouble();
                        Cuadrado c = new Cuadrado(lado);
                        ultFigura = c;
                        break;
                    case 3:
                        System.out.print("Introduce el lado del triangulo: ");
                        double cateto = sc.nextDouble();
                        Triangulo t = new TrianguloRectangulo(cateto);
                        break;
                    case 4:
                        if(ultFigura == null){
                            System.out.println("No se ha creado aún ninguna figura.");
                        }
                        else{
                            System.out.println(ultFigura.devNombFigura());
                            ultFigura.dibujarFigura();
                            System.out.println(ultFigura.devArea());
                            System.out.println(ultFigura.devPerimetro());
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números del 1 al 5.");
                }
            }catch(InputMismatchException e){
                System.out.println("Introduce solamente números.");
                sc.next();
            }      
        }
    }
}
