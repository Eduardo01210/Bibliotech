package bibliotecaprojeto;

public class Emprestimo {
    private int id;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(int id, String dataEmprestimo, String dataDevolucao, String status, Livro livro, Usuario usuario) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }

    public void exibirEmprestimo() {
        System.out.println("ID do Empréstimo: " + id);
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data da devolução: " + dataDevolucao);
        System.out.println("Status: " + status);
        System.out.println("Livro emprestado: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNome());
    }
}
