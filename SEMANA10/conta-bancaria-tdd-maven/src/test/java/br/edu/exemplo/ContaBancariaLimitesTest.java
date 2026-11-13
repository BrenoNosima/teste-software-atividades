package br.edu.exemplo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaLimitesTest {

    @Test void saldoInicialZero() {
        assertEquals(0, new ContaBancaria().getSaldo());
    }
    @ParameterizedTest @ValueSource(doubles = {-1, 0})
    void depositoInvalidoNaoAlteraSaldo(double valor) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(50);
        conta.depositar(valor);
        assertEquals(50, conta.getSaldo());
    }
    @ParameterizedTest @ValueSource(doubles = {-1, 0})
    void saqueInvalidoNaoAlteraSaldo(double valor) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(50);
        conta.sacar(valor);
        assertEquals(50, conta.getSaldo());
    }
    @Test void podeSacarSaldoCompleto() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(50);
        conta.sacar(50);
        assertEquals(0, conta.getSaldo());
    }

}
