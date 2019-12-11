
package app;

//criando classe
public class Invoice {

	// declarando variaveis
	String num;
	String desc;
	int quant;
	double preco;

	// metodo para retornar quantidade, valor, preço, numero, descrição e total
	public Invoice(int iniciaQuant, double valor) {

		// abrindo condicional para informar quantidade
		if (iniciaQuant > 0) {

			quant = iniciaQuant;

		} else {

			quant = 0;
		}

		// abrindo condicional para informar preço
		if (valor > 0.0) {
			preco = valor;
		} else {
			preco = 0.0;
		}

	}

	// metodo para armazenar quantidade
	public void setQuant(int quantid) {
		quant = quantid;
	}

	// metodo para armazenar numero
	public void setNum(String numero) {
		num = numero;
	}

	// metodo para armazenar descrição
	public void setDesc(String descricao) {
		desc = descricao;
	}

	// metodo para armazenar preço
	public void setPreco(Double valor) {
		preco = valor;
	}

	// metodos para informar as categorias ao usuario
	public int getQuant() {
		return quant;
	}

	public String getNum() {
		return num;
	}

	public String getDescricao() {
		return desc;
	}

	public double getPreco() {
		return preco;
	}

	// metodo para calcular total
	public double GetInvoiceAmount() {

		double total = quant * preco;

		return total;

	}
}