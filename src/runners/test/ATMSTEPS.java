package runners.test;

import java.awt.Desktop;
import java.net.URI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ATMSTEPS {
	// http://dontpad.com/aula05-29caso1

	@Given("^Saldo da conta for (\\d+)\\.(\\d+) reais$")
	public void saldo_da_conta_for_reais(int arg1, int arg2) throws Throwable {
		System.out.println("uia rapaiz, num é q funciona");
	}

	@When("^O Usuario preencher os campos campos para um novo cadastro$")
	public void o_Usuario_preencher_os_campos_campos_para_um_novo_cadastro()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^possuir um email ou telefone$")
	public void possuir_um_email_ou_telefone() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^cria a conta$")
	public void cria_a_conta() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^exibe a mensagem de conta criada com sucesso$")
	public void exibe_a_mensagem_de_conta_criada_com_sucesso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^rediriciona o usuario para a pagina inicial$")
	public void rediriciona_o_usuario_para_a_pagina_inicial() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^Usuario for administrador$")
	public void usuario_for_administrador() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Atualizar a senha de de outro usuario$")
	public void atualizar_a_senha_de_de_outro_usuario() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Recebe a mensagem de senha atualizada com sucesso$")
	public void recebe_a_mensagem_de_senha_atualizada_com_sucesso()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^a senha antiga do usuario e atualizada para a nova senha$")
	public void a_senha_antiga_do_usuario_e_atualizada_para_a_nova_senha()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^Cliente estiver logado$")
	public void cliente_estiver_logado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Adicionar o produto no carrinho$")
	public void adicionar_o_produto_no_carrinho() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^calcular o frete$")
	public void calcular_o_frete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Exibe o produto no carrinho$")
	public void exibe_o_produto_no_carrinho() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^o valor do frete$")
	public void o_valor_do_frete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	// LOJA VIRTUAL
	@Given("^Eu estou no site$")
	public void eu_estou_no_site() throws Throwable {
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("https://www.americanas.com.br/"));
	}

	@When("^Eu clico no botao \"([^\"]*)\" na pagina \"([^\"]*)\"$")
	public void eu_clico_no_botao_na_pagina(String arg1, String arg2)
			throws Throwable {
			System.out.println("Clique no botao: " + arg1 + " da pagina " + arg2);
	}

	@When("^Eu clico no \"([^\"]*)\" na pagina \"([^\"]*)\"$")
	public void eu_clico_no_na_pagina(String arg1, String arg2)
			throws Throwable {
		System.out.println("Clicou em " + arg1 + " da pagina " + arg2);
	}

	@When("^Eu entro \"([^\"]*)\" dentro de todos os campos da pagina$")
	public void eu_entro_dentro_de_todos_os_campos_da_pagina(String arg1)
			throws Throwable {
		 System.out.println("Email " + arg1 + " da pagina.");
	}

	@When("^Eu limpo o \"([^\"]*)\" campo na Pagina Criar Conta$")
	public void eu_limpo_o_campo_na_Pagina_Criar_Conta(String arg1)
			throws Throwable {
		System.out.println("Campo " + arg1 + " limpado!!");
	}

	@When("^Eu clico \"([^\"]*)\" na pagina \"([^\"]*)\"$")
	public void eu_clico_na_pagina(String arg1, String arg2) throws Throwable {
		System.out.println("Clique em SUBMIT " + arg1 + " da pagina " + arg2);
	}

	@Then("^o \"([^\"]*)\" na pagina \"([^\"]*)\" deve ser \"([^\"]*)\"$")
	public void o_na_pagina_deve_ser(String arg1, String arg2, String arg3)
			throws Throwable {
		 System.out.println("MOSTRA O ERRO " + arg1 + " da pagina " + arg2 + " IGUAL A " + arg3);
	}

}
