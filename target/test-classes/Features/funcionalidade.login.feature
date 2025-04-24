#Author: acsaaba@hotmail.com

@regressivos
Feature: Realizar login no site saucedemo
 Como usuario do site saucedemo
 Quero informar os dados de acesso
 Para acessar a conta
 
 Background: Acessar tela de login
 Given que esteja na tela de login

@positivo
Scenario: Login valido
 When enviar os dados de login
 Then login realizado com sucesso
 
 @negativo
 Scenario: Login sem preencher o usuario
 * nao preencher o usario
 * preencher a senha
 * clicar no botao login
 * login nao sera realizado com mensagem de usuario obrigatorio
 
 @negativo @slow
 Scenario: Login sem preencher a senha
 When preencher o usario
 But nao preencher a senha
 And clicar no botao login
 Then login nao sera realizado com mensagem de senha obrigatorio
 
 @negativo
 Scenario: Login sem preencher o usuario
 * nao preencher o usario
 * nao preencher a senha
 * clicar no botao login
 * login nao sera realizado com mensagem de usuario obrigatorio
 
