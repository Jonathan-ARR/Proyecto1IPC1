/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author jonar
 */
public class SistemaHospital {
    ArrayList<Paciente> pacientes = new ArrayList<>();
    
    public String registrarPaciente(String nombres, String apellidos, int edad, char sexo, String contrasena) {
        String codigo = generarCodigoUnico();
        Paciente nuevoPaciente = new Paciente(nombres, apellidos, edad, sexo, contrasena, codigo);
        pacientes.add(nuevoPaciente);
        return codigo;
    }

    public boolean iniciarSesion(String codigo, String contrasena) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCodigo().equals(codigo) && paciente.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    private String generarCodigoUnico() {
        // Genera un código único de 6 dígitos
        int codigo = (int)(Math.random() * 1000000);
        for (Paciente paciente : pacientes) {
            if (paciente.getCodigo().equals(String.format("%06d", codigo))) {
                codigo = (int)(Math.random() * 1000000);
            }
        }
        return String.format("%06d", codigo);
    }
    
    private ArrayList<Doctor> doctores = new ArrayList<>();
    private String adminCodigo = "201800994";
    private String adminUsuario = "admin";
    private String adminContrasena = "pro";
    
    public String getAdminCodigo() {
        return adminCodigo;
    }

    public String getAdminContrasena() {
        return adminContrasena;
    }
    
     public boolean iniciarSesionAdmin(String codigo, String contrasena) {
        return adminCodigo.equals(codigo) && adminContrasena.equals(contrasena);
    }
    

    public String crearDoctor(String nombres, String apellidos, String especialidad, String contrasena, char genero, String telefono, int edad) {
        String codigo = generarCodigoUnico();
        Doctor nuevoDoctor = new Doctor(nombres, apellidos, especialidad, contrasena, genero, telefono, edad, codigo);
        doctores.add(nuevoDoctor);
        return codigo;
    }

    public boolean actualizarDoctor(String codigo, String nombres, String apellidos, String especialidad, String contrasena, String telefono, int edad) {
        for (Doctor doctor : doctores) {
            if (doctor.getCodigo().equals(codigo)) {
                doctor.setNombres(nombres);
                doctor.setApellidos(apellidos);
                doctor.setEspecialidad(especialidad);
                doctor.setContrasena(contrasena);
                doctor.setTelefono(telefono);
                doctor.setEdad(edad);
                return true;
            }
        }
        return false;
    }
public boolean eliminarDoctor(String codigo) {
        Iterator<Doctor> iterator = doctores.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.next();
            if (doctor.getCodigo().equals(codigo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    // Otros métodos aquí
private ArrayList<Especialidad> especialidades = new ArrayList<>();

    public void agregarEspecialidad(String nombreEspecialidad) {
        for (Especialidad especialidad : especialidades) {
            if (especialidad.getNombre().equals(nombreEspecialidad)) {
                especialidad.setContador(especialidad.getContador() + 1);
                return;
            }
        }
        especialidades.add(new Especialidad(nombreEspecialidad, 1));
    }

   public ArrayList<Especialidad> obtenerTopEspecialidades() {
    Collections.sort(especialidades, new Comparator<Especialidad>() {
        @Override
        public int compare(Especialidad e1, Especialidad e2) {
            return Integer.compare(e2.getContador(), e1.getContador());
        }
    });
    return new ArrayList<Especialidad>(especialidades.subList(0, Math.min(5, especialidades.size())));
}


    // ...otros métodos y variables...
    
}

