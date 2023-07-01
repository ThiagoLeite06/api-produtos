# Projeto Java com Spring e Banco de Dados H2

Este é um projeto Java de exemplo que utiliza o framework Spring e o banco de dados H2. O objetivo deste projeto é demonstrar como configurar e utilizar o Spring com o H2 para o desenvolvimento de aplicações Java.

## Pré-requisitos

Antes de começar, verifique se o seguinte software está instalado em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) versão 8 ou superior
- Apache Maven
- Spring Boot

## Configuração do Banco de Dados H2

O banco de dados H2 é um banco de dados em memória muito útil para o desenvolvimento e testes de aplicações Java. Para utilizar o H2 neste projeto, siga as etapas abaixo:

1. Abra o arquivo `application.properties` localizado na pasta `src/main/resources`.
2. Verifique se as configurações do H2 estão definidas corretamente:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

## Executando o Projeto

Para executar o projeto, siga as etapas abaixo:

1. Abra um terminal na pasta raiz do projeto.
2. Execute o comando `mvn spring-boot:run`.
3. O projeto será compilado e o servidor embutido do Spring será iniciado.
4. Acesse `http://localhost:8080` em seu navegador para visualizar a aplicação.

## Documentação Adicional

Este projeto é apenas um exemplo básico de configuração do Spring com o H2. Para obter mais informações sobre o uso do Spring e do H2, consulte a documentação oficial:

- [Documentação do Spring Framework](https://spring.io/projects/spring-framework)
- [Documentação do Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação do Banco de Dados H2](https://www.h2database.com/html/main.html)

## Contribuição

Contribuições para a melhoria deste projeto são bem-vindas. Sinta-se à vontade para abrir uma issue ou enviar um pull request com suas sugestões.

