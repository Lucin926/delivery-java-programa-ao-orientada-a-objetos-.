package Exercício07;

public class Entregaexpressa extends Pedido{
    double taxaEntrega;
    double taxaUrgencia;
    
    @Override
    void calculartotal() {
        total = valorPedido + taxaEntrega + taxaUrgencia;
    }

    @Override
    void mostrarresumo() {
        System.out.println("CLIENTE: " + cliente);
        System.out.println("PEDIDO: " + total);

    }
}
