/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1ipc1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jonar
 */
public class PestañaDoctores {
    private SistemaHospital sistemaHospital;
    private JPanel panel;

    public PestañaDoctores(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;

        panel = new JPanel();
        panel.setLayout(new BorderLayout());  // Establece un LayoutManager

        // Crea la tabla con el listado de doctores
        String[] columnNames = {"Código", "Nombre Completo", "Género", "Edad", "Especialidad", "Teléfono"};
        Object[][] data = {
            // Aquí debes agregar los datos de los doctores
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Crea el panel con los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));  // Establece un LayoutManager

       JButton botonCrear = new JButton("Crear Doctor");
        botonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCrear = new JFrame("Crear Doctor");
                frameCrear.setSize(300, 200);
                frameCrear.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameCrear.setLayout(new GridLayout(8, 2));  // Establece un LayoutManager

                // Agrega los componentes para registrar a un nuevo doctor en frameCrear
                frameCrear.add(new JLabel("Nombres"));
                frameCrear.add(new JTextField());
                frameCrear.add(new JLabel("Apellidos"));
                frameCrear.add(new JTextField());
                frameCrear.add(new JLabel("Especialidad"));
                frameCrear.add(new JTextField());
                frameCrear.add(new JLabel("Contraseña"));
                frameCrear.add(new JPasswordField());
                frameCrear.add(new JLabel("Género"));
                frameCrear.add(new JComboBox(new String[] {"M", "F"}));
                frameCrear.add(new JLabel("Teléfono (Opcional)"));
                frameCrear.add(new JTextField());
                frameCrear.add(new JLabel("Edad"));
                frameCrear.add(new JTextField());

                JButton botonRegistrar = new JButton("Registrar");
                botonRegistrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Registra al doctor en el sistema
                        // Muestra un mensaje de confirmación
                        // Genera el código único del doctor
                        // Vuelve a visualizar la pantalla principal del módulo del administrador
                    }
                });
                frameCrear.add(botonRegistrar);

                frameCrear.setVisible(true);
            }
        });
        panelBotones.add(botonCrear);

        JButton botonActualizar = new JButton("Actualizar Doctor");
botonActualizar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frameActualizar = new JFrame("Actualizar Doctor");
        frameActualizar.setSize(300, 200);
        frameActualizar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameActualizar.setLayout(new GridLayout(9, 2));  // Establece un LayoutManager

        // Solicita el código del doctor que se desea actualizar
        frameActualizar.add(new JLabel("Código"));
        JTextField campoCodigo = new JTextField();
        frameActualizar.add(campoCodigo);

        // Agrega los componentes para actualizar los datos del doctor en frameActualizar
        frameActualizar.add(new JLabel("Nombres"));
        frameActualizar.add(new JTextField());
        frameActualizar.add(new JLabel("Apellidos"));
        frameActualizar.add(new JTextField());
        frameActualizar.add(new JLabel("Especialidad"));
        frameActualizar.add(new JTextField());
        frameActualizar.add(new JLabel("Contraseña"));
        frameActualizar.add(new JPasswordField());
        frameActualizar.add(new JLabel("Género"));
        frameActualizar.add(new JComboBox(new String[] {"M", "F"}));
        frameActualizar.add(new JLabel("Teléfono (Opcional)"));
        frameActualizar.add(new JTextField());
        frameActualizar.add(new JLabel("Edad"));
        frameActualizar.add(new JTextField());

        JButton botonRegistrar = new JButton("Actualizar");
        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí debes agregar el código para actualizar los datos del doctor
            }
        });
        frameActualizar.add(botonRegistrar);

        frameActualizar.setVisible(true);
    }
});
panelBotones.add(botonActualizar);  // Aquí debes agregar botonActualizar, no botonEliminar

  JButton botonEliminar = new JButton("Eliminar Doctor");
botonEliminar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frameEliminar = new JFrame("Eliminar Doctor");
        frameEliminar.setSize(300, 200);
        frameEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameEliminar.setLayout(new GridLayout(3, 2));  // Establece un LayoutManager

        // Solicita el código del doctor que se desea eliminar
        frameEliminar.add(new JLabel("Código"));
        JTextField campoCodigo = new JTextField();
        frameEliminar.add(campoCodigo);

        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Valida si el doctor existe
                // Si no existe, muestra un mensaje indicando el error
                // De lo contrario, elimina al doctor del sistema
                // Muestra un mensaje de confirmación
                // Vuelve a visualizar la pantalla principal del módulo del administrador
            }
        });
        frameEliminar.add(botonAceptar);

        JButton botonCancelar = new JButton("Cancelar");
        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameEliminar.dispose();
            }
        });
        frameEliminar.add(botonCancelar);

        frameEliminar.setVisible(true);
    }
});
   panelBotones.add(botonEliminar);

        panel.add(panelBotones, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this.panel;
    }

    // Otros métodos aquí
}