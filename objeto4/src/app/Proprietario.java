package app;

//importando bibliotecas
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//criando classe proprietario
public class Proprietario {

    // Define o formato da tada utilizando a função ofPattern
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // declara variavel com dado
    private String dataNascimento = "15-05-1986";

    // declara variaveis
    private LocalDate date = LocalDate.parse(dataNascimento, formatter);
    private String Nome;
    private String CPF;
    private String RG;

    /*
     * metodos para retornar e armazenar a data formatada, data de nascimento, data,
     * nome, cpf, rg
     */
    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    // metodo para informar os dados anteriores em string
    public Proprietario(String dataNascimento, String nome, String cPF, String rG) {
        this.dataNascimento = dataNascimento;
        Nome = nome;
        CPF = cPF;
        RG = rG;
    }

}