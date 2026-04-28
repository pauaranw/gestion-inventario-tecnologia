package view;

import javax.swing.*;
import java.awt.*;
import model.Producto;

public class PanelProductos extends JPanel {

    private JTextField cajaNombre, cajaCodigo, cajaDescripcion, cajaCantidad, cajaUbicacion;

    public PanelProductos() {

        //----Sección Productos----
        this.setLayout(new GridLayout(7, 1));

        //Panel nombre producto
        JPanel filaNombreProducto = new JPanel(new FlowLayout(FlowLayout.LEFT));//Panel
        JLabel etiquetaNombre = new JLabel("Nombre del model.Producto:");//etiqueta
        cajaNombre = new JTextField(20);//caja texto
        //Añadir al panel pequeño
        filaNombreProducto.add(etiquetaNombre);
        filaNombreProducto.add(cajaNombre);

        //Panel codigo
        JPanel filaCodigo = new JPanel( new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaCogido = new JLabel("Codigo:");
        cajaCodigo = new JTextField(20);
        //Añadir
        filaCodigo.add(etiquetaCogido);
        filaCodigo.add(cajaCodigo);

        //Panel descripcion
        JPanel filaDescripcion = new JPanel( new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaDescripcion = new JLabel("Descripcion del producto:");
        cajaDescripcion = new JTextField(20);
        filaDescripcion.add(etiquetaDescripcion);
        filaDescripcion.add(cajaDescripcion);

        //Panel cantidad
        JPanel filaCantidad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaCantidad = new JLabel("Cantidad del producto:");
        cajaCantidad = new JTextField(20);
        filaCantidad.add(etiquetaCantidad);
        filaCantidad.add(cajaCantidad);

        //Panel ubicación
        JPanel filaUbicacion = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaUbicacion = new JLabel("Ubicacion:");
        cajaUbicacion = new JTextField(20);
        filaUbicacion.add(etiquetaUbicacion);
        filaUbicacion.add(cajaUbicacion);

        //Boton
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonRegistrar = new JButton("Registrar producto");
        panelBotones.add(botonRegistrar);

        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    int cod = Integer.parseInt(cajaCodigo.getText());
                    String desc = cajaDescripcion.getText();
                    int cant = Integer.parseInt(cajaCantidad.getText());
                    int prec = 0;
                    String ubi = cajaUbicacion.getText();

                    Producto nuevo = new Producto(cod, desc, cant, prec, ubi);

                    VentanaPrincipal.controlador.registrar(nuevo);

                    JOptionPane.showMessageDialog(null, "¡Producto registrado exitosamente!");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Código y Cantidad deben ser números enteros.");
                }
            }
        });

        JButton botonReporte = new JButton("Ver Stock Total");
        panelBotones.add(botonReporte);

        //--- Lógica para Ver el Stock (Reporte) ---
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String textoReporte = "--- INVENTARIO ACTUAL ---\n\n";

                // Recorremos la lista que tiene el controlador
                for (Producto producto : VentanaPrincipal.controlador.obtenerTodos()) {
                    textoReporte += "Código: " + producto.getCodigo() +
                            " | Nombre: " + producto.getDescripcion() +
                            " | Stock: " + producto.getCantidad() + "\n";
                }

                // Mostrar el reporte en una ventana emergente
                JOptionPane.showMessageDialog(null, textoReporte);
            }
        });

        JButton botonModificar = new JButton("Modificar");
        panelBotones.add(botonModificar);

        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Obtener los datos de las cajas
                    int cod = Integer.parseInt(cajaCodigo.getText());
                    int nuevoPrec = 1000;
                    int nuevoStock = Integer.parseInt(cajaCantidad.getText());

                    // Llamada al método actualizar del controlador
                    boolean exito = VentanaPrincipal.controlador.actualizar(cod, nuevoPrec, nuevoStock);

                    if (exito) {
                        JOptionPane.showMessageDialog(null, "¡Producto actualizado correctamente!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se encontró el código " + cod);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa números válidos para actualizar.");
                }
            }
        });

        JButton botonSumar = new JButton("Sumar Stock");
        panelBotones.add(botonSumar);

        //--- Lógica para Sumar Stock ---
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    // Obtener el código del producto
                    int cod = Integer.parseInt(cajaCodigo.getText());
                    int cantidadNuevas = Integer.parseInt(cajaCantidad.getText());


                    boolean exito = VentanaPrincipal.controlador.agregarStockManual(cod, cantidadNuevas);

                    if (exito) {
                        JOptionPane.showMessageDialog(null, "¡Stock actualizado! Se sumaron " + cantidadNuevas + " unidades.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se encontró el producto con código " + cod);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa números válidos en Código y Cantidad.");
                }
            }
        });

        //Añadir todo al panel principal de esta clase
        this.add(filaNombreProducto);
        this.add(filaCodigo);
        this.add(filaDescripcion);
        this.add(filaCantidad);
        this.add(filaUbicacion);
        this.add(panelBotones);
    }
}