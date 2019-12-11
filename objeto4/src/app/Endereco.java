package app;

//criando classe endereço
public class Endereco {

    // declarando variaveis
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String CEP;
    private String Complemento;

    // metodos que retornam e armazenam a rua, bairro, cidade, estado, cep e
    // complemento
    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    // informa os dados anteriores em string
    public Endereco(String rua, String bairro, String cidade, String estado, String cEP, String complemento) {
        Rua = rua;
        Bairro = bairro;
        Cidade = cidade;
        Estado = estado;
        CEP = cEP;
        Complemento = complemento;
    }
}