/* 
* Identifique as classes e implemente um programa para a seguinte especificação:
* “O supermercado vende diferentes tipos de produtos. Cada produto 
* tem um preço e uma quantidade em estoque. Um pedido de um cliente é 
* composto de itens, onde cada item especifica o produto que o cliente 
* deseja e a respectiva quantidade.Esse pedido pode ser pago em dinheiro, 
* cheque ou cartão.”
* 
* Programadores: Larissa e Hudson
*/

package app;

//importando bibliotecas
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

//criando classe principal
public class Main {

    // metodo para receber os pedidos e informar ao usuario o total
    public static void main(String[] args) throws Exception {

        // declarando variaveis
        int resposta = 1;
        double total = 0;

        // mapeamento da lista de pedidos
        Map<String, Integer> pedidosList = new HashMap<>();

        // variavel que recebe valor do metodo
        Pedido pedido = new Pedido();

        // Lista de Produtos cadastrados
        Produto produtos = new Produto();

        // Instacia dos Pordutos
        Produto arroz = new Produto();
        Produto feijao = new Produto();
        Produto macarrao = new Produto();
        Produto milho = new Produto();

        // armazena preço e quantidade no estoque de cada produto
        arroz.setPreco(2.5);
        arroz.setQuantidadeEstoque(20);
        feijao.setPreco(3.5);
        feijao.setQuantidadeEstoque(50);
        macarrao.setPreco(1.5);
        macarrao.setQuantidadeEstoque(30);
        milho.setPreco(1.00);
        milho.setQuantidadeEstoque(30);

        // mensagem para o usuario fazer o pedido
        JOptionPane.showMessageDialog(null, "Faça seu Pedido");

        // inicia looping
        while (resposta != 0) {

            // imprime no console
            System.out.print("Lista de Produtos cadastrados ");
            produtos.listProdItem();

            // imprime no console
            System.out.printf("Digite o item do produto: ");

            // armazena na variavel
            int item = new Scanner(System.in).nextInt();

            // imprime no console
            System.out.printf("Digite a Quantidade: ");

            // armazena na variavel
            int qtd = new Scanner(System.in).nextInt();

            // armazena em uma nova variavel a decrição de outro metodo
            String descricao = produtos.retornaDescricaoProduto(item);
            produtos.listProdVal();

            // armazena em nova variavel o valor de outro metodo
            double val = produtos.retornaValor(descricao);

            // efetua a conta para retornar total
            total = total + (val * qtd);

            // insere na lista
            pedidosList.put(descricao, qtd);

            // imprime no console
            System.out.printf("Deseja Continuar?1-Sim,0-Não\n");

            // armazena na variavel
            resposta = new Scanner(System.in).nextInt();

        }

        // imprime resposta no console
        System.out.println("Pedido  " + pedidosList);
        System.out.println("Total do Pedido" + total);

    }

}
