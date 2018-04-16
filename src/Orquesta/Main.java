
package Orquesta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> lista = new ArrayList<Instrumento>();
        
        Viento flauta = new Viento();
        Cuerda violin = new Cuerda();
        Percusion bombo = new Percusion();
        
        lista.add(flauta);
        lista.add(violin);
        lista.add(bombo);
        
        
        for (int i=0; i<lista.size(); i++) {
            Orquesta.afinar(lista.get(i));
           
        }
        
        Orquesta o = new Orquesta(lista);
        
        System.out.println("¡EMPIEZA EL CONCIERTAZO!");
        
        o.concierto();
        
        
        
    }
}
