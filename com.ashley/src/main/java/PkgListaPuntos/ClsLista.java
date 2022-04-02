/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgListaPuntos;

import java.util.Scanner;

/**
 *
 * @author ASHLEY
 */
public class ClsLista {
    private static final Scanner alum = new Scanner(System.in);
    
    // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }
public ClsAlumnos ingresarAlumno(){//agrega los alumnos a la lista
        ClsAlumnos alumno;
        
        System.out.println("Ingresa el nombre y apellido: ");
        String nombre = alum.nextLine();
        System.out.println("Ingresa el carnet: ");
        int carnet = Integer.parseInt(alum.nextLine());
        System.out.println("Ingresa su  promedio: ");
        double promedio = Double.parseDouble(alum.nextLine());
        
        return alumno = new ClsAlumnos(nombre, carnet, promedio);
    }
    
    //agrega el alumno
    public ClsLista agregar(ClsAlumnos alumno){
        primero = new Nodo(alumno, primero);
        return this;
    }
    
    
    
    //Visualiza mi lista
    public void verListaEnlazada(){
        Nodo n;
        int k = 0;
        n = primero;
        while(n != null){
            System.out.println(n.dato.getNombre()+" -- "+n.dato.getCarnet()+" -- "+n.dato.getPromedio());
            n = n.enlace;
            k++;
        }
    }
    
    //inserta el nuevo
    public ClsLista insertarCabezaList(){
        Nodo nuevo;
        ClsAlumnos alumno = ingresarAlumno();
        nuevo = new Nodo(alumno);
        
        nuevo.enlace = primero;
        primero = nuevo;
        System.out.println("alumno agregado");
        return this;
    }
   
    
    
    //busca el dato que se ingreso en ese momento
    public Nodo buscarAlumno(ClsAlumnos alumno){
        Nodo indice = null;
        
        for(indice = primero; indice != null; indice = indice.enlace){
            if((alumno.getNombre().equals(indice.dato.getNombre()))
                    &&(alumno.getCarnet() == indice.dato.getCarnet())&&
                    (alumno.getPromedio() == indice.dato.getPromedio())){
                System.out.println("FUE ENCONTRADO");
                System.out.println("Nombre -- "+indice.dato.getNombre());
                System.out.println("Carne -- "+indice.dato.getCarnet());
                System.out.println("Promedio -- "+indice.dato.getPromedio());
                return indice;
            }
        }
        
        return indice;
    }
    
    
    
    //bUSCA Y LO AGREGA DE LA MANERA DONDE SE CREA EL NODO CON SUS DATOS Y ESE ESPACIO QUEDA CON EL NUEVO ALUMNO
    public ClsLista insertarAlumnoLista(ClsAlumnos testigo){
        ClsAlumnos nuevoAlumno = ingresarAlumno();
        Nodo nuevo, anterior;
        anterior = buscarAlumno(testigo);
        if(anterior != null){
            nuevo = new Nodo(nuevoAlumno);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
            System.out.println("Alumno insertado");
        }
        
        return this;
    }
    
    
    //ELIMINA ESE DATO O NODO
    public ClsLista eliminar(ClsAlumnos eliminarAlumno){
        Nodo actual = primero, anterior = null;
        boolean encontrado = false;
        while((actual != null)&&(!encontrado)){
            encontrado = (actual.dato.getNombre().equals(eliminarAlumno.getNombre()) 
                    && (actual.dato.getCarnet() == eliminarAlumno.getCarnet()));
            if(!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
            
            
        }
        
        if(actual != null){
            if(actual.dato.getNombre().equals(primero.dato.getNombre()) && (actual.dato.getCarnet() == primero.dato.getCarnet())){
                primero = actual;
            }
            else{
                anterior.enlace = actual.enlace;
                
            }
            actual = null;
        }
        System.out.println("FUE ELIMINADO CORRECTAMENTE");
        return this;
    }
    //BUSCA LA POSICION EN EL QUE ESTA EL DATO 
    public Nodo buscarPosicionAlumno(ClsAlumnos alumno){
        int i = 0;
        Nodo n = primero;
        
        while(n != null){
            if(alumno.getNombre().equals(n.dato.getNombre()) &&
                    alumno.getCarnet() == n.dato.getCarnet()){
                return n;
            }
            
            n = n.enlace;
            i++;
            
        }
        return n;
    }
    
   
    }   
    
    
    


    
        
