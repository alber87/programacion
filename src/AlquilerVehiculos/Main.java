
package AlquilerVehiculos;

public class Main {
    public static void main(String[] args) {
        double impTotal;
        Coche c1 = new Coche(false, "1234DFG", 0, false);
        Furgoneta f1 = new Furgoneta(120, "3365JNH", 0, false);
        Moto m1 = new Moto(true, "2547HGN", 0, false);
        
        c1.alquilar(c1);
        f1.alquilar(f1);
        m1.alquilar(m1);
        
        System.out.println();
        
        System.out.println(c1.toString());
        System.out.println(f1.toString());
        System.out.println(m1.toString());
        
        System.out.println();
        
        c1.devolver(c1);
        impTotal = c1.impTotal(120.5);
        System.out.println("Tiene que pagar: " + impTotal + "€");
        
        f1.devolver(f1);
        impTotal = f1.impTotal(500);
        System.out.println("Tiene que pagar: " + impTotal + "€");
        
        m1.devolver(m1);
        impTotal = m1.impTotal(1200);
        System.out.println("Tiene que pagar: " + impTotal + "€");
        
        
    }

   
   
   
   
    
}
