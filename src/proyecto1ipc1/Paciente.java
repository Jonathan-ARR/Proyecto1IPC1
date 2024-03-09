/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

/**
 *
 * @author jonar
 */
public class Paciente {
     private String nombres;
    private String apellidos;
    private int edad;
    private char sexo;
    private String contrasena;
    private String codigo;

    public String getCodigo() {
        return this.codigo;
    }

    public String getContrasena() {
        return this.contrasena;
    }
    public Paciente(String nombres, String apellidos, int edad, char sexo, String contrasena, String codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.contrasena = contrasena;
        this.codigo = codigo;
    }
    
}
