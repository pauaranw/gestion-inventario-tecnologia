package model;

public class Compra {
    private String cliente;
    private int tipoCompra;

    //Constructor
    public Compra(String cliente, int tipoCompra) {
        this.cliente = cliente;
        this.tipoCompra = tipoCompra; // 1 para tienda y 2 para compra en linea
    }


    //Metodos
    //compra
    public double calcularTotalFinal(int totalOriginal, int cantidad) {
        // Lógica: Si es "En Línea" (tipo 2) y más de 3 productos
        if (this.tipoCompra == 2 && cantidad > 3) {
            double descuento = totalOriginal * 0.15; // Calcular el 15%
            return totalOriginal - descuento;        // Restar el descuento
        } else {
            return totalOriginal;
        }
    }

    //Getter and setters

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(int tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
}
