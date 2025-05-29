package model;

public class Cliente extends Servico {
    private String nome;
    private int cpf;
    private int telefone;

    public Cliente(){}

    public void CadastrarServico(int protocolo) {
        this.setProtocolo(protocolo);
    }

    public Cliente(int protocolo, String nome, int cpf, int telefone) {
        super(protocolo);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
