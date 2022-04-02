/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgListaPuntos;

/**
 *
 * @author ASHLEY
 */
public class Nodo {
    
    
    
   
    ClsAlumnos dato;
    Nodo enlace;

    //CREA EL CONTRUCTOR PRINCIPAL
   public Nodo(ClsAlumnos alumno){
        dato = new ClsAlumnos(alumno.getNombre(), alumno.getCarnet(), alumno.getPromedio());
        enlace = null;
    }

    
   //crea el nodo y enlaza con el segundo constructor
    public Nodo(ClsAlumnos otro, Nodo n){
        
        dato = new ClsAlumnos(otro.getNombre(), otro.getCarnet(), otro.getPromedio());
        enlace = n; 
    }

    public ClsAlumnos getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}