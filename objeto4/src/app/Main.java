/* 
* Construa um programa com as seguintes características:
* - Implemente uma classe Proprietário. Declare os seguintes atributos na classe:
* - Nome, CPF, RG, Data de Nascimento, Rua, Bairro, Cidade, Estado, Cep, Complemento
* - Implemente uma classe Carro. Declare os seguintes atributos na classe:
* - Modelo, Cor, Ano, Marca, Chassi, Proprietário, Velocidade máxima, Velocidade atual, Nr de
* portas, tem teto solar?, Nr Marchas, tem cambio automatico?, Volume de combustível
* - Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
* - Implemente o método freia que para o carro – Velocidade = 0 km/h
* - Implemete o método troca marcha
* - Implemente o método reduz a marcha;
* - Altere a classe Proprietário para que o atributo Endereço vire uma classe
* - A marcha ré nao pode ser engatada se o a velocidade for superior a 0 KM/h;
* - Implemente um método que calcule a autonomia de viagem do veículo com base no consumo
* médio passado como parâmetro;
* - Implemente um método para exibir o volume de combustível
* - Transforme o atributo Marca de um carro em uma classe Marca com nome, nrDeModelos,
* ano de lançamento e código identificador
* - Instancie um objeto da classe Carro, Pessoa, Endereço, Marca e relacione os objetos utilizando
* os métodos ou construtores quando necessário.
*
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe principal
public class Main {

    // metodo para armazenar as informações do caroo, marca, proprietario e endereço
    public static void main(String[] args) throws Exception {

        // Instancia dos objetos
        Proprietario proprietario1 = new Proprietario("12-1-2019", "PEdro", "123456789", "654987654");
        Carro carro1 = new Carro("fiat", "preto", "1986", "123546789", 2, 5, 0, 200, 0, "sim", "nao", 30);
        Endereco end1 = new Endereco("rua Getulio", "Centro", "Petropolis", "RJ", "25651020", "Sem complemento");
        Marca marca1 = new Marca("Uno", 50000, "1986", 1);

        // imprime no console a cidade
        System.out.println("cidade endereco 1 " + end1.getCidade());

        // imprime no console a marca
        System.out.println("ano Marca 1 " + marca1.getAnoLançamento());

        // imprime no console o nascimento do proprietario
        System.out.printf("Proprietario %s nasceu em %s  \n", proprietario1.getNome(),
                proprietario1.getDataNascimento());

        // imprime no console a velocidade e marcha do carro
        System.out.printf(" Velocidade do carro %d Km/h\n", carro1.Acelera());
        System.out.printf(" Marcha %d \n", carro1.trocaMarcha());

        // imprime no console a velocidade e marcha do carro
        System.out.printf(" Velocidade do carro %d Km/h\n", carro1.Acelera());
        System.out.printf(" Marcha %d \n", carro1.trocaMarcha());

        // imprime no console a velocidade e marcha do carro
        System.out.printf(" Velocidade do carro %d Km/h\n", carro1.Acelera());
        System.out.printf(" Marcha %d \n", carro1.trocaMarcha());

        // imprime no console a velocidade depois de frear
        System.out.printf(" Velocidade do carro depois de frear  %d Km/h\n", carro1.Freia());

        // imprime no console o volume do tanque
        System.out.println(carro1.getVolTanque());

        // imprime no console
        System.out.println("Qual Consumo medio?");

        // armazena na variavel
        int consumoMedio = new Scanner(System.in).nextInt();

        // imprime no console o consumo medio
        System.out.printf("Autonomia %d Km", carro1.autonomia(consumoMedio));

    }
}
