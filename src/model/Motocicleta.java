package model;

public class Motocicleta extends Veiculo {

    private int cilindradas;


    // GETTERS SETTERS
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "ID='" + getId() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocidadeMax=" + getVelocidadeMax() +
                ", cilindradas=" + getCilindradas() +
                '}';
    }
}
