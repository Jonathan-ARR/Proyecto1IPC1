/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
/**
 *
 * @author jonar
 */
public class InterfazInicioSesion {
    private SistemaHospital sistemaHospital;
    private JFrame frame;
    private JTextField codigo;
    private JPasswordField contrasena;

    public InterfazInicioSesion(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;

        frame = new JFrame("Inicio de Sesión");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(10, 20, 80, 25);
        panel.add(codigoLabel);

        codigo = new JTextField(20);
        codigo.setBounds(100, 20, 165, 25);
        panel.add(codigo);

        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setBounds(10, 60, 80, 25);
        panel.add(contrasenaLabel);

        contrasena = new JPasswordField(20);
        contrasena.setBounds(100, 60, 165, 25);
        panel.add(contrasena);

        JButton iniciarSesionButton = new JButton("Iniciar sesión");
        iniciarSesionButton.setBounds(10, 100, 120, 25);
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = InterfazInicioSesion.this.codigo.getText();
                String contrasena = new String(InterfazInicioSesion.this.contrasena.getPassword());

                // Verifica si las credenciales corresponden al administrador
                if (codigo.equals(sistemaHospital.getAdminCodigo()) && contrasena.equals(sistemaHospital.getAdminContrasena())) {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso.");
                    
                    // Oculta la ventana de inicio de sesión
                    frame.setVisible(false);
                    
                    // Abre la interfaz del administrador
                    new InterfazAdministrador(sistemaHospital);
                } else if (sistemaHospital.iniciarSesion(codigo, contrasena)) {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso.");
                    
                    // Aquí puedes agregar el código para abrir la interfaz del paciente
                } else {
                    JOptionPane.showMessageDialog(frame, "Código o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(iniciarSesionButton);

        JLabel registroLabel = new JLabel("<html><u>No tienes cuenta?, Regístrate</u></html>");
        registroLabel.setBounds(10, 140, 200, 25);
        registroLabel.setForeground(Color.BLUE);
        registroLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registroLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Oculta la ventana de inicio de sesión
                frame.setVisible(false);
                
                // Muestra la ventana de registro
                Proyecto1IPC1.mostrarRegistroPaciente();
            }
        });
        panel.add(registroLabel);
    }
     public void mostrar() {
        frame.setVisible(true);
    }
     public void ocultar() {
        frame.setVisible(false);
    }
}
