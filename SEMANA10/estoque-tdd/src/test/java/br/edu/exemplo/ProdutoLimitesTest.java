package br.edu.exemplo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoLimitesTest {

    @Test void guardaNome() {
        assertEquals("Teclado", new Produto("Teclado").getNome());
    }
    @ParameterizedTest @ValueSource(ints = {-1, 0})
    void entradaInvalidaPreservaEstoque(int quantidade) {
        Produto produto = new Produto("Teclado");
        produto.adicionarEstoque(10);
        produto.adicionarEstoque(quantidade);
        assertEquals(10, produto.getQuantidade());
    }
    @ParameterizedTest @ValueSource(ints = {-1, 0})
    void retiradaInvalidaPreservaEstoque(int quantidade) {
        Produto produto = new Produto("Teclado");
        produto.adicionarEstoque(10);
        produto.retirarEstoque(quantidade);
        assertEquals(10, produto.getQuantidade());
    }
    @Test void retiraEstoqueCompleto() {
        Produto produto = new Produto("Teclado");
        produto.adicionarEstoque(10);
        produto.retirarEstoque(10);
        assertEquals(0, produto.getQuantidade());
    }

}
