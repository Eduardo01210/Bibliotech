package view;

import bibliotecaprojeto.EmprestimoDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaEmprestimo extends JFrame {
    public TelaEmprestimo() {
        setTitle("Registro de Empréstimo");
        setSize(1024, 620);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel titulo = new JLabel("REGISTRO DE EMPRÉSTIMO", SwingConstants.CENTER);
        titulo.setBounds(180, 30, 640, 50);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(18, 97, 138));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(titulo);

        JLabel lblLivro = new JLabel("Livro:");
        lblLivro.setBounds(240, 135, 120, 35);
        lblLivro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblLivro);

        JTextField txtLivro = new JTextField();
        txtLivro.setBounds(355, 135, 415, 38);
        txtLivro.setBackground(new Color(125, 190, 220));
        txtLivro.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtLivro);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(210, 195, 140, 35);
        lblUsuario.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(355, 195, 415, 38);
        txtUsuario.setBackground(new Color(125, 190, 220));
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtUsuario);

        JLabel lblDataEmp = new JLabel("Data Empréstimo:");
        lblDataEmp.setBounds(130, 255, 220, 35);
        lblDataEmp.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblDataEmp);

        JTextField txtDataEmp = new JTextField();
        txtDataEmp.setBounds(355, 255, 415, 38);
        txtDataEmp.setBackground(new Color(125, 190, 220));
        txtDataEmp.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtDataEmp);

        JLabel lblDataDev = new JLabel("Data Devolução:");
        lblDataDev.setBounds(145, 315, 205, 35);
        lblDataDev.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblDataDev);

        JTextField txtDataDev = new JTextField();
        txtDataDev.setBounds(355, 315, 415, 38);
        txtDataDev.setBackground(new Color(125, 190, 220));
        txtDataDev.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtDataDev);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setBounds(235, 375, 115, 35);
        lblStatus.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        add(lblStatus);

        JTextField txtStatus = new JTextField();
        txtStatus.setBounds(355, 375, 415, 38);
        txtStatus.setBackground(new Color(125, 190, 220));
        txtStatus.setFont(new Font("Arial", Font.PLAIN, 18));
        add(txtStatus);

        JButton btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(185, 445, 140, 70);
        btnRegistrar.setBackground(new Color(146, 208, 80));
        btnRegistrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        add(btnRegistrar);

        JButton btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(435, 445, 140, 70);
        btnLimpar.setBackground(Color.RED);
        btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnLimpar);

        JButton btnVoltar = new JButton("VOLTAR");
        btnVoltar.setBounds(685, 445, 140, 70);
        btnVoltar.setBackground(new Color(220, 230, 240));
        btnVoltar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnVoltar);

        btnRegistrar.addActionListener(e -> {
           try {
        String livro = txtLivro.getText();
        String usuario = txtUsuario.getText();
        String dataEmp = txtDataEmp.getText();
        String dataDev = txtDataDev.getText();
        String status = txtStatus.getText();

        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        emprestimoDAO.cadastrarEmprestimo(livro, usuario, dataEmp, dataDev, status);

        JOptionPane.showMessageDialog(this, "Empréstimo registrado com sucesso no banco de dados.");

        txtLivro.setText("");
        txtUsuario.setText("");
        txtDataEmp.setText("");
        txtDataDev.setText("");
        txtStatus.setText("");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao registrar empréstimo: " + ex.getMessage());
    }
});

        btnLimpar.addActionListener(e -> {
            txtLivro.setText("");
            txtUsuario.setText("");
            txtDataEmp.setText("");
            txtDataDev.setText("");
            txtStatus.setText("");
        });

        btnVoltar.addActionListener(e -> dispose());
    }
}
