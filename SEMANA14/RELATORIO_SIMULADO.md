# Semana 14 - Teste de usuário no Mercado Livre

**Trabalho individual - simulação didática. O perfil, os tempos, os erros, o comentário e as respostas abaixo são fictícios. Não houve teste real com pessoas nem navegação no site para confirmar a interface atual.**

## 1. Objetivo

Avaliar, em um exemplo simulado, a facilidade para buscar um fone Bluetooth, comparar opções e iniciar uma compra até o carrinho, sem concluir o pagamento.

## 2. Organização individual

Este trabalho foi organizado para entrega individual, sem integrantes de grupo ou colegas apresentados como participantes. Para exemplificar o registro, foi criado apenas um perfil fictício, P1, com experiência em compras online.

O enunciado original propõe um usuário e um colega avaliador. Aqui foi feita uma adaptação individual e simulada, sem observador real. Portanto, o exemplo não substitui a aplicação real prevista no enunciado.

O cenário imaginado é: “Você quer um fone de ouvido Bluetooth para uso diário. Procure uma opção bem avaliada, compare produtos e inicie a compra, sem pagar.”

As tarefas são acessar o site, pesquisar “fone de ouvido Bluetooth”, selecionar Full, ordenar pelos melhores avaliados, comparar duas opções, abrir os detalhes de uma delas, adicionar ao carrinho, simular o início da compra e retornar à página inicial.

A existência da ordenação por avaliação é uma hipótese desta simulação, não uma confirmação sobre o site atual. Caso a opção não exista em uma aplicação real, isso deve ser registrado como indisponibilidade.

Os tempos fictícios representam a duração de cada tarefa, sem sobreposição. “S” significa concluída sem ajuda. O tempo total começa na primeira ação e termina no retorno à página inicial.

## 3. Registro fictício de um único perfil

### P1 - Perfil simulado

| Tarefa | Tempo (s) | Sucesso | Erros | Observação simulada |
|---|---:|:---:|---:|---|
| Acessar o site | 8 | S | 0 | Encontrou a busca. |
| Buscar o produto | 18 | S | 0 | Usou o termo solicitado. |
| Aplicar Full e ordenar | 40 | S | 1 | Abriu uma opção de ordenação diferente e corrigiu. |
| Comparar opções e abrir detalhes | 55 | S | 0 | Comparou avaliação e preço de duas opções. |
| Adicionar ao carrinho | 25 | S | 0 | Identificou a ação. |
| Simular início da compra | 44 | S | 0 | Parou antes de qualquer confirmação de pagamento. |
| Retornar ao início | 15 | S | 0 | Voltou pelo logotipo. |
| **Total** | **205** | **S** | **1** | **3 min 25 s** |

Comentário fictício: “A busca foi fácil, mas precisei conferir a ordenação.”

## 4. Resultados simulados

- Adição ao carrinho: 1/1 × 100 = **100% no único caso fictício**.
- Fluxo completo: 1/1 × 100 = **100% no único caso fictício**.
- Tempo total: 8 + 18 + 40 + 55 + 25 + 44 + 15 = **205 segundos**, ou **3 min 25 s**.
- Número de erros simulados: **1**, na ordenação dos resultados.

Numericamente, o exemplo fica acima da meta de 90% de adição ao carrinho e abaixo do limite de 4 minutos. Como há somente um caso inventado, esses números não comprovam as metas com usuários reais nem permitem generalizar a usabilidade do site.

## 5. Questionário SUS - resposta fictícia

Os itens seguem a ordem do questionário SUS de John Brooke. A escala vai de 1 (discordo totalmente) a 5 (concordo totalmente). O questionário original está na referência ao final. As respostas foram inventadas para demonstrar o cálculo.

| Perfil | I1 | I2 | I3 | I4 | I5 | I6 | I7 | I8 | I9 | I10 | SUS |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| P1 | 4 | 2 | 4 | 1 | 4 | 2 | 4 | 2 | 4 | 2 | 77,5 |

Nos itens ímpares, calcula-se resposta − 1; nos pares, 5 − resposta. As contribuições somam 31. Assim, 31 × 2,5 = **77,5 pontos de 0 a 100**. Esse valor não é uma porcentagem de tarefas concluídas.

## 6. Dificuldade hipotética e sugestão

| Dificuldade simulada | Consequência | Sugestão a validar em teste real |
|---|---|---|
| Escolha inicial de uma ordenação diferente da solicitada | Um erro e mais tempo para conferir os resultados | Tornar o critério de ordenação selecionado mais evidente. |

A sugestão foi criada a partir do cenário fictício. Não representa um defeito confirmado do Mercado Livre.

## 7. Conclusão do exemplo

Neste exemplo individual, o único perfil simulado concluiu o fluxo em 3 minutos e 25 segundos, com um erro corrigido na ordenação. A atividade demonstra como organizar as tarefas, registrar dificuldades e calcular as métricas. Os resultados são fictícios e não constituem evidência de um teste real de usuário.

## Referências

- [Enunciado da Semana 14](https://github.com/JoaoChoma/teste_software_2026/blob/main/aulas/SEMANA14/TESTE%20USUARIO%20FINAL.pdf).
- Brooke, J. [SUS - A quick and dirty usability scale, questionário e pontuação, disponibilizado pela AHRQ](https://digital.ahrq.gov/sites/default/files/docs/survey/systemusabilityscale%2528sus%2529_comp%255B1%255D.pdf).
