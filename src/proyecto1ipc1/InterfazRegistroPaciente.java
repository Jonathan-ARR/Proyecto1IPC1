/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

/**
 *
 * @author jonar
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazRegistroPaciente {
    private SistemaHospital sistemaHospital;
    private JFrame frame;
    private JTextField nombres;
    private JTextField apellidos;
    private JTextField edad;
    private JComboBox<String> sexo;
    private JTextField contrasena;

     public InterfazRegistroPaciente(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;

        frame = new JFrame("Registro de Paciente");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nombresLabel = new JLabel("Nombres:");
        nombresLabel.setBounds(10, 20, 80, 25);
        panel.add(nombresLabel);

        nombres = new JTextField(20);
        nombres.setBounds(100, 20, 165, 25);
        panel.add(nombres);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        apellidosLabel.setBounds(10, 60, 80, 25);
        panel.add(apellidosLabel);

        apellidos = new JTextField(20);
        apellidos.setBounds(100, 60, 165, 25);
        panel.add(apellidos);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(10, 100, 80, 25);
        panel.add(edadLabel);

        edad = new JTextField(20);
        edad.setBounds(100, 100, 165, 25);
        panel.add(edad);

        JLabel sexoLabel = new JLabel("Sexo:");
    sexoLabel.setBounds(10, 140, 80, 25);
    panel.add(sexoLabel);

    sexo = new JComboBox<>(new String[] {"Seleccione la opción", "M", "F"});
    sexo.setBounds(100, 140, 165, 25);
    panel.add(sexo);

        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setBounds(10, 180, 80, 25);
        panel.add(contrasenaLabel);

        contrasena = new JTextField(20);
        contrasena.setBounds(100, 180, 165, 25);
        panel.add(contrasena);

        JButton registrarButton = new JButton("Registrar");
registrarButton.setBounds(10, 220, 120, 25);
registrarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String nombres = InterfazRegistroPaciente.this.nombres.getText();
            String apellidos = InterfazRegistroPaciente.this.apellidos.getText();
            int edad = Integer.parseInt(InterfazRegistroPaciente.this.edad.getText());
            String sexo = (String) InterfazRegistroPaciente.this.sexo.getSelectedItem();
            String contrasena = InterfazRegistroPaciente.this.contrasena.getText();

            if (nombres.isEmpty() || apellidos.isEmpty() || contrasena.isEmpty()) {
                throw new IllegalArgumentException("Los campos de nombre, apellido y contraseña no pueden estar vacíos.");
            }
            if (!sexo.equals("M") && !sexo.equals("F")) {
                throw new IllegalArgumentException("El sexo debe ser 'M' o 'F'.");
            }
            if (edad <= 0) {
                throw new IllegalArgumentException("La edad debe ser un número positivo.");
            }

            String codigo = sistemaHospital.registrarPaciente(nombres, apellidos, edad, sexo.charAt(0), contrasena);
            JOptionPane.showMessageDialog(frame, "Paciente registrado con éxito. Código: " + codigo);
            
            // Cierra la ventana de registro
            frame.dispose();
            
            // Abre la ventana de inicio de sesión
            new InterfazInicioSesion(sistemaHospital);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, introduce un número válido para la edad.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
});
panel.add(registrarButton);
    }
    public void mostrar() {
        frame.setVisible(true);
    }

    public void ocultar() {
        frame.setVisible(false);
    }

}


