package app;

//criando classe pessoa
public class Pessoa {

    //declarando variaveis
    private String nome;
    private int cpf;
    private String contato;

    //metodo para armazenar nome, cpf e contato
    public Pessoa(String nome, int cpf,String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato=contato;
    }

    //metodos que armazenam e retornam nome, cpf e contato
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    //informa os dados em string
    @Override
    public String toString() {
        return "Pessoa : Contato=" + contato + ", cpf=" + cpf + ", nome=" + nome + "";
    }
    
}

