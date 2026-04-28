package view;

import javax.swing.*;
import java.awt.*;

public class PanelProveedores extends JPanel {

    private JTextField cajaNombreProv, cajaCodigoProv, cajaDireccionProv, cajaTelefonoProv;

    public PanelProveedores() {
        this.setLayout(new GridLayout(5, 1));

        // Panel nombre proveedor
        JPanel filaNombreProv = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaNombreProv = new JLabel("Nombre del model.Proveedor:");
        cajaNombreProv = new JTextField(20);
        filaNombreProv.add(etiquetaNombreProv);
        filaNombreProv.add(cajaNombreProv);

        // Panel codigo proveedor
        JPanel filaCodigoProv = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaCodigoProv = new JLabel("Codigo model.Proveedor:");
        cajaCodigoProv = new JTextField(20);
        filaCodigoProv.add(etiquetaCodigoProv);
        filaCodigoProv.add(cajaCodigoProv);

        // Panel direccion
        JPanel filaDireccionProv = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaDireccionProv = new JLabel("Direccion:");
        cajaDireccionProv = new JTextField(20);
        filaDireccionProv.add(etiquetaDireccionProv);
        filaDireccionProv.add(cajaDireccionProv);

        // Panel telefono
        JPanel filaTelefonoProv = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaTelefonoProv = new JLabel("Telefono:");
        cajaTelefonoProv = new JTextField(20);
        filaTelefonoProv.add(etiquetaTelefonoProv);
        filaTelefonoProv.add(cajaTelefonoProv);

        // Boton
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonRegistrarProv = new JButton("Registrar proveedor");
        panelBotones.add(botonRegistrarProv);

        this.add(filaNombreProv);
        this.add(filaCodigoProv);
        this.add(filaDireccionProv);
        this.add(filaTelefonoProv);
        this.add(panelBotones);
    }
}