
package EjIVA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Articulo> lista = new ArrayList<Articulo>();
        
        Tipo4 t4 = new Tipo4(25.70);
        lista.add(t4);
        Tipo7 t7 = new Tipo7(12.54);
        lista.add(t7);
        Tipo16 t16 = new Tipo16(54.49);
        lista.add(t16);
        
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Nombre: " + lista.get(i).getNombre());
            System.out.println("Precio Total: " + lista.get(i).getPrecio());
            System.out.println("IVA: " + lista.get(i).getParteIVA() + "%");
            System.out.println();
            
        }
       
        
    }
    
}
