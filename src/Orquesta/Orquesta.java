
package Orquesta;

import java.util.ArrayList;

public class Orquesta {
    private ArrayList<Instrumento> lista;

    public Orquesta(ArrayList lista) {
        this.lista = lista;
    }
    
    public static void afinar(Instrumento i){
        System.out.print("Afinando... ");
        i.tocar();
    }
    
    public void concierto(){
        for (int i=0; i<lista.size(); i++) {
            lista.get(i).tocar();
        }
    }
    
}
