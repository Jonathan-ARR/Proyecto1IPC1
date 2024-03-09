/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1ipc1;


/**
 *
 * @author jonar
 */
public class Proyecto1IPC1 {

    private static SistemaHospital sistemaHospital;
    private static InterfazInicioSesion interfazInicioSesion;
    private static InterfazRegistroPaciente interfazRegistroPaciente;

    public static void main(String[] args) {
        sistemaHospital = new SistemaHospital();
        interfazInicioSesion = new InterfazInicioSesion(sistemaHospital);
        
        // Muestra la interfaz de inicio de sesión
        mostrarInicioSesion();
    }

    public static void mostrarInicioSesion() {
        interfazInicioSesion.mostrar();
        if (interfazRegistroPaciente != null) {
            interfazRegistroPaciente.ocultar();
        }
    }

    public static void mostrarRegistroPaciente() {
        // Interfaz de registro de pacientes solo cuando sea necesario
        if (interfazRegistroPaciente == null) {
            interfazRegistroPaciente = new InterfazRegistroPaciente(sistemaHospital);
        }
        interfazRegistroPaciente.mostrar();
        interfazInicioSesion.ocultar();
    }
}





    
    

