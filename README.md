# API REST para gerenciamento de usuários

Essa é uma API REST simples feita em Java usando o Spring Boot que permite inserir e deletar usuários.

## Como utilizar

Clone o repositório em sua máquina local:<br>
Abra o projeto em sua IDE de preferência (por exemplo, Eclipse ou IntelliJ IDEA).<br>
Inicie a aplicação executando a classe principal SuaApiApplication.java.<br>
A API está pronta para receber requisições<br>

## Testando a API

Você pode testar essa API utilizando o Postman ou outra ferramenta de sua preferência. Abaixo estão alguns exemplos de requisições:

### Inserir usuário

Selecione o método POST.<br>
Insira a URL http://localhost:8080/usuarios.<br>
Selecione a aba "Body".<br>
Selecione "JSON" como tipo de dados.<br>
Insira o corpo da requisição conforme descrito acima.<br>
Clique em "Send".<br>

###  Deletar usuário
Selecione o método DELETE.<br>
Insira a URL http://localhost:8080/usuarios/{id} substituindo {id} pelo ID do usuário que deseja deletar.<br>
Clique em "Send".<br>

## Considerações finais

Essa é uma API REST simples que não possui conexão com um banco de dados. Ela foi desenvolvida apenas para exemplificar a lógica de inserção
e exclusão de usuários em uma API REST usando o Spring Boot.
<br>

###Referência
https://glysns.gitbook.io/spring-framework/spring-web/introducao
