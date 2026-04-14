package view;

import bibliotecaprojeto.Usuario;
import bibliotecaprojeto.UsuarioDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaCadastroUsuario extends JFrame {
      public TelaCadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setSize(1024, 620);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel titulo = new JLabel("Cadastro de Usuário", SwingConstants.CENTER);
        titulo.setBounds(180, 30, 640, 50);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(18, 97, 138));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(titulo);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(240, 145, 120, 35);
        lblNome.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(355, 145, 415, 38);
        txtNome.setBackground(new Color(125, 190, 220));
        txtNome.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(255, 210, 100, 35);
        lblCpf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(355, 210, 415, 38);
        txtCpf.setBackground(new Color(125, 190, 220));
        txtCpf.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtCpf);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(220, 275, 130, 35);
        lblTelefone.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(355, 275, 415, 38);
        txtTelefone.setBackground(new Color(125, 190, 220));
        txtTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtTelefone);

        JButton btnSalvar = new JButton("SALVAR");
        btnSalvar.setBounds(185, 455, 140, 70);
        btnSalvar.setBackground(new Color(146, 208, 80));
        btnSalvar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnSalvar);

        JButton btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(435, 455, 140, 70);
        btnLimpar.setBackground(Color.RED);
        btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnLimpar);

        JButton btnVoltar = new JButton("VOLTAR");
        btnVoltar.setBounds(685, 455, 140, 70);
        btnVoltar.setBackground(new Color(220, 230, 240));
        btnVoltar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnVoltar);

        btnSalvar.addActionListener(e -> {
           try {
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String telefone = txtTelefone.getText();

        Usuario usuario = new Usuario(nome, cpf, telefone);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso no banco de dados.");

        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + ex.getMessage());
    }
});

        btnLimpar.addActionListener(e -> {
            txtNome.setText("");
            txtCpf.setText("");
            txtTelefone.setText("");
        });

        btnVoltar.addActionListener(e -> dispose());
    }
}
