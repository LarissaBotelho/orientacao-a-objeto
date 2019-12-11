package app;

//criando classe do pedido
public class Pedido {

    /* 
    * metodos para inserir e retornar os itens, quantidade, 
    * metodo de pagemento e saldo do estoque
    */
    private int itens;
    private int quantidade;
    private String tipoPagamento;

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void saldoEstoque() {

    }
}