#Author: acsaaba@hotmail.com

@regressivos
Feature: Realizar login no site saucedemo
 Como usuario do site saucedemo
 Quero informar os dados de acesso
 Para acessar a conta
 
  Background: Acessar tela de login
  Given que esteja na tela de login

   Scenario Outline: Title of your scenario outline
   When informar o usuario <usuario>
   And informar a senha <senha>
   Then validar a mensagem <mensagem>

    Examples: 
    | usuario         | senha          | mensagem                                   |
    | "standard_user" | "secret_sauce" | "https://www.saucedemo.com/inventory.html" |
    | "standard_user" | ""             | "Epic sadface: Password is required" |
    | ""              | "secret_sauce" | "Epic sadface: Username is required" |
    | ""              | ""             | "Epic sadface: Username is required" |
    | "a"             | "a"            | "Epic sadface: Username and password do not match any user in this service" |
    
    
