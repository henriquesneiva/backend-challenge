# backend-challenge

## Objetivo do projeto:
Aplicação que exponha uma api web que valide se uma senha é válida.

## Requisitos da senha:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

Input: Uma senha (string).  
Output: Um boolean indicando se a senha é válida.

## Tecnologias escolhida para esta aplicação:
* java 11;
* Spring boot;
* Junit 5;
* Angular 13;
* firebase para deploy do frontEnd;
* Heroku para deploy do backEnd;

## Maneiras de usar da aplicaçõa:

### Primeiro: 
- entrando no site https://backend-challege.web.app/
- colocar a senha no imput e apertar o botão (Validar Senha);
- em seguida será exibida um pop-up informando se a senha esta valida 

![](img-readm/valid.png)

> **Observação:_** Caso a aplicação não apresente um retorno basta aguardar serca de 5 a 10 minutos, estou usando ferramenta gratuita e tem algumas limitações.

### Segundo:

#### Para rodar os projetos localmente é necessárop os seguintes requisitos:
*  instalar [Node js](https://nodejs.org/en/download/)
*  instalar [Maven](https://maven.apache.org/download.cgi)
*  instalar [Loombock](https://projectlombok.org/download)
#### Depois de ter baixado os intens acima vamos ao seguinte passos:
- clone este repositorio e o repositorio  (https://github.com/henriquesneiva/chalenge-itau-front)
- abra o backend na sua IDE e execute o comando ``` mvn clean install ``` e em seguida rode o projeto
- abra o frontEnd que vocêbaixou e executo o comando ``` npm install  ``` e em seguida rode o projeto com o comando ``` ng serve ```
- va no navegador e coloque o seguinte endereço -  http://localhost:4200/
