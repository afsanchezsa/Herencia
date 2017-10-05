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
public class Automovil extends Vehiculo {
    private int cantidadDePuertas;
    public Automovil(int cantidadPuertas, int x){
        super(x);
    this.caballosDeFuerza=cantidadPuertas;
    this.caballosDeFuerza=10;
        System.out.println("constructor hijo");
    }
    @Override
    public void arrancar(){
        System.out.println("sobreescribiendo metodo");
        super.arrancar();
}

}
