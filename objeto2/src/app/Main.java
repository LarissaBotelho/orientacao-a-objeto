/*
* Faça um programa de agenda telefônica, com as classes Agenda e Contato.
*
* Programadores: Larissa e Hudson
*/

package app;

//criando classe principal
public class Main {

    //metodo para armazenar os dados e mostrar no console
    public static void main(String[] args) throws Exception {

        //declarando variaveis com valor
        Contato contato1 = new Contato("Pedro",22439971);
        Agenda agenda=new Agenda("Ir na escola","13","Abril","1986");

        //imprime os valores no console
        System.out.println(contato1.getNome());
        System.out.println(agenda.getTarefa());


    }
}