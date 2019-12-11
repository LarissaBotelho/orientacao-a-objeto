package app;

//importando bibliotecas
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//criando classe do produto
public class Produto {

    //inicia mapeamento dos itens e valores
    Map<Integer, String> ProdItem = new HashMap<>();
    Map<String, Double> ProdVal = new HashMap<>();

    private double preco;
    private int quantidadeEstoque;

    //metodo para informar a lista de produtos
    public void listProdItem() {
        ProdItem.put(1, "Arroz");
        ProdItem.put(2, "Feijão");
        ProdItem.put(3, "Leite");
        ProdItem.put(4, "Refrigerante");
        System.out.println((ProdItem));
    }

    //metodo para informar a lista com os produtos e valores
    public void listProdVal() {
        ProdVal.put("Arroz", 2.5);
        ProdVal.put("Feijão", 3.20);
        ProdVal.put("Leite", 3.00);
        ProdVal.put("Refrigerante", 4.00);
        System.out.println((ProdVal));
    }

    //metodo para retornar a descrição do item
    public String retornaDescricaoProduto(int item) {
        String desc = ProdItem.get(item);
        return desc;
    }

    //metodo para retornar o valor
    public Double retornaValor(String descricao) {
        Double val = ProdVal.get(descricao);
        return val;
    }

    //metodo para retornar preço
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //metodo para retornar quantidade no estoque
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //metodo para verificação da quantidade
    public int verificaQuantidade(Object obj, int quantidade) {

        int quantidadeEstoque = ((Produto) obj).getQuantidadeEstoque() - quantidade;

        //abrindo condicional
        if (quantidadeEstoque < 0) {

            //imprime no console
            System.out.printf("Sem estoque desse produto so temos %d unidades \n", getQuantidadeEstoque());
            quantidadeEstoque = getQuantidadeEstoque();
        }

        //retorna quantidade no estoque
        return quantidadeEstoque;
    }

}
