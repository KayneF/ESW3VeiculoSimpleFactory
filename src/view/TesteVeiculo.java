package view;

import controller.ControleVeiculo;
import controller.VeiculoFactory;
import model.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();
//        v.setId(1);
//        v.setId(2);
//        v.setId(3);
        v.setId(4);

        VeiculoFactory veiculo = new VeiculoFactory();
        ControleVeiculo controle = new ControleVeiculo();
        Veiculo iniVeiculo = veiculo.setVeiculo(v);
        controle.inicioMovimentacao(iniVeiculo);
        controle.movimentacaoVeiculo(iniVeiculo);

    }
}
