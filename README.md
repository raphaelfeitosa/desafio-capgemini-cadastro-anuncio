<h1 align="center">
			Teste de programação - Cadastro de anuncios
</h1>

<h4 align="center">
	🚧 🚀 Concluído 🚀 🚧
</h4>


## :speech_balloon: O que há neste documento
<!--ts-->
   * [Missão deste projeto](#-missão-deste-projeto)
   * [Executando todos os testes](#-executando-todos-os-testes)
   * [Executando o projeto com docker](#-executando-o-projeto-com-docker)
   * [Executando o projeto localmente](#-executando-o-projeto-localmente)
   * [Tecnologias](#-tecnologias)
   * [Endpoints disponíveis](#-endpoints-disponíveis)
   * [Autor](#-autor)
<!--te-->

## :hammer: Missão deste projeto

_Criar um sistema que permita o cadastro de anúncios. O anúncio deverá conter os seguintes dados:_
> - _**nome do anúncio**_
> - _**cliente**_
> - _**data de início**_
> - _**data de término**_
> - _**investimento por dia**_

_O sistema fornecerá os relatórios de cada anúncio contendo:_
> - _**valor total investido**_
> - _**quantidade máxima de visualizações**_
> - _**quantidade máxima de cliques**_
> - _**quantidade máxima de compartilhamentos**_
> - _**investimento por dia**_

_Os relatórios poderão ser filtrados por intervalo de tempo e cliente._


## Executando todos os testes

No terminal, navegue até a pasta raiz do projeto e execute

```shell
./mvnw test
```
no Windows

```shell
mvnw.cmd test
```

## :whale: Executando o projeto com docker

No terminal, navegue até a pasta raiz do projeto e execute

```shell
docker-compose up --build
```

## :computer: Executando o projeto localmente

Para que não seja necessário instalar nada em sua máquina, vamos alterar o banco de dados da nossa aplicação para um banco em mémoria.

Agora, reescreva o arquivo [application.yml](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/blob/main/src/main/resources/application.yml) da seguinte forma

```yml
spring:
  datasource:
    url: jdbc:h2:mem:anuncio_db
    username: sa
    password:
    driver-class-name: org.h2.Driver
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.H2Dialect
```

Agora no terminal, navegue até a pasta raiz do projeto e execute

```shell
./mvnw clean install 
```

no Windows

```shell
mvnw.cmd clean install 
```

Após a conclusão, execute

```shell
./mvnw spring-boot:run
```

no Windows

```shell
mvnw.cmd spring-boot:run
```

## :toolbox: Tecnologias

As seguintes tecnologias foram usadas na construção do projeto:


-   **[Spring Boot](https://spring.io/projects/spring-boot)**
-   **[DB H2](https://www.h2database.com)**
-   **[DB MySQL](https://www.mysql.com/)**
-   **[Docker](https://www.docker.com/)**

## :mag_right: Endpoints disponíveis

Antecedido por http://\<seu-host\>:8080 temos os endpoints

- /anuncios \(POST\) - HTTP Response 201 Created 

<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/blob/main/assets/cadastro-anuncio.png?raw=true" />
</p>

- /relatorios/anuncios/{id} \(GET\) - HTTP Response 200 Ok


<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/blob/main/assets/relatorio-cadastro-anuncio.png?raw=true" />
</p>

- /relatorios/?cliente={Cliente}={DataInicio}&fim={DataTermino} \(GET\) - HTTP Response 200 Ok


<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/blob/main/assets/relatorio-cliente-intervalo-tempo.png?raw=true" />
</p>


## :rocket: Autor

Raphael Feitosa

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/raphael-feitosa/) <a href="mailto:raphaelcs2@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>

