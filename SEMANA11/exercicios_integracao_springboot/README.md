# Semana 11 - Testes de integração

O objetivo foi testar a aplicação com os componentes reais do Spring Boot, usando o H2 em memória. Não foram utilizados mocks do Service ou do Repository.

## Executar

Requisitos: JDK 17 e Maven.

```bash
mvn clean verify
```

## Casos implementados

| Caso | Verificação |
|---|---|
| CT01 | Cadastra Teclado por 150, recebe ID e consulta nome e preço no Repository. |
| CT02 | Nome em branco lança exceção e não aumenta a quantidade de registros. |
| CT03 | Cadastra Mouse por 80, atualiza para 95 e consulta o preço persistido. |
| CT04 | POST /produtos retorna HTTP 200 e JSON com ID numérico, nome e preço. |
| CT05 | Obtém o ID do POST e realiza GET /produtos/{id}, conferindo os dados. |
| Extras | Nome nulo, preço zero ou negativo, atualização inválida e ID inexistente. |

São nove testes ao todo. Os testes que verificam persistência chamam `flush()` para enviar as alterações ao banco e `clear()` para limpar o contexto do JPA antes de consultar novamente.

## Respostas da discussão

**Por que consultar pelo Repository?** Conferir só o objeto retornado pelo Service não demonstra que o dado foi persistido. A consulta após `flush()` e `clear()` verifica a leitura a partir do banco.

**O que faz @Transactional no teste?** O Spring abre uma transação para o teste e normalmente faz rollback no final. Assim, os registros de um caso não ficam disponíveis para o seguinte.

**Quais componentes o MockMvc exercita?** A requisição passa pelo tratamento MVC, conversão de JSON, Controller, Service, Repository e H2.

**Por que não há servidor HTTP real?** O MockMvc chama a infraestrutura MVC dentro da aplicação de teste, sem abrir uma porta de rede.

**Qual a diferença para o unitário com mocks?** O unitário isola o Controller. Aqui, erros de configuração, conversão de dados e persistência também podem aparecer.

Os resultados reais da execução estão em `../../evidencias/green/exercicios_integracao_springboot.log`.
