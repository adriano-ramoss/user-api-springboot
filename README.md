# API REST para gerenciamento de usuários

Essa é uma API REST simples feita em Java usando o Spring Boot que permite inserir e deletar usuários.

## Como utilizar

Clone o repositório em sua máquina local:
Abra o projeto em sua IDE de preferência (por exemplo, Eclipse ou IntelliJ IDEA).
Inicie a aplicação executando a classe principal SuaApiApplication.java.
A API está pronta para receber requisições

## Testando a API

Você pode testar essa API utilizando o Postman ou outra ferramenta de sua preferência. Abaixo estão alguns exemplos de requisições:

### Inserir usuário

Selecione o método POST.
Insira a URL http://localhost:8080/usuarios.
Selecione a aba "Body".
Selecione "JSON" como tipo de dados.
Insira o corpo da requisição conforme descrito acima.
Clique em "Send".

###  Deletar usuário
Selecione o método DELETE.
Insira a URL http://localhost:8080/usuarios/{id} substituindo {id} pelo ID do usuário que deseja deletar.
Clique em "Send".

## Considerações finais

Essa é uma API REST simples que não possui conexão com um banco de dados. Ela foi desenvolvida apenas para exemplificar a lógica de inserção
e exclusão de usuários em uma API REST usando o Spring Boot.
