class DescontoClienteRegular implements DescontoStrategy {
    //10% de desconto
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.90;
    }
}
