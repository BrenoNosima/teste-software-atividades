package br.edu.exemplo;

import br.edu.exemplo.model.Produto;
import br.edu.exemplo.repository.ProdutoRepository;
import br.edu.exemplo.service.ProdutoService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;

// Casos extras: as consultas abaixo devem realmente reler os dados do H2.
@SpringBootTest
@Transactional
class ProdutoPersistenciaIntegrationTest {
    @Autowired ProdutoService service;
    @Autowired ProdutoRepository repository;
    @Autowired EntityManager entityManager;

    @Test void precoInvalidoNaoPersiste() {
        long antes = repository.count();
        assertThrows(IllegalArgumentException.class, () -> service.cadastrar("Mouse", 0));
        assertThrows(IllegalArgumentException.class, () -> service.cadastrar("Mouse", -1));
        assertEquals(antes, repository.count());
    }

    @Test void nomeNuloNaoPersiste() {
        long antes = repository.count();
        assertThrows(IllegalArgumentException.class, () -> service.cadastrar(null, 80));
        assertEquals(antes, repository.count());
    }

    @Test void atualizacaoInvalidaPreservaPreco() {
        Produto produto = service.cadastrar("Mouse", 80);
        assertThrows(IllegalArgumentException.class, () -> service.atualizarPreco(produto.getId(), 0));
        assertThrows(IllegalArgumentException.class, () -> service.atualizarPreco(produto.getId(), -1));
        entityManager.flush();
        entityManager.clear();
        assertEquals(80, repository.findById(produto.getId()).orElseThrow().getPreco(), 0.001);
    }

    @Test void buscarIdAusenteFalha() {
        assertThrows(IllegalArgumentException.class, () -> service.buscar(-1L));
    }
}
