/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Vehiculo {
    protected int caballosDeFuerza;
    public Vehiculo(int x){
        System.out.println("constructor del padre");    
    this.caballosDeFuerza=x;
    }
    public void arrancar(){
        System.out.println("Arrancar Padre");
    
    }
    public void detener(){
        System.out.println("Detener padre");
    
    }
}
