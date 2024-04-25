# PetShop Backend
O backend do projeto do Canil do Senhor Eduardo é a api responsavel por registrar todos os PetShops com seus respectivos dados, e realizar os calculos para decidir qual o melhor PetShop.


## Tecnologias

- [Spring Boot]- Versão 3.2.5

- [Java] - Versão 17

- [MySQL] - Banco de dados relacional
 
# Setup da aplicação (local)

## Pré-requisito

Antes de rodar a aplicação é preciso garantir que as seguintes dependências estejam corretamente instaladas:

Java 17
Maven
MySQL

## Preparando ambiente

### Base de Dados

- O banco de dados é criado e povoado utilizando migrations com FlyWay para ser possível um melhor gerenciamento e segurança do esquema. 

### Variáveis de Ambiente

Configure as variáveis de ambiente de acordo com os seus dados para rodar a aplicação. A aplicação utuliza as seguintes variáveis de ambiente:

- ${MYSQL_USER}
- ${MYSQL_PASS}


## Instalação da aplicação

Primeiramente, faça o clone do repositório:
```sh
 https://github.com/larisilvapedrosa/Canil_Senhor_Eduardo.git
```
Feito isso, acesse o projeto:
```sh
 cd Canil_Senhor_Eduardo\petshop-backend
```
É preciso compilar o código e baixar as dependências do projeto:
```sh
 mvn clean package
```
Finalizado esse passo, vamos iniciar a aplicação:
```sh
 mvn spring-boot:run
```
Pronto. A aplicação está disponível em http://localhost:8080/api/v1

> Tomcat started on port(s): 8080 (http) with contextpath '/api/v1'
Started AppConfig in xxxx seconds (JVM running for xxxx)
