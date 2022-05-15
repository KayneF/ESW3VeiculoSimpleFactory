package controller;

import model.*;

public class VeiculoFactory {

    public Veiculo setVeiculo(Veiculo v){
        if (v.getId() == 1) {
            Automovel ve = new Automovel();
            ve.setId(1);
            ve.setPlaca("CH-1434");
            ve.setMarca("Honda");
            ve.setModelo("City");
            ve.setCor("Azul");
            ve.setVelocidadeMax(280);
            ve.setPortas(4);
            ve.setAno(2018);
            return ve;
        }
        else if(v.getId() == 2) {
            Caminhao ve = new Caminhao();
            ve.setId(2);
            ve.setPlaca("CS-3599");
            ve.setMarca("Scania");
            ve.setModelo("Linha R");
            ve.setCor("Preto");
            ve.setVelocidadeMax(160);
            ve.setEixos(9);
            ve.setCargaMax(10000);
            return ve;
        }
        else if(v.getId() == 3){
            Motocicleta ve = new Motocicleta();
            ve.setId(3);
            ve.setPlaca("MH-2020");
            ve.setMarca("Honda");
            ve.setModelo("CB650R");
            ve.setCor("Vermelho");
            ve.setVelocidadeMax(220);
            ve.setCilindradas(88);
            return ve;
        }
        else if(v.getId() == 4) {
            Van ve = new Van();
            ve.setId(4);
            ve.setPlaca("VF-3702");
            ve.setMarca("Ford");
            ve.setModelo("E-Transit");
            ve.setCor("Prata");
            return ve;
        }
        return null;
    }

}
