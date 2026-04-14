package bibliotecaprojeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
     public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, cpf, telefone) VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = new ConexaoDAO().conectar();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setString(3, usuario.getTelefone());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
}
