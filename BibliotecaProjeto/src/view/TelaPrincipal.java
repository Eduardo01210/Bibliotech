package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        setTitle("Sistema de Biblioteca");
        setSize(1024, 620);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel titulo = new JLabel("Sistema de Biblioteca", SwingConstants.CENTER);
        titulo.setBounds(180, 30, 640, 50);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(18, 97, 138));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(titulo);

        JButton btnCadastrarLivro = new JButton("Cadastrar Livro");
        btnCadastrarLivro.setBounds(270, 145, 460, 50);
        btnCadastrarLivro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnCadastrarLivro.setBackground(new Color(125, 190, 220));
        add(btnCadastrarLivro);

        JButton btnCadastrarUsuario = new JButton("Cadastrar Usuário");
        btnCadastrarUsuario.setBounds(270, 210, 460, 50);
        btnCadastrarUsuario.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnCadastrarUsuario.setBackground(new Color(125, 190, 220));
        add(btnCadastrarUsuario);

        JButton btnRegistrarEmprestimo = new JButton("Registrar Empréstimo");
        btnRegistrarEmprestimo.setBounds(270, 275, 460, 50);
        btnRegistrarEmprestimo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnRegistrarEmprestimo.setBackground(new Color(125, 190, 220));
        add(btnRegistrarEmprestimo);

        JButton btnListarLivros = new JButton("Listar Livros");
        btnListarLivros.setBounds(270, 340, 460, 50);
        btnListarLivros.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnListarLivros.setBackground(new Color(125, 190, 220));
        add(btnListarLivros);

        JButton btnListarUsuarios = new JButton("Listar Usuários");
        btnListarUsuarios.setBounds(270, 405, 460, 50);
        btnListarUsuarios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnListarUsuarios.setBackground(new Color(125, 190, 220));
        add(btnListarUsuarios);

        JButton btnSair = new JButton("SAIR");
        btnSair.setBounds(355, 500, 290, 65);
        btnSair.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        btnSair.setBackground(Color.RED);
        btnSair.setForeground(Color.BLACK);
        add(btnSair);

        btnCadastrarLivro.addActionListener(e -> new TelaCadastroLivro().setVisible(true));
        btnCadastrarUsuario.addActionListener(e -> new TelaCadastroUsuario().setVisible(true));
        btnRegistrarEmprestimo.addActionListener(e -> new TelaEmprestimo().setVisible(true));
        btnListarLivros.addActionListener(e -> new TelaListarLivros().setVisible(true));
        btnListarUsuarios.addActionListener(e -> new TelaListarUsuarios().setVisible(true));
        btnSair.addActionListener(e -> System.exit(0));
    }
}
