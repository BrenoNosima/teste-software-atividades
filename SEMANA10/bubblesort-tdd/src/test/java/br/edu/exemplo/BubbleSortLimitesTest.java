package br.edu.exemplo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortLimitesTest {

    @Test void vetorVazio() { verificar(new int[]{}, new int[]{}); }
    @Test void umElemento() { verificar(new int[]{7}, new int[]{7}); }
    @Test void ordemInversaENegativos() {
        verificar(new int[]{3, 0, -1, -5}, new int[]{-5, -1, 0, 3});
    }
    @Test void todosIguais() { verificar(new int[]{2, 2, 2}, new int[]{2, 2, 2}); }
    private void verificar(int[] entrada, int[] esperado) {
        BubbleSort sort = new BubbleSort(entrada);
        sort.ordenar();
        assertArrayEquals(esperado, sort.getNumeros());
    }

}
