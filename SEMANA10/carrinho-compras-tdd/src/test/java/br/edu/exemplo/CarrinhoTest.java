package br.edu.exemplo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test void carrinhoVazioTemTotalZero() {
        assertEquals(0, new Carrinho().getTotal());
    }
    @Test void adicionaUmProduto() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Teclado", 100));
        assertEquals(100, carrinho.getTotal(), 0.001);
    }
    @Test void somaVariosProdutos() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Teclado", 100));
        carrinho.adicionar(new Produto("Mouse", 50));
        assertEquals(150, carrinho.getTotal(), 0.001);
    }
    @Test void removeProduto() {
        Carrinho carrinho = new Carrinho();
        Produto mouse = new Produto("Mouse", 50);
        carrinho.adicionar(new Produto("Teclado", 100));
        carrinho.adicionar(mouse);
        carrinho.remover(mouse);
        assertEquals(100, carrinho.getTotal(), 0.001);
    }
    @Test void rejeitaPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Produto("Teclado", -100));
    }
    @Test void produtoGratuitoENome() {
        Produto produto = new Produto("Brinde", 0);
        assertEquals("Brinde", produto.getNome());
        assertEquals(0, produto.getPreco());
    }
    @Test void descontoEmCompraDe600() { verificarTotal(600, 540); }
    @Test void abaixoDaFronteiraSemDesconto() { verificarTotal(499.99, 499.99); }
    @Test void naFronteiraComDesconto() { verificarTotal(500, 450); }
    @Test void acimaDaFronteiraComDesconto() { verificarTotal(500.01, 450.009); }
    @Test void removerProdutoRecalculaDesconto() {
        Carrinho carrinho = new Carrinho();
        Produto mouse = new Produto("Mouse", 100);
        carrinho.adicionar(new Produto("Monitor", 450));
        carrinho.adicionar(mouse);
        assertEquals(495, carrinho.getTotal(), 0.001);
        carrinho.remover(mouse);
        assertEquals(450, carrinho.getTotal(), 0.001);
    }
    @Test void removerAusenteNaoAlteraTotal() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Teclado", 100));
        carrinho.remover(new Produto("Mouse", 50));
        assertEquals(100, carrinho.getTotal(), 0.001);
    }
    private void verificarTotal(double preco, double esperado) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Compra", preco));
        assertEquals(esperado, carrinho.getTotal(), 0.001);
        assertEquals(esperado, carrinho.getTotal(), 0.001);
    }

}
