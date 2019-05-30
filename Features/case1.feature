Feature: Retirada do dinheiro 
Scenario: Quando o cliente nao possuir saldo suficiente em conta e possuir o limite de credito aprovado
Given Saldo da conta for 500.00 reais
	When Saldo da conta for 500.00 reais e possuir limite de credito aprovado maior que 600.00 reais
		And cliente nao possuir saldo suficiente em sua conta
	Then Cliente deve receber o valor de 600.00 reais
		And conta do cliente fica com 100.00 reais negativos
