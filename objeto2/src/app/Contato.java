package app;

//criando classe contato
public class Contato {

    //declarando variaveis
    String nome;
    int telefone;

    //metodo para armazenar nome e telefone
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //metodos para retornar e armazenar nome e telefone
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}