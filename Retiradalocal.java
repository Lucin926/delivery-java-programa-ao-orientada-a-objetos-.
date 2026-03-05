package Exercício07;

public class Retiradalocal extends Pedido {

    @Override
    void calculartotal() {
        total = valorPedido;
    }
    
    @Override
    void mostrarresumo() {
        System.out.println("CLIENTE: " + cliente);
        System.out.println("PEDIDO: " + total);
    }
}
