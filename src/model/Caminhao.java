package model;

public class Caminhao extends Veiculo {

    private int eixos;
    private int cargaMax;


    // GETTERS SETTERS
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getCargaMax() {
        return cargaMax;
    }
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "ID='" + getId() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocidadeMax=" + getVelocidadeMax() +
                ", eixos=" + getEixos() +
                ", cargaMax=" + getCargaMax() +
                '}';
    }
}
