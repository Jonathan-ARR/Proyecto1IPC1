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
public class PestañaPacientes {
    private SistemaHospital sistemaHospital;

    public PestañaPacientes(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        // Agrega los componentes para la pestaña de pacientes en panel
        return panel;
    }

    // Otros métodos aquí
}
