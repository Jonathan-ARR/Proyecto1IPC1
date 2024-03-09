/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

import javax.swing.*;
/**
 *
 * @author jonar
 */
public class InterfazAdministrador {
    private SistemaHospital sistemaHospital;
    private JFrame frame;

    public InterfazAdministrador(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;

        frame = new JFrame("Administrador");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        PestañaPacientes pestañaPacientes = new PestañaPacientes(sistemaHospital);
        tabbedPane.addTab("Pacientes", pestañaPacientes.getPanel());

        PestañaProductos pestañaProductos = new PestañaProductos(sistemaHospital);
        tabbedPane.addTab("Productos", pestañaProductos.getPanel());

        PestañaDoctores pestañaDoctores = new PestañaDoctores(sistemaHospital);
        tabbedPane.addTab("Doctores", pestañaDoctores.getPanel());

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       SistemaHospital sistemaHospital = new SistemaHospital();
       new InterfazAdministrador(sistemaHospital);
    }
}

