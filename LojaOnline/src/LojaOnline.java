public class LojaOnline {
    public static void main(String[] args) {
        //  Criar alguns produtos
        Produto produto1 = new Produto("Calça", 120.00);
        Produto produto2 = new Produto("Blusa", 160.00);
        Produto produto3 = new Produto("Meia", 20.00);

        // Criar o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Aplicar desconto para cliente novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        double totalNovo = carrinho.calcularTotalComDesconto();
        System.out.println("");
        System.out.println("Total para cliente novo: " + totalNovo);

        // Aplicar desconto para cliente regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        double totalRegular = carrinho.calcularTotalComDesconto();
        System.out.println("");
        System.out.println("Total para cliente regular: " + totalRegular);

        // Aplicar desconto para cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        double totalVIP = carrinho.calcularTotalComDesconto();
        System.out.println("");
        System.out.println("Total para cliente VIP: " + totalVIP);
    }
}