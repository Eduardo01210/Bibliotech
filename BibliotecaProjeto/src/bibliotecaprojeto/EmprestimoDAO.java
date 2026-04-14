package bibliotecaprojeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprestimoDAO {
   public void cadastrarEmprestimo(String livro, String usuario, String dataEmprestimo, String dataDevolucao, String status) {
        String sql = "INSERT INTO emprestimo (livro, usuario, data_emprestimo, data_devolucao, status) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = new ConexaoDAO().conectar();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, livro);
            pstm.setString(2, usuario);
            pstm.setString(3, dataEmprestimo);
            pstm.setString(4, dataDevolucao);
            pstm.setString(5, status);

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
