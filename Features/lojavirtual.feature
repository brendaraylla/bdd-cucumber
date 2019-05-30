Feature: Loja virtualV pagina para cirar conta tem que verificar todos os atributos

	Scenario Outline: Invalidar entrada do campo email deve retornar erro Exemplo de uma falha
	Given Eu estou no site
	When Eu clico no botao "sign in" na pagina "Home"
		And Eu clico no "registro" na pagina "Sign in"
		And Eu entro "texst@test.com" dentro de todos os campos da pagina
		And Eu limpo o "<field>" campo na Pagina Criar Conta
		And Eu clico "submit" na pagina "Create Account"
	Then o "<error>" na pagina "Create Account" deve ser "visible"

	Examples:
	| field				| error								| expected_text			|
	| name				| erro_nome_nao_informado			| entre com seu nome	|
	| email				| erro_email_nao_informado			| entre com email		|
	| password			| erro_password_nao_informado		| senha					|
	| confirm_password	| erro_confirma_password_informado	| senha errada			|
