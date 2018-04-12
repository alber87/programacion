
package EjITFI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ITFPositivo p = new ITFPositivo();
        ITFNegativo n = new ITFNegativo();
        
        ArrayList<ITFImprimir> lista = new ArrayList<ITFImprimir>();
            lista.add(p);
            lista.add(n);
        
        for (int i=0; i<2; i++) {
            lista.get(i).imprimir();
        }
        
    }
    
}
