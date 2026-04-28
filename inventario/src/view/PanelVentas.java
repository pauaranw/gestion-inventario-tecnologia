package view;

import javax.swing.*;
import java.awt.*;

public class PanelVentas extends JPanel {

    private JTextField cajaCodigoVenta, cajaCantidadVenta, cajaCliente;
    private JComboBox<String> comboTipoVenta;

    public PanelVentas() {

        //----Sección Ventas----
        this.setLayout(new GridLayout(5, 1));

        //Panel cliente
        JPanel filaCliente = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaCliente.add(new JLabel("Nombre del Cliente:"));
        cajaCliente = new JTextField(20);
        filaCliente.add(cajaCliente);

        //Panel codigo producto
        JPanel filaCodigo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaCodigo.add(new JLabel("Código del Producto:"));
        cajaCodigoVenta = new JTextField(10);
        filaCodigo.add(cajaCodigoVenta);

        //Panel cantidad
        JPanel filaCantidad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaCantidad.add(new JLabel("Cantidad:"));
        cajaCantidadVenta = new JTextField(10);
        filaCantidad.add(cajaCantidadVenta);

        //Panel tipo de venta
        JPanel filaTipo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filaTipo.add(new JLabel("Tipo de Venta:"));
        comboTipoVenta = new JComboBox<>(new String[]{"Local", "En Línea"});
        filaTipo.add(comboTipoVenta);

        //Boton realizar venta
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonVender = new JButton("Realizar Venta");
        panelBotones.add(botonVender);

        //--- Lógica de la Venta ---
        botonVender.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Obtener datos
                    int cod = Integer.parseInt(cajaCodigoVenta.getText());
                    int cant = Integer.parseInt(cajaCantidadVenta.getText());
                    String cliente = cajaCliente.getText();

                    // Convertir tipo: 1 para Local, 2 para En Línea
                    int tipo = comboTipoVenta.getSelectedItem().equals("En Línea") ? 2 : 1;

                    // Llamar a la lógica del controlador que ya tiene el descuento (15%) y resta stock
                    int totalFinal = VentanaPrincipal.controlador.procesarVentaConDescuento(cod, cant, cliente, tipo);

                    if (totalFinal != -1) {
                        JOptionPane.showMessageDialog(null, "¡Venta Exitosa!\nTotal a pagar: $" + totalFinal);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Producto no encontrado o stock insuficiente.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese números válidos en código y cantidad.");
                }
            }
        });

        //Añadir al panel principal
        this.add(filaCliente);
        this.add(filaCodigo);
        this.add(filaCantidad);
        this.add(filaTipo);
        this.add(panelBotones);
    }
}