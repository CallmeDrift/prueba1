/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Factura {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(1, "Producto 1", 2, 10000);
        String factura = ticket.generarFactura();
        JOptionPane.showMessageDialog(null, "Factura:\n" + factura);
    }
}
