package Exercício07;

public class Entreganormal extends Pedido {
    
    double taxaEntrega;
    
    @Override
    void calculartotal() {
        total = valorPedido + taxaEntrega;
    }

    @Override
    void mostrarresumo() {
        System.out.println("CLIENTE: " + cliente);
        System.out.println("PEDIDO: " + total);

    }
}
