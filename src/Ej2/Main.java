
package Ej2;

import Ej2.Estudiante;
import Ej2.PersonalServicio;
import Ej2.Profesor;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("DAW", "Queren", "Pacheco Castro", 1, "Soltera");
        Estudiante e2 = new Estudiante("DAW", "Noelia", "Calvo Martín", 2, "Soltera");
        
        Profesor p1 = new Profesor("Programación", 1999, 3, "Lorena", "ape1 ape2", 3, "Casada");
        Profesor p2 = new Profesor("Sistemas", 1989, 5, "Juan Pablo", "ape1 ape2", 4, "Casado");
        
        PersonalServicio ps1 = new PersonalServicio("Cafeteria", 2005, 6, "Pepita", "Flor Rojas", 5, "Viuda");
        PersonalServicio ps2 = new PersonalServicio("Secretaria", 1980, 0, "Paca", "Rojas Vacas", 6, "Tiene Gatos");
        PersonalServicio ps3 = new PersonalServicio("Conserje", 1980, 9, "Rogelio", "Camino Seco", 6, "Casado");
        
        System.out.println(e1.toString());
        System.out.println();
        System.out.println(e2.toString());
        System.out.println();
        
        System.out.println(p1.impParcial());
        System.out.println(p1.toString());
        System.out.println();
        
        System.out.println(p2.impParcial());
        System.out.println(p2.toString());
        System.out.println();
        
        System.out.println(ps1.ImpParcial());
        System.out.println(ps1.toString());
        System.out.println();
        
        System.out.println(ps2.ImpParcial());
        System.out.println(ps2.toString());
        System.out.println();
        
        System.out.println(ps3.ImpParcial());
        System.out.println(ps3.toString());
        System.out.println();

    }   
}
