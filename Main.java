package Exercício07;

public class Main {
    public static void main(String[] args) {
        Entreganormal n1 = new Entreganormal();
        Entregaexpressa e1 = new Entregaexpressa();
        Retiradalocal r1 = new Retiradalocal();

        n1.cliente = "Luciano";
        n1.valorPedido = 50.0;
        n1.taxaEntrega = 10.0;
        n1.calculartotal();
        n1.mostrarresumo();
        System.out.println("(====================)");

        e1.cliente = "Vinicuis";
        e1.valorPedido = 50.0;
        e1.taxaEntrega = 10;
        e1.taxaUrgencia = 15.0;
        e1.calculartotal();
        e1.mostrarresumo();
        System.out.println("(====================)");

        r1.cliente = "Leon";
        r1.valorPedido = 50.0;
        r1.calculartotal();
        r1.mostrarresumo();
    }
    
}
