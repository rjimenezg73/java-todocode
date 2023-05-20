package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {

  public static void main(String[] args) {

    List<Persona> listArray = new ArrayList<Persona>();
    listArray.add(new Persona(1, "Roberto", 50));
    listArray.add(new Persona(2, "Gabriela", 43));
    listArray.add(new Persona(3, "Pica Cu", 52));
    listArray.add(new Persona(4, "Coconito", 12));
    listArray.add(new Persona(5, "Peter Pan", 54));


    LinkedList<Persona> listaLinked = new LinkedList<Persona>();
    listaLinked.add(new Persona(1, "Roberto", 50));
    listaLinked.add(new Persona(2, "Gabriela", 43));
    listaLinked.add(new Persona(3, "Pica Cu", 52));
    listaLinked.add(new Persona(4, "Coconito", 12));
    listaLinked.add(new Persona(5, "Peter Pan", 54));

    // Remove en ArrayList
    listArray.remove(2);

    // Remove en LinkedList
    String nomBorrar = "Coconito";
    for (Persona persona2: listaLinked) {
      if(persona2.getNombre().equals(nomBorrar)){
        listaLinked.remove(persona2);
        break;
      }
    }

    System.out.println("---------LUEGO DE ELIMINAR------------");

    System.out.println("-------------ARRAYLIST-----------------");
    for (Persona persona: listArray) {
      System.out.println(persona);
    }

    System.out.println("------------LINKEDLIST------------------");
    for (Persona persona: listaLinked) {
      System.out.println(persona);
    }

  }

}
