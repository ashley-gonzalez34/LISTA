/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgEjemplo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ASHLEY
 */
public class ClsEjemplo {
    
    public void ejemplo1() {
        String[] arreglo = { "Zacarias", "Maria", "Betty", "Fabrizio" };

        List<String> miLista = Arrays.asList(arreglo);
        ImprimirTodo(miLista);

        // ImprimirTodo mi lista

        Collections.sort(miLista);
        System.out.println("Ordenado : " + miLista);
        int donde = Collections.binarySearch(miLista, "Fabrizio");

        System.out.println("Fabrizio esta en " + donde);

        Collections.shuffle(miLista);
        System.out.println("Desordenados : " + miLista);

        System.out.println("Fin");
    }

    public void ImprimirTodo(Collection coll) {
        Iterator iter = coll.iterator();

        while (iter.hasNext()) {
            System.out.println("Elemento=" + iter.next());
        }
    }
    
}
