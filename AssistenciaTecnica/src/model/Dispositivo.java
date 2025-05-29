package model;

public class Dispositivo {
    private String modelo;
    private String defeito;
    private Cliente cliente;
    private double ValorServico;
    
    // construtor vazio
    public Dispositivo() {
    }
   

    // construtor total
    public Dispositivo(String modelo, String defeito, Cliente cliente, double valorServico) {
        this.modelo = modelo;
        this.defeito = defeito;
        this.cliente = cliente;
        this.ValorServico = valorServico;
    }

    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = getCliente();
    }

    public double getValorServico() {
        return ValorServico;
    }

    public void setValorServico(double valorServico) {
        ValorServico = valorServico;
    }
}
