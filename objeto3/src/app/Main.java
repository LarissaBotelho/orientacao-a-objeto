/* 
* Faça um programa para controle de empréstimo de livros, 
* com as classes Emprestimo, Livro e Pessoa.
*
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.time.LocalDate;

//criando classe principal
public class Main {
   
    //metodo para receber os valores da pessoa e do livro
    public static void main(String[] args) throws Exception {

        //declarando variaveis com valores
        Pessoa p1=new Pessoa("Pedro",11456131,"245214558");
        Pessoa p2=new Pessoa("Vinicius",114456131,"245214558");
        Livro l1= new Livro("titulo", "autor", "genero",1111111);
        Emprestimo emp1=new Emprestimo(LocalDate.of(2019,12,10),LocalDate.of(2019,12,9),p1.getCpf(),p1.getContato(),l1.getISBN());

        //imprime no console as informações da pessoa e do emprestimo
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(emp1.toString());
  
    }  
    
}