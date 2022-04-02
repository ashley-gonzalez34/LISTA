/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgListaPuntos;

/**
 *
 * @author ASHLEY
 */
public class ClsAlumnos {
    
     
    private int carnet;
    private String nombre;
    private double promedio;
    
    public ClsAlumnos(String nom,int carne,double promed){
        nombre = nom;
        carnet = carne;
        promedio = promed;
    }
    public ClsAlumnos(){
        
    }
    /**
     * @return the carnet
     */
    public int getCarnet() {//permitira modificar fuera de clase
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(int carnet) {//
        this.carnet = carnet;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    
}
}

