/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

/**
 *
 * @author jonar
 */
public class Especialidad {
    private String nombre;
    private int contador;

    public Especialidad(String nombre, int contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
