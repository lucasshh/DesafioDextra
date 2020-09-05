package gherkin.stepsDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.*;
import suporte.DriverManager;

public class CompraSteps extends DriverManager {

    private BuscaPage busca;
    private AddCelPage add;
    private CarrinhoPage carrinho;
    private GarantiaPage garantia;
    private SecretaPage secreta;


    public CompraSteps() {

        busca = new BuscaPage(driver);
        add = new AddCelPage(driver);
        carrinho = new CarrinhoPage(driver);
        garantia = new GarantiaPage(driver);
        secreta = new SecretaPage(driver);

    }

    @Dado("^que eu busco pelo produto \"([^\"]*)\"$")
    public void que_eu_busco_pelo_produto(String celular) throws Throwable {
        secreta.clicarBusca(celular);


    }

    @Dado("^seleciono o primeiro retorno$")
    public void seleciono_o_primeiro_retorno() throws Throwable {
        busca.selecionarCelular();


    }

    @Quando("^eu clicar em comprar$")
    public void eu_clicar_em_comprar() throws Throwable {
        add.clicarEmComprar();
        garantia.clicarContinuar();


    }

    @Quando("^incluir mais um produto na cesta$")
    public void incluir_mais_um_produto_na_cesta() throws Throwable {
        carrinho.addQuantidade();




    }

    @Entao("^devo visualizar a opção de parcelamento em \"([^\"]*)\"$")
    public void devo_visualizar_a_opção_de_parcelamento_em(String parcelamento) throws Throwable {
        carrinho.validarParcelamento(parcelamento);


    }

    @Entao("^que o valor total de produtos é inferior a \"([^\"]*)\"$")
    public void que_o_valor_total_de_produtos_é_inferior_a(Integer total) throws Throwable {
        carrinho.validarValorTotal(total);

    }


}