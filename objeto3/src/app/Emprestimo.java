package app;

//importando biblioteca
import java.time.LocalDate;

//criando classe emprestimo
public class Emprestimo {

    // declarando variaveis
    private LocalDate retirada;
    private LocalDate devolucao;
    private int validade;
    private int cpfPessoa;
    private String contato;
    private int isbnLivro;

    /*
     * metodo para armazenar data de retirada e devolução, cpf da pessoa, contato e
     * isbn do livro
     */
    public Emprestimo(LocalDate retirada, LocalDate devolucao, int cpfPessoa, String contato, int isbnLivro) {
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.cpfPessoa = cpfPessoa;
        this.contato = contato;
        this.isbnLivro = isbnLivro;
    }

    // metodos para armazenar e retornar os dados anteriores
    public int getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(int cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(int isbnLivro) {
        this.isbnLivro = isbnLivro;
    }

    public LocalDate getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDate retirada) {
        this.retirada = retirada;
    }

    public LocalDate getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDate devolucao) {
        this.devolucao = devolucao;
    }

    //metodo para informar validade do emprestimo
    public int getValidade() {

        LocalDate hoje = LocalDate.now();
        int validade = getDevolucao().compareTo(hoje);
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    //informa os dados em string
    @Override
    public String toString() {
        return "Emprestimo : contato Pessoa" + contato + ", cpfPessoa=" + cpfPessoa + ", Data devolucao :" + devolucao
                + ", isbnLivro=" + isbnLivro + ", retirada=" + retirada + ", Faltam: " + getValidade() + "dias";
    }
}