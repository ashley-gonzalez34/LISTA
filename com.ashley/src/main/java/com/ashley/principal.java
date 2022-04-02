/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ashley;

import PkgListaPuntos.ClsAlumnos;
import PkgListaPuntos.ClsLista;
import PkgListaPuntos.Nodo;
import java.util.Scanner;

/**
 *
 * @author ASHLEY
 */
public class principal {
     private static final Scanner alum = new Scanner(System.in);
    
    public static void main(String[] args) {
        // EjColecciones col = new EjColecciones();
        // col.EjListas();
        // col.EjArrayList();
        // col.EjSet();

        // ClsEjemplo ej = new ClsEjemplo();
        // ej.ejemplo1();
        

        ClsLista lista = new ClsLista();//instaciamos y creamos lista vacia
        ClsAlumnos al = new ClsAlumnos();
        
        

       
    }

    
    private static ClsAlumnos ingresodeCampoLis() {
        ClsAlumnos datosAlumno = new ClsAlumnos();
        System.out.println("Ingresa nombre y apellido del alumno");
        String nombre = alum.nextLine();
        datosAlumno.setNombre(nombre);
        System.out.println("Ingresa el carnet del alumno");
        int carnet = Integer.parseInt(alum.nextLine());
        datosAlumno.setCarnet(carnet);
        System.out.println("Ingresa el promedio del alumno");
        double promedio = Double.parseDouble(alum.nextLine());
        datosAlumno.setPromedio(promedio);
        
        return datosAlumno;
        }
        
    private static void alumnos(){
        
        
        
   
        
        ClsAlumnos primerAlumno = new ClsAlumnos("Carlos Ramirez",8524,99.9);
        ClsAlumnos SegundoAlumno = new ClsAlumnos("Camila Conzález",8524,99.9);
        ClsAlumnos terceroAlumno = new ClsAlumnos("Rolando Ramirez",8524,99.9);
        ClsAlumnos cuartoAlumno = new ClsAlumnos("Rosa Perez",8524,99.9);
        ClsAlumnos quintoAlumno = new ClsAlumnos("Sofia Castro",8524,99.9);
        
       
        
        ClsLista lista = new ClsLista();
        lista.agregar(primerAlumno);
        lista.agregar(SegundoAlumno);
        lista.agregar(terceroAlumno);
        lista.agregar(cuartoAlumno);
        lista.agregar(quintoAlumno);
        int op = 0;
        do{
            System.out.println(" SALIR 0"
                    + "\n1. Ver datos "
                    + "\n2. Insertar datos a la lista"
                    + "\n3. Buscar alumno "
                    + "\n4. Eliminar alumno ) "
                    + "\nIngresa la opcion: ");
            op = Integer.parseInt(alum.nextLine());
            switch(op){
                case 0:
                    System.out.println("Feliz dia");
                    break;
                case 1:
                    System.out.println("Datos de la lista enlazada");
                    lista.verListaEnlazada();
                    System.out.println("----------------- FINAL ----------------");
                    break;
                case 2:
                    System.out.println("AGREGA LOS  DATOS");
                    lista.insertarCabezaList();
                    System.out.println("----------------- FINAL ----------------");
                    break;
               
                
                case 3:
                    System.out.println("Buscar los alumnos ");
                    ClsAlumnos alumnoBuscar = ingresodeCampoLis();
                    Nodo alumno = lista.buscarAlumno(alumnoBuscar);
                    if(alumno == null){
                        System.out.println("No fue encontrado");
                    }
                    
                    System.out.println("----------------- FINAL ----------------");
                    break;
                case 4:
                    System.out.println("Eliminar los datos del alumno");
                    ClsAlumnos alumnoEliminar = ingresodeCampoLis();
                    lista.eliminar(alumnoEliminar);
                    System.out.println("----------------- FINAL ----------------");
                    break;
                default:
                    System.out.println("\n ERROR EN ALGUN DATO");
            }  
        } while(op !=0);
    }
        
        
            
    
    
    
        
        }
        

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    
        
        
        
        


        
