Feature: Administrador mudar a senha de outros usuarios
Scenario: Quando o usuario administrador estiver logado no sistema de RH com uma conta administrador
Given Usuario for administrador
	When Atualizar a senha de de outro usuario
	Then Recebe a mensagem de senha atualizada com sucesso
	And a senha antiga do usuario e atualizada para a nova senha