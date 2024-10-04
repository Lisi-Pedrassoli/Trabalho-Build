import ProjetoPizza.PizzaBuilder;
import ProjetoPizza.Pizza;
import ProjetoRelatorio.Relatorio;
import ProjetoRelatorio.RelatorioBuilder;
import ProjetoVeiculo.Veiculo;
import ProjetoVeiculo.VeiculoBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaChocolate = new PizzaBuilder()
                .setAddIngrendientes("Chocolate e Morango")
                .setMassa("Doce")
                .setTamanho("Media")
                .build();

        System.out.println(pizzaChocolate.toString());
        System.out.println("--------------------------------------------------------------");



        Veiculo veiculo = new VeiculoBuilder()
                .setCor("rosa")
                .setRodas(2)
                .setTipo("moto")
                .build();

        System.out.println(veiculo.toString());
        System.out.println("--------------------------------------------------------------");

        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Receita de Toddynho")
                .setCorpo("Aqueça o leite em uma panela em fogo médio, sem deixar ferver.\n" +
                        "Adicione o Toddy ao leite.\n" +
                        "Mexa bem até que tudo esteja completamente dissolvido e homogêneo.\n" +
                        "Se desejar, adicione uma pitada de canela para um sabor extra.\n" +
                        "Sirva quente em uma caneca.")
                .setRodape("E seja feliz :) <3")
                .build();

        System.out.println(relatorio.toString());
    }
}