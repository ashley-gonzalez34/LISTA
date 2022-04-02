/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjColecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author ASHLEY
 */
public class EjColecciones {
    
    public void EjListas(){
        //Creamos una lista vacía - LinkedList
        Collection<String> list = new LinkedList<String>();

        list.add("Gredys Salvadoreño");
        list.add("Piedras");
        list.add("del");
        list.add("Rios");


        //Salida de los datos
        System.out.println("La lista tiene = "+list);
        
        list.add("Ultimo");
        list.add("Elemento");
        
        System.out.println("Lista actualizada, con los datos = "+list);
    }


    //Implementar array list


    public void EjArrayList(){
        Collection<Integer> list1 = new ArrayList<>(5);

        list1.add(15);
        list1.add(20);
        list1.add(25);

        //Imprimir los elementos

        for (Integer numero : list1) {
            System.out.println("Numero = " + numero);
        }

        //Creamos otro sin definir el limite de los datos
        Collection<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println("Nuevo arraylist es = "+list2);
    }

    public void EjSet(){
        Collection<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Valor inicial del set1 = "+set1);

        //Eliminar un elemento en particular
        set1.remove(4);
        System.out.println("Valor actualizado set1 = "+set1);

        Collection<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("Elementos set2, que se quitaran = "+set2);

        set1.removeAll(set2);

        System.out.println("Elementos del set1, que quedaron = "+set1);
    }
}

