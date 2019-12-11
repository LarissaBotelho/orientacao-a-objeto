# orientacao-a-objeto
Exercicios java orientação a objeto

1. Identifique as classes e implemente um programa para a seguinte especificação:
“O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica
o produto que o cliente deseja e a respectiva quantidade.Esse pedido pode ser pago em dinheiro,
cheque ou cartão.”

2. Faça um programa de agenda telefônica, com as classes Agenda e Contato.

3. Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.

4. Construa um programa com as seguintes características:
- Implemente uma classe Proprietário. Declare os seguintes atributos na classe:
- Nome, CPF, RG, Data de Nascimento, Rua, Bairro, Cidade, Estado, Cep, Complemento
- Implemente uma classe Carro. Declare os seguintes atributos na classe:
- Modelo, Cor, Ano, Marca, Chassi, Proprietário, Velocidade máxima, Velocidade atual, Nr de
 portas, tem teto solar?, Nr Marchas, tem cambio automatico?, Volume de combustível
- Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
- Implemente o método freia que para o carro – Velocidade = 0 km/h
- Implemete o método troca marcha
- Implemente o método reduz a marcha;
- Altere a classe Proprietário para que o atributo Endereço vire uma classe
- A marcha ré nao pode ser engatada se o a velocidade for superior a 0 KM/h;
- Implemente um método que calcule a autonomia de viagem do veículo com base no consumo
médio passado como parâmetro;
- Implemente um método para exibir o volume de combustível
- Transforme o atributo Marca de um carro em uma classe Marca com nome, nrDeModelos,
ano de lançamento e código identificador
- Instancie um objeto da classe Carro, Pessoa, Endereço, Marca e relacione os objetos utilizando
os métodos ou construtores quando necessário.

5. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática
para representar uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintesinformações como atributos:
•o número do item faturado,
•a descrição do item,
•a quantidade comprada do item e
•o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for
positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser
configurado como 0.0. Forneça um método chamado getInvoiceAmount que calcula o valor da
fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um
double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
