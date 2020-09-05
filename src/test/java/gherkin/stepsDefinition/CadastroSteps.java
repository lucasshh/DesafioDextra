package gherkin.stepsDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroFormPage;
import pages.HomePage;
import suporte.DriverManager;

public class CadastroSteps extends DriverManager {

    private HomePage home;
    private CadastroFormPage cadastro;

    public CadastroSteps(){

        home = new HomePage(driver);
        cadastro = new CadastroFormPage(driver);

    }

    @Dado("^que eu acesso a pagina de cadastro$")
    public void que_eu_acesso_a_pagina_de_cadastro() throws Throwable {
        home.clicarSignUp();

    }

    @Dado("^que eu queira realizar o cadastro com email \"([^\"]*)\"$")
    public void que_eu_queira_realizar_o_cadastro_com_email(String email) throws Throwable {
        cadastro.digitarEmail(email);

    }

    @Dado("^com a senha \"([^\"]*)\"$")
    public void com_a_senha(String senha) throws Throwable {
        cadastro.digitarSenha(senha);

    }

    @Quando("^eu confirmar o cadastro$")
    public void eu_confirmar_o_cadastro() throws Throwable {
        cadastro.clicarSubmit();

    }

    @Entao("^deverei ver a mensagem \"([^\"]*)\"$")
    public void deverei_ver_a_mensagem(String mensagem) throws Throwable {
        cadastro.validarMensagem(mensagem);

    }


    @Dado("^com o cpf \"([^\"]*)\"$")
    public void com_o_cpf(String cpf) throws Throwable {
        cadastro.digitarCpf(cpf);

    }

    @Dado("^que eu tenha o email \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void que_eu_tenha_o_email_e_a_senha(String email, String senha) throws Throwable {
        cadastro.digitarEmail(email);
        cadastro.digitarSenha(senha);
    }

    @Dado("^com preencha com o cpf \"([^\"]*)\" e o nome \"([^\"]*)\"$")
    public void com_preencha_com_o_cpf_e_o_nome(String cpf, String nome) throws Throwable {
        cadastro.digitarCpf(cpf);
        cadastro.digitarNome(nome);
        cadastro.digitarDataNasc("17/09/1995");
        cadastro.selecionarSexo();
        cadastro.digitarTelefone("16987877767");

    }

    @Entao("^deverei estar logado no sistema com meu novo usuario$")
    public void deverei_estar_logado_no_sistema_com_meu_novo_usuario() throws Throwable {
      cadastro.validarLogadoNoSistema();
    }
}
