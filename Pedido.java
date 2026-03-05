package Exercício07;

public class Pedido {
    String cliente;
    double valorPedido;
    double total;

    void calculartotal() {
        total = valorPedido;
    }

    void mostrarresumo() {
        System.out.println("CLIENTE: " + cliente);
        System.out.println("PEDIDO: " + valorPedido);

    }

}
