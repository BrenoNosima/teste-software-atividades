# Semana 10 - TDD

## Objetivo

Completar os quatro projetos usando testes para orientar a implementação e verificar a cobertura.

## Processo usado

Primeiro foram lidos os requisitos e escritos os testes adicionais. Depois a suíte foi executada com as classes incompletas, registrando o RED. Após a implementação, foi executado `mvn clean verify` para conferir o GREEN e a cobertura.

O primeiro registro contém uma execução RED e uma GREEN por projeto, com os comportamentos agrupados. No carrinho, o RED inicial é uma falha de compilação, porque os testes chamam métodos ainda inexistentes.

Depois foi feita uma reprodução incremental em cópias isoladas dos quatro projetos, executando os requisitos em sequência: teste antes, implementação mínima e teste depois, mantendo os testes anteriores ativos. Os logs e as versões intermediárias estão em `evidencias/tdd-incremental`. Essa reprodução é um complemento posterior ao primeiro registro, não um histórico de commits.

Quando o requisito já passava, a implementação era mantida. Por exemplo, acumular depósitos já funcionava com a soma usada no primeiro depósito; os casos ordenado e repetido já funcionavam com o Bubble Sort. Não foi criada uma falha artificial. No final de cada projeto foi aplicada a versão refatorada e executada a suíte completa com a verificação de cobertura.

Na organização final, o carrinho armazena produtos em uma lista e calcula o desconto ao consultar o total. As demais classes usam condições e laços simples. Os testes originais de Bubble Sort, conta e estoque não foram alterados.

## Resultados reais

| Projeto | RED inicial | Testes finais | Linhas | Ramificações |
|---|---|---:|---:|---:|
| Bubble Sort | 3 falhas em 7 testes | 7 aprovados | 11/11 (100%) | 6/6 (100%) |
| Conta bancária | 8 falhas em 10 testes | 10 aprovados | 10/10 (100%) | 6/6 (100%) |
| Estoque | 8 falhas em 12 testes | 12 aprovados | 12/12 (100%) | 6/6 (100%) |
| Carrinho | Métodos ainda inexistentes | 12 aprovados | 21/21 (100%) | 6/6 (100%) |

Total: 41 testes aprovados. Nenhum teste final falhou ou foi ignorado.

## Comportamentos testados

**Bubble Sort:** vetor desordenado, já ordenado, com repetidos, vazio, com um elemento, com negativos e em ordem inversa.

**Conta:** saldo inicial, depósitos, acumulação, saque válido, saldo insuficiente, valores negativos e zero, além de saque do saldo completo.

**Estoque:** nome, quantidade inicial, entradas acumuladas, retiradas, estoque insuficiente, valores negativos, zero e retirada de todo o estoque.

**Carrinho:** vazio, inclusão de um e de vários produtos, remoção, preço negativo, produto gratuito e desconto. As fronteiras R$ 499,99, R$ 500,00 e R$ 500,01 foram verificadas. Consultar o total novamente mantém o mesmo resultado, e remover um produto recalcula o desconto.

## Conclusão

As implementações passaram nos testes e atingiram 100% de cobertura de linhas e ramificações, medidos pelo JaCoCo. Os logs e relatórios estão na pasta `evidencias`.
