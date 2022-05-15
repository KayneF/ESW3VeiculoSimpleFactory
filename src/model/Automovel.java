package model;

public class Automovel extends Veiculo {

    private int portas;
    private int ano;


    // GETTERS SETTERS
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "ID='" + getId() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocidadeMax=" + getVelocidadeMax() +
                ", portas=" + this.getPortas() +
                ", ano=" + this.getAno() +
                '}';
    }

}
