package model;

public abstract class Servico {
    private int protocolo;

    public Servico() {// construtor vazio
    }

    public Servico(int protocolo) { // contrustor protocolo
        this.protocolo = protocolo;
    }

    public abstract void CadastrarServico(int protocolo); // método abstrato de cadastro de serviço

    // getters e setters
    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

}
