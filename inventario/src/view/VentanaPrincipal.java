package view;

import javax.swing.*;
import java.util.ArrayList;

import controller.ProductoController;
import model.Producto;

public class VentanaPrincipal extends JFrame {

    public static ProductoController controlador = new ProductoController();

    // Constructor de la ventana
    public VentanaPrincipal() {
        //Configuracion ventana
        super("Inventario de Tienda Electrónica");//Titulo de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Configuración del boton salir
        setSize(700, 500);// Tamaño de la ventana

        //Contenedor de pestañas
        JTabbedPane pestanas = new JTabbedPane();

        // Agregar las clases a la ventana
        pestanas.addTab("Productos", new PanelProductos());
        pestanas.addTab("Proveedores", new PanelProveedores());
        pestanas.addTab("Clientes", new PanelClientes());
        pestanas.addTab("Ventas", new PanelVentas());

        add(pestanas);

        // Visible la ventana
        setVisible(true);
    }
}
