package view;

import bibliotecaprojeto.Livro;
import bibliotecaprojeto.LivroDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaCadastroLivro extends JFrame {
     public TelaCadastroLivro() {
        setTitle("Cadastro de Livro");
        setSize(1024, 620);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel titulo = new JLabel("Cadastro de Livro", SwingConstants.CENTER);
        titulo.setBounds(180, 30, 640, 50);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(18, 97, 138));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(titulo);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(240, 145, 120, 35);
        lblTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblTitulo);

        JTextField txtTitulo = new JTextField();
        txtTitulo.setBounds(355, 145, 415, 38);
        txtTitulo.setBackground(new Color(125, 190, 220));
        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtTitulo);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(240, 210, 120, 35);
        lblAutor.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblAutor);

        JTextField txtAutor = new JTextField();
        txtAutor.setBounds(355, 210, 415, 38);
        txtAutor.setBackground(new Color(125, 190, 220));
        txtAutor.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtAutor);

        JLabel lblCategoria = new JLabel("Categoria:");
        lblCategoria.setBounds(195, 275, 155, 35);
        lblCategoria.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblCategoria);

        JTextField txtCategoria = new JTextField();
        txtCategoria.setBounds(355, 275, 415, 38);
        txtCategoria.setBackground(new Color(125, 190, 220));
        txtCategoria.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtCategoria);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(180, 340, 170, 35);
        lblQuantidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblQuantidade);

        JTextField txtQuantidade = new JTextField();
        txtQuantidade.setBounds(355, 340, 415, 38);
        txtQuantidade.setBackground(new Color(125, 190, 220));
        txtQuantidade.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtQuantidade);

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
        String tituloLivro = txtTitulo.getText();
        String autor = txtAutor.getText();
        String categoria = txtCategoria.getText();
        int quantidade = Integer.parseInt(txtQuantidade.getText());

        Livro livro = new Livro(tituloLivro, autor, categoria, quantidade);
        LivroDAO livroDAO = new LivroDAO();
        livroDAO.cadastrarLivro(livro);

        JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso no banco de dados.");

        txtTitulo.setText("");
        txtAutor.setText("");
        txtCategoria.setText("");
        txtQuantidade.setText("");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar livro: " + ex.getMessage());
    }
});

        btnLimpar.addActionListener(e -> {
            txtTitulo.setText("");
            txtAutor.setText("");
            txtCategoria.setText("");
            txtQuantidade.setText("");
        });

        btnVoltar.addActionListener(e -> dispose());
    }
}
