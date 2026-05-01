package Atv3;

class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio();
        Imprimivel recibo = new Recibo();

        relatorio.imprimir();
        recibo.imprimir();
    }
}
