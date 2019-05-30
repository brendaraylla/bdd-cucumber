Feature: Adicionar um produto no login
Scenario: Quando adicionar um produto no carrinho e estiver logado
Given Cliente estiver logado
	When Adicionar o produto no carrinho
	And calcular o frete
	Then Exibe o produto no carrinho
	And o valor do frete