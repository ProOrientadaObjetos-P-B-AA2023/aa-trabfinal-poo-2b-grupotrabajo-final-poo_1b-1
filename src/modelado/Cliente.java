package modelado;

public class Cliente {
    private String nombre;
    private String ceula;
    private String ciudad;
    private String marca;
    private String modelo;
    private String numeroCelular;
    private double pagoMensual;
    private int edad;
    private char genero;

    public Cliente(String nombre, String ceula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, int edad, char genero) {
        this.nombre = nombre;
        this.ceula = ceula;
        this.ciudad = ciudad;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCelular = numeroCelular;
        this.pagoMensual = pagoMensual;
        this.edad = edad;
        this.genero = genero;
    }

    // Getters && Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCeula() {
        return ceula;
    }

    public void setCeula(String ceula) {
        this.ceula = ceula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
        this.modelo = modelo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
