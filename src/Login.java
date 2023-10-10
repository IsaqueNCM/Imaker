import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame{



    private JButton cadastrar;
    private JButton login;

    public JButton getCadastrarButton() {
        return cadastrar;
    }

    public Login() { super("Imaker");

        // define o layout
        setLayout(new GridBagLayout());

        // define uma borda para aumentar o espaço
        // entre as bordas da janela e o gerenciador
        // de layout
        ((JComponent)getContentPane()).setBorder(
                new EmptyBorder(300, 300, 300, 300));

        // cria o GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();


        // controla o espaço entre os componentes
        // e as linhas do GridBagLayout.
        // aqui nós definimos 5 pixels para os
        // lados de cima, esquerda, inferior e direita
        gbc.insets = new Insets(5, 5, 5, 5);

        JPanel titulo = new JPanel();
        titulo.setLayout(new GridLayout(0,1,50,25));

        gbc.gridy = 0; // linha
        gbc.gridx = 0; // coluna
        gbc.gridwidth = 2;

        gbc.anchor = GridBagConstraints.WEST;

        JLabel imaker = new JLabel("IMAKER");
        imaker.setFont(new Font("SansSerif",Font.BOLD,100));
        titulo.add(imaker);


        JLabel cadastrese = new JLabel("Logar:");
        //aumenta a fonte da JLabel
        cadastrese.setFont(new Font("SansSerif",
                Font.BOLD, 50));
        titulo.add(cadastrese);

        add(titulo, gbc);

        gbc.gridy = 1; // linha
        gbc.gridx = 0; // coluna
        gbc.gridwidth = 1;

        // cria a label do usuário
        JLabel usuarioLabel = new JLabel("Email:");
        add(usuarioLabel, gbc);

        gbc.gridy = 1; // linha
        gbc.gridx = 1; // coluna

        // cria a JTextField do usuário
        JTextField usuarioTxt = new JTextField(13);
        add(usuarioTxt, gbc);

        gbc.gridy = 2; // linha
        gbc.gridx = 0; // coluna

        // cria a label da senha
        JLabel usuarioSenha = new JLabel("Senha:");
        add(usuarioSenha, gbc);

        gbc.gridy = 2; // linha
        gbc.gridx = 1; // coluna

        // cria a JPasswordField da senha
        JPasswordField senhaTxt = new JPasswordField(13);
        add(senhaTxt, gbc);

        gbc.gridy = 3; // linha
        gbc.gridx = 1; // coluna
        gbc.gridwidth = 2; // duas células na linha

        // alinha os botões à direita
        gbc.anchor = GridBagConstraints.EAST;
        JPanel botoesPanel = new JPanel();

        login = new JButton("Login");
        cadastrar = new JButton("Cadastrar");

        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crie uma instância do JDialog
                CadastroPopUp dialog = new CadastroPopUp(Login.this);
                // Tornar o JDialog visível
                dialog.setVisible(true);
            }
        });
        botoesPanel.add(cadastrar);






        botoesPanel.add(login);

        add(botoesPanel, gbc);

        pack(); // ajusta o tamanho da janela ao
        // dos componentes
        setVisible(true);

        }

 }

