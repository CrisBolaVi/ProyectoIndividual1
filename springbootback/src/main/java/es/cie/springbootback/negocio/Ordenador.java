package es.cie.springbootback.negocio;

public class Ordenador {

    private String modelo;
    private String marca;
    private double precio;
    private String numserie;

    public Ordenador(String modelo, String marca, double precio,String numserie) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.numserie = numserie;
    }

    public Ordenador(String numserie) {
        this.numserie = numserie;
    }

    public Ordenador() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    
    public double getPrecio() {
        return precio;
    }
    
    public void setprecio(double precio) {
        this.precio = precio;
    }
    public String getNumserie() {
        return numserie;
    }

    public void setnumserie(String numserie) {
        this.numserie = numserie;
    }

}
