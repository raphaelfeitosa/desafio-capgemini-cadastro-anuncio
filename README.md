<h1 align="center">
			Teste de programação - Cadastro de anuncios
</h1>

<h4 align="center">
	🚧 🚀 Concluído 🚀 🚧
</h4>


## :speech_balloon: O que há neste documento
- [Missão deste projeto](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio#hammermissão-deste-projeto)
- [Executando todos os testes](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio#executando-todos-os-testes)
- [Executando o projeto com Docker](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio#whaleexecutando-o-projeto-com-docker)
- [Executando o projeto localmente](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio#computerexecutando-o-projeto-localmente)
- [Tecnologias](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/#mag_righttecnologias)
- [Endpoints disponíveis](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/#mag_rightendpoints-disponíveis)
- [Autor](https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/#mag_rightautor)

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

## :whale:Executando o projeto com Docker

No terminal, navegue até a pasta raiz do projeto e execute

```shell
docker-compose up
```

## :computer:Executando o projeto localmente

Para que não seja necessário instalar nada em sua máquina, a aplicação esta configurada para salvar os dados no banco de dados em mémoria.

No terminal, navegue até a pasta raiz do projeto e execute

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

## :🛠:Tecnologias

As seguintes tecnologias foram usadas na construção do projeto:


-   **[Spring Boot](https://spring.io/projects/spring-boot)**
-   **[DB H2](https://www.h2database.com)**

## :mag_right:Endpoints disponíveis

Antecedido por http://\<seu-host\>:8080 temos os endpoints

- /anuncios \(POST\) - HTTP Response 201 Created 

<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/tree/main/assets/cadastro-anuncio.png?raw=true" />
</p>

- /relatorios/anuncios/{id} \(GET\) - HTTP Response 200 Ok


<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/tree/main/assets/relatorio-cadastro-anuncio.png?raw=true" />
</p>

- /relatorios/?cliente={Cliente}={DataInicio}&fim={DataTermino} \(GET\) - HTTP Response 200 Ok


<p align="center" style="display: flex; align-items: flex-start; justify-content: center;">
  <img alt="Vendas" title="#Home" src="https://github.com/raphaelfeitosa/desafio-capgemini-cadastro-anuncio/tree/main/assets/relatorio-cliente-intervalo-tempo.png?raw=true" />
</p>


## 🦸 Autor

Raphael Feitosa

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/raphael-feitosa/) <a href="mailto:raphaelcs2@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>

