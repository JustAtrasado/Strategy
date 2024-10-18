class DescontoClienteNovo implements DescontoStrategy{
    //Sem desconto
    @Override
    public double calcularDesconto(double preco) {
        return preco;
    }
}
