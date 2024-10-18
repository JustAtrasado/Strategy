class DescontoClienteVIP implements DescontoStrategy{
    //20% de desconto
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.80;
    }
}

