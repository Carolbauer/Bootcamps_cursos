#language: pt
#enconding: UTF-8

Funcionalidade: Login

@login
Cenario: usuario invalido
Quando eu informar o usuario "caroline"
E informar a senha "asd"
E clicar no acessar
Entao o sistema exibe a mensagem de usuario invalido

@registro
Cenario: registrar usuario
Quando eu clicar no registrar o sistema abre a pagina de registro de usuarios
E informa no campo email "bauercaca@gmail.com"
E informa no campo name "Caroline"
E informa no campo password "desafio123"
E informa no campo passwordConfirmation "desafio123"
E clica no botao cadastrar
Entao o sistema cadastra o usuario "Caroline"

@loginSucesso
Cenario: Realizar login
Quando eu informar o usuario "bauercaca@gmail.com"
E informar a senha "desafio123"
E clicar no acessar
Entao o sistema exibe o usuario logado