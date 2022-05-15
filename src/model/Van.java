package model;

public class Van extends Veiculo{

    @Override
    public String toString() {
        return "Van{" +
                "ID='" + getId() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocidadeMax=" + getVelocidadeMax() +
                '}';
    }
}
