package app;

//criando classe livro
public class Livro {

    //declarando variaveis 
    private String titulo;
    private String autor;
    private String genero;
    private int ISBN;

    //metodo para armazenar titulo, autor, genero e isbn
    public Livro(String titulo, String autor, String genero, int iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        ISBN = iSBN;
    }

    //metodos que armazenam e retornam titulo, autor, genero e isbn
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    //informa os dados em string
    @Override
    public String toString() {
        return "Livro [ISBN=" + ISBN + ", autor=" + autor + ", genero=" + genero + ", titulo=" + titulo + "]";
    }
}


