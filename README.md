# Marco Túlio Santana Nascimento

# Projeto HelpBrasil

O projeto HelpBrasil é uma aplicação Java Spring Boot que visa fornecer informações e dados relacionados à ação contra a mudança global do clima, em conformidade com o Objetivo de Desenvolvimento Sustentável número 13.

## Pré-requisitos

Para executar este projeto, certifique-se de que sua máquina atenda aos seguintes pré-requisitos:

- Java 17
- Maven
- Docker
- MySQL

Certifique-se de que o Docker esteja em execução para iniciar o contêiner do MySQL.

## Configuração do Projeto

1. Clone o repositório do projeto para sua máquina local.
2. Certifique-se de que o Docker esteja em execução.
3. Execute o seguinte comando para iniciar o contêiner do MySQL:

```
docker-compose up -d
```

4. Importe a collection do Postman localizada na pasta `postman_collection` para o seu ambiente do Postman.
5. Abra o projeto em sua IDE preferida.
6. Certifique-se de ter o Java 17 configurado como JDK do projeto.
7. Construa o projeto com Maven:

```
mvn clean install
```

8. Execute o projeto Spring Boot:

```
mvn spring-boot:run
```

Agora você pode começar a usar a aplicação HelpBrasil!

## Collection do Postman

A collection do Postman contém exemplos de requisições para interagir com os endpoints da aplicação. Certifique-se de importar esta collection para o Postman para facilitar o teste e desenvolvimento da aplicação.
