#Author: e2etreinamentos@e2etreinamentos.com.br

@teste
Feature: Login de usuario
  Como usuario do sistema saucedemo
  Quero enviar os dados de login
  Para acessar a minha conta
  
  Background: Acessar tela de login
   Given que esteja na tela de login
 
 
  Scenario: Login com sucesso
    And preencher o nome
    And preencher a senha
    When clicar no botao login
    Then acesso conta
    
   
   @negativo
  Scenario: Login com senha invalida
    And preencher o nome
    But preencher a senha errada
    When clicar no botao login
    Then valido mensagem de senha invalida