/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

/**
 *
 * @author jonar
 */
public class Doctor {
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String contrasena;
    private char genero;
    private String telefono;
    private int edad;
    private String codigo;

    public Doctor(String nombres, String apellidos, String especialidad, String contrasena, char genero, String telefono, int edad, String codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.contrasena = contrasena;
        this.genero = genero;
        this.telefono = telefono;
        this.edad = edad;
        this.codigo = codigo;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
}
