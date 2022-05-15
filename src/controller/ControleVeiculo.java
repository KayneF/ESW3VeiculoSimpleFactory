package controller;

import model.Motocicleta;
import model.Veiculo;

public class ControleVeiculo {

    public void inicioMovimentacao(Veiculo v){
        System.out.println("\nO veículo iniciou a movimentação. \n" + v.toString());
    }

    public void movimentacaoVeiculo(Veiculo v){
        if (v.getId() == 1){
            int tempo = 0;
            int seg = (int)((Math.random()*30)+10);
            for (int i=0; i<100; i++){
                tempo = (seg * i);
                tempo = (tempo / 60);
            }
            System.out.println("Tempo para atingir a velocidade de 100kmh: " + tempo + "seg.");

            int km = (int)((Math.random()*650)+50);
            tempo = (km / 100);
            System.out.println("O veículo levará aproximadamente " + tempo + "h para se deslocar por " + km + "km.");

            int pax = (int)((Math.random()*4)+1);
            System.out.println("O veículo estará transportando " + pax + " passageiros.");
        }

        else if (v.getId() == 2){
            int kg = (int)((Math.random()*3000)+1000);
            System.out.println("O veículo estará transportando " + kg + "kg de carga.");
            int km = (int)((Math.random()*3000)+500);
            System.out.println("O veículo irá se deslocar por " + km + "km.");
            int frete = (int)((Math.random()*5000)+2000);
            System.out.println("O frete a ser cobrado será de R$" + frete + " incluindo taxas.");
        }

        else if (v.getId() == 3){
            Motocicleta moto1 = new Motocicleta();
            int km = (int)((Math.random()*100)+20);
            System.out.println("O veículo irá se deslocar por " + km + "km.");
            int frete = (int)((Math.random()*80)+30);
            System.out.println("O frete a ser cobrado será de R$" + frete + ".");
        }

        else if (v.getId() == 4){
            int pax = (int)((Math.random()*12)+3);
            System.out.println("O número de passageiros a serem transportados é de " + pax + " pessoas.");
            int paradas = (int)((Math.random()*12)+3);
            System.out.println("O número de paradas que serão realizadas durante o trajeto será de " + paradas + " paradas.");
        }
    }
}
