package controller;

import model.Compra;
import model.Producto;

import java.util.ArrayList;

public class ProductoController {

    //Lista para guardar los productos
    private ArrayList<Producto> listaProductos;

    public ProductoController() {
        this.listaProductos = new ArrayList<>();
        inicializarDatos();

    }

    // Productos para probar
    public void inicializarDatos() {
        listaProductos.add(new model.Producto(1001, "Notebook Gamer", 10, 850000, "Bodega A"));
        listaProductos.add(new model.Producto(1002, "Mouse Inalámbrico", 25, 15000, "Estante B1"));
        listaProductos.add(new model.Producto(1003, "Monitor 24 pulgadas", 15, 120000, "Bodega A"));
        listaProductos.add(new model.Producto(1004, "Teclado Mecánico", 8, 45000, "Estante B2"));
    }

    //---Operaciones CRUD---

    //Crear o registrar
    public void registrar (Producto producto ){
        listaProductos.add(producto);
    }

    //Read o leer
    public Producto buscarPorCodigo (int codigo){
        for (Producto producto : listaProductos){
            if (producto.getCodigo() == codigo){
                return producto;
            }
        }
        return null;
    }

    //Update o actualizar
    public boolean actualizar (int codigo, int nuevoPrecio, int nuevoStock){
        Producto producto = buscarPorCodigo(codigo);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            producto.setCantidad(nuevoStock);
            return true;
        }
        return false;
    }

    //Delete o eliminar
    public boolean eliminar(int codigo){
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo() == codigo) {
                listaProductos.remove(i);
                return true;
            }
        }return false;
    }

    // Reporte obtener toda la lista
    public ArrayList<Producto> obtenerTodos() {
        return listaProductos;
    }

    // Método para sumar al stock existente
    public boolean agregarStockManual(int codigo, int cantidadASumar) {
        Producto p = buscarPorCodigo(codigo);
        if (p != null) {
            p.sumarStock(cantidadASumar);
            return true;
        }
        return false;
    }

    //total compra final
    public int procesarVentaConDescuento(int codigo, int cantidad, String nombreCliente, int tipoVenta) {
        // Buscar el producto en la lista
        Producto producto = buscarPorCodigo(codigo);

        // Estructura de control: Validar si existe y si hay stock suficiente
        if (producto != null && producto.getCantidad() >= cantidad) {

            // Calcular el total base (Operación aritmética)
            int totalBase = producto.getPrecio() * cantidad;

            // Crear el objeto Compra para usar su lógica de descuento
            Compra nuevaCompra = new Compra(nombreCliente, tipoVenta);

            // Obtener el precio final
            int totalFinal = (int) nuevaCompra.calcularTotalFinal(totalBase, cantidad);

            // Actualizar el inventario usando tu método restarStock
            producto.restarStock(cantidad);

            // Devolvemos el monto final para mostrarlo en la boleta/ventana
            return totalFinal;
        }

        // Si algo falla (no hay producto o no hay stock)
        return -1;
    }

}
