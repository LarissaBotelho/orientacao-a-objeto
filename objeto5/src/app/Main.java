/* 
* Crie uma classe chamada Invoice que possa ser utilizado 
* por uma loja de suprimentos de informática para representar 
* uma fatura de um item vendido na loja. Uma fatura deve incluir
* as seguintes informações como atributos:
* •o número do item faturado,
* •a descrição do item,
* •a quantidade comprada do item e
* •o preço unitário do item.
*
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe principal
public class Main {

	// metodo para inserir valores e informar resultado
	public static void main(String[] args) {

		// imprime no console
		System.out.print("Digita o número: ");

		// armazena na variavel
		String number = new Scanner(System.in).nextLine();

		// imprime no console
		System.out.print("Digita a descrição do produto: ");

		// armazena a variavel
		String desc = new Scanner(System.in).nextLine();

		// imprime no console
		System.out.print("Quantidade do produto do pedido: ");

		// armazena a variavel
		int quant = new Scanner(System.in).nextInt();

		// imprime no console
		System.out.print("Valor por um item: R$");

		// armazena a variavel
		double valor = new Scanner(System.in).nextDouble();

		// armazena a variavel o valor de outro metodo
		Invoice inv = new Invoice(quant, valor);

		inv.setNum(number);
		inv.setDesc(desc);

		System.out.println();

		// imprime no console os valores inseridos
		System.out.println("Número: " + inv.getNum() + "\nDescrição: " + inv.getDescricao() + "\nQuantidade: "
				+ inv.getQuant() + "\nValor: " + inv.getPreco());

		System.out.println();

		// imprime resultado no console
		System.out.println("O Valor total é " + inv.GetInvoiceAmount());
	}

}