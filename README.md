# Trabalho individual de Teste de Software

Entrega individual das atividades das semanas 10, 11 e 14. As soluções usam Java 17, Maven e JUnit 5, com código simples.

## Organização da entrega

| Atividade | Código e relatório |
|---|---|
| Semana 10 - TDD | [Quatro projetos e relatório](SEMANA10/RELATORIO.md) |
| Semana 11 - Integração | [Projeto Spring Boot e descrição dos testes](SEMANA11/exercicios_integracao_springboot/README.md) |
| Semana 14 - Teste de usuário | [Relatório individual simulado](SEMANA14/RELATORIO_SIMULADO.md) |
| Relatório completo | [PDF das três atividades](Relatorio_Testes_Semanas_10_11_14.pdf) |
| Evidências | [Logs, testes e cobertura](evidencias) |

## Como executar

Com JDK 17 e Maven instalados, abra o terminal nesta pasta e execute:

```bash
mvn clean verify
```

Esse comando executa os cinco projetos. Para executar somente um deles, entre na pasta do projeto e rode `mvn clean verify`.

Na Semana 10, `mvn verify` também gera e confere o relatório JaCoCo. O build falha se a cobertura de linhas ou ramificações ficar abaixo de 100%. Abra `target/site/jacoco/index.html` dentro de cada projeto para ver a cobertura.

## O que foi feito

- **Semana 10:** implementação de Bubble Sort, conta bancária, estoque e carrinho. Testes originais preservados e novos testes para limites. São 41 testes, com 100% de linhas e ramificações nos quatro projetos.
- **Semana 11:** integração com Spring Boot, H2 e MockMvc. Os cinco casos pedidos foram preenchidos e há quatro casos extras. Service e Repository reais, sem mocks.
- **Semana 14:** relatório de uma **simulação fictícia** do teste de usuário no Mercado Livre. Foi usado apenas um perfil fictício, com tempos, erro e respostas criados para o exemplo; não houve sessão real nem navegação no site.

Os logs reais de antes e depois da implementação ficam em `evidencias/red` e `evidencias/green`. A reprodução por requisito fica em `evidencias/tdd-incremental`, com logs e versões intermediárias. Os relatórios de cobertura ficam em `evidencias/cobertura`. O resultado detalhado está nos relatórios de cada semana.

## Decisões simples

- Depósitos, saques e movimentações de estoque inválidos são ignorados e preservam o estado, seguindo os testes do professor.
- Produto com preço negativo no carrinho lança `IllegalArgumentException`. Preço zero é permitido.
- O desconto é calculado na consulta do total, evitando desconto acumulado. Foram mantidos os valores `double` da base; não foi criada regra extra de arredondamento.
- Bubble Sort recebe um vetor não nulo, conforme os exemplos do enunciado.
- Cobertura de 100% mostra que as linhas e decisões existentes foram exercitadas; não garante ausência de todos os defeitos possíveis.

## Material de referência

Código inicial e enunciados: [repositório do professor](https://github.com/JoaoChoma/teste_software_2026), commit de referência `b7c26df0ab4b2cd7075fad53bb61e2c4ca7bcde6`.

Repositório organizado para a entrega individual da atividade. A Semana 14 está identificada como simulação didática, com dados fictícios.
