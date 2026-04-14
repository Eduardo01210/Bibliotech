package bibliotecaprojeto;

public class Usuario {
     private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Usuario(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirUsuario() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }
    public Usuario(String nome, String cpf, String telefone) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
  }
}
