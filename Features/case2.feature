Feature: Criar conta no facebook  
Scenario: Quando o usuario acessar a tela inicial do facebook sera apresentado os campos para criar uma nova conta
Given: Usuario na tela inicial do facebook
	When O Usuario preencher os campos campos para um novo cadastro
	And possuir um email ou telefone
	Then cria a conta
	And exibe a mensagem de conta criada com sucesso
	And rediriciona o usuario para a pagina inicial