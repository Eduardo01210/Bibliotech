package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class TelaListarUsuarios extends JFrame {
    public TelaListarUsuarios() {
        setTitle("Listagem de Usuários");
        setSize(1024, 620);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel titulo = new JLabel("LISTAGEM DE USUÁRIOS", SwingConstants.CENTER);
        titulo.setBounds(180, 30, 640, 50);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(18, 97, 138));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(titulo);

        String[] colunas = {"ID", "NOME", "CPF", "TELEFONE"};

        Object[][] dados = {
            {"01", "MARIA SILVA", "123.456.789-00", "31988887777"},
            {"02", "JOÃO SOUZA", "987.654.321-00", "31922221111"},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };

        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        tabela.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        tabela.setRowHeight(42);
        tabela.getTableHeader().setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        tabela.setBackground(new Color(210, 210, 210));

        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(55, 170, 890, 245);
        add(scroll);

        JButton btnVoltar = new JButton("VOLTAR");
        btnVoltar.setBounds(405, 495, 140, 70);
        btnVoltar.setBackground(new Color(220, 230, 240));
        btnVoltar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        add(btnVoltar);

        btnVoltar.addActionListener(e -> dispose());
    }
}
