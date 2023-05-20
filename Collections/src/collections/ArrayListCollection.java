package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
  public static void main(String[] args) {

    // List<Persona> lista;   Declarando sin inicializar
    List<Persona> lista = new ArrayList<Persona>();
    lista.add(new Persona(1, "Roberto", 50));

    // Otra manera de agregar registros
    Persona persona2 = new Persona(2,"Gabriela",43);
    lista.add(persona2);


    lista.add(new Persona(3, "Coconito", 12));
    lista.add(new Persona(4, "Peter Pan", 54));
    lista.add(new Persona(5, "Pica Cu", 52));

    // Recorrer por índíce
    for(int i = 0; i < lista.size(); i++){
      System.out.println(lista.get(i));
    }

    System.out.println("---------------------------------");

    // Recorrer con foreach
    for (Persona people: lista) {
      System.out.println(people);
    }

  }
}
