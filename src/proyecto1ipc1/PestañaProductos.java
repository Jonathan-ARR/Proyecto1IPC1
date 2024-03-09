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
public class PestañaProductos {
    private SistemaHospital sistemaHospital;
    private JPanel panel;

    public PestañaProductos(SistemaHospital sistemaHospital) {
        this.sistemaHospital = sistemaHospital;

        panel = new JPanel();
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panelCrear = new JPanel();
        // Agrega los componentes para crear un producto en panelCrear

        JPanel panelActualizar = new JPanel();
        // Agrega los componentes para actualizar un producto en panelActualizar

        JPanel panelEliminar = new JPanel();
        // Agrega los componentes para eliminar un producto en panelEliminar

        JPanel panelReporte = new JPanel();
        // Agrega los componentes para mostrar el reporte en panelReporte

        tabbedPane.addTab("Crear", panelCrear);
        tabbedPane.addTab("Actualizar", panelActualizar);
        tabbedPane.addTab("Eliminar", panelEliminar);
        tabbedPane.addTab("Reporte", panelReporte);

        panel.add(tabbedPane);
    }

    public JPanel getPanel() {
        return this.panel;
    }

    // Otros métodos aquí
}