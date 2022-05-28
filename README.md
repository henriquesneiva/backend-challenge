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

> Caso queira ver a implementação desse serviço so acessar este repositorio https://github.com/henriquesneiva/chalenge-itau-front:

## Maneiras de usar da aplicaçõa:

* 1 - entrando no site https://backend-challege.web.app/
    - colocar a senha no imput e apertar o botão (Validar Senha);
    - em seguida será exibida um pop-up informando se a senha esta valida 
> **Observação:_** Caso a aplicação não apresente um retorno basta aguardar serca de 5 a 10 minutos, estou usando ferramenta gratuita e tem algumas limitações.

* 2 - clone este repositorio e o repositorio  (https://github.com/henriquesneiva/chalenge-itau-front)
    - abra o backend na sua IDE e execute o comando ``` mvn clean install ``` e em seguida rode o projeto
    - abra o frontEnd que você baixou e executo o comando ``` npm install ```  e em seguida rode o projeto com o comando ``` ng serve ```
    - va no navegador e coloque o seguinte endereço -  http://localhost:4200/
