package model;

public class Veiculo {

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int velocidadeMax;


    // GETTERS SETTERS
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocidadeMax=" + getVelocidadeMax() +
                '}';
    }


}
