package view;

import javax.swing.*;
import java.awt.*;

public class PanelClientes extends JPanel {

    // Atributos para que los botones puedan leer los datos después
    private JTextField cajaNombreCli, cajaRutCli, cajaDireccionCli, cajaTelefonoCli;

    public PanelClientes() {
        // Usamos GridLayout de 5 filas (4 para datos y 1 para botones)
        this.setLayout(new GridLayout(5, 1));

        // Panel Nombre model.Cliente
        JPanel filaNombreCli = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaNombreCli = new JLabel("Nombre Completo:");
        cajaNombreCli = new JTextField(20);
        filaNombreCli.add(etiquetaNombreCli);
        filaNombreCli.add(cajaNombreCli);

        // Panel RUT/ID model.Cliente
        JPanel filaRutCli = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaRutCli = new JLabel("RUT o ID model.Cliente:");
        cajaRutCli = new JTextField(20);
        filaRutCli.add(etiquetaRutCli);
        filaRutCli.add(cajaRutCli);

        // Panel Dirección model.Cliente
        JPanel filaDireccionCli = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaDireccionCli = new JLabel("Dirección:");
        cajaDireccionCli = new JTextField(20);
        filaDireccionCli.add(etiquetaDireccionCli);
        filaDireccionCli.add(cajaDireccionCli);

        // Panel Teléfono model.Cliente
        JPanel filaTelefonoCli = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaTelefonoCli = new JLabel("Teléfono:");
        cajaTelefonoCli = new JTextField(20);
        filaTelefonoCli.add(etiquetaTelefonoCli);
        filaTelefonoCli.add(cajaTelefonoCli);

        // Panel Botón
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonRegistrarCli = new JButton("Registrar model.Cliente");
        panelBotones.add(botonRegistrarCli);

        // Añadir todas las filas al panel de la pestaña
        this.add(filaNombreCli);
        this.add(filaRutCli);
        this.add(filaDireccionCli);
        this.add(filaTelefonoCli);
        this.add(panelBotones);
    }
}