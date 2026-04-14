package bibliotecaprojeto;

public class Livro {
     private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private int quantidade;

    public Livro(int id, String titulo, String autor, String categoria, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirLivro() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
public Livro(String titulo, String autor, String categoria, int quantidade) {
    this.titulo = titulo;
    this.autor = autor;
    this.categoria = categoria;
    this.quantidade = quantidade;
  }
}