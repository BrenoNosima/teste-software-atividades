# Execução incremental de TDD

Esta pasta registra uma reprodução por requisito, executada depois da primeira implementação agrupada. Foram usadas cópias isoladas dos projetos; os arquivos finais da entrega não foram substituídos pelas versões intermediárias.

Em cada etapa, a suíte seleciona o teste do novo requisito e mantém os testes dos requisitos anteriores. O arquivo `NN-antes.log` registra o resultado antes da alteração; `NN-depois.log`, o resultado depois; `NN-NomeDaClasse.java.txt`, a implementação daquela etapa. A validação do preço do produto do carrinho é introduzida na etapa 5.

Alguns testes já passam por consequência de uma implementação anterior ou dos valores iniciais. Nesses casos, o relatório registra GREEN antes e depois, sem provocar uma falha artificial. A primeira etapa do carrinho usa assinaturas mínimas para permitir compilar os testes; a consulta do total ainda lança uma exceção até sua implementação.

O arquivo `final-refatorado.log` verifica a suíte completa e a cobertura da versão final. O arquivo `resumo.json` lista os códigos de saída de todas as etapas: zero significa execução aprovada; diferente de zero indica falha antes da implementação.

As versões intermediárias são material de estudo. Os arquivos Java para executar estão nas pastas `SEMANA10/*/src`.
