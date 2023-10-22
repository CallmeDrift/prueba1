
package com.mycompany.mavenproject1;


    
   public class Ticket {
    public int numeroTicket;
    public String producto;
    public int cantidad;
    public int precioUnitario;

    public Ticket(int numeroTicket, String producto, int cantidad, double precioUnitario) {
        this.numeroTicket = numeroTicket;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = (int) precioUnitario;
    }

    public int calcularTotal() {
        return cantidad * precioUnitario;
    }

public String generarFactura() {
    String factura = "Número de Ticket: " + numeroTicket + "\n";
    factura += "Detalles del Pedido:\n";
    factura += "Producto: " + producto + "\n";
    factura += "Cantidad: " + cantidad + "\n";
    factura += "Precio Unitario: $" + precioUnitario + "\n";
    factura += "Subtotal: $" + calcularTotal() + "\n";

    return factura;
}
} 

