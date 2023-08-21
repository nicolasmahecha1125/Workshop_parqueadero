public class Carro {
    private String Placa;
    private String Marca;
    private String Modelo;
    public Carro(String Placa,String Marca,String Modelo){
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    public String getPlaca() {
        return Placa;
    }
    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
}
