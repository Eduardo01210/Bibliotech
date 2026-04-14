package bibliotecaprojeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
     public void cadastrarLivro(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, categoria, quantidade) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = new ConexaoDAO().conectar();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.setString(3, livro.getCategoria());
            pstm.setInt(4, livro.getQuantidade());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
}
