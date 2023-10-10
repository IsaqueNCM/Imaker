import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Cadastrar extends JFrame{
    private JButton cadastrar;
    private JButton cancelar;



    public JButton getCancelarButton() {
        return cancelar;
    }

    public Cadastrar(){
        super("Imaker");

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


        JLabel cadastrese = new JLabel("Cadastre-se:");
        // vamos aumentar a fonte da JLabel
        cadastrese.setFont(new Font("SansSerif",
                Font.BOLD, 50));
        titulo.add(cadastrese);

        add(titulo, gbc);


        //criação da caixa de usuário no cadastro
        gbc.gridy = 1; // linha
        gbc.gridx = 0; // coluna
        gbc.gridwidth = 1;
        // cria a label do usuário
        JLabel usuarioLabel = new JLabel("Usuário:");
        add(usuarioLabel, gbc);

        gbc.gridy = 1; // linha
        gbc.gridx = 1; // coluna
        // cria a JTextField do usuário
        JTextField usuarioTxt = new JTextField(13);
        add(usuarioTxt, gbc);

        //criação da caixa de Email no cadastro
        gbc.gridy = 2; // linha
        gbc.gridx = 0; // coluna
        gbc.gridwidth = 1;
        // cria a label do Email
        JLabel emailLabel = new JLabel("Email:");
        add(emailLabel, gbc);

        gbc.gridy = 2; // linha
        gbc.gridx = 1; // coluna
        // cria a JTextField do email
        JTextField emailTxt = new JTextField(13);
        add(emailTxt, gbc);

        //criação da caixa de Senha no cadastro
        gbc.gridy = 3; // linha
        gbc.gridx = 0; // coluna
        // cria a label da senha
        JLabel usuarioSenha = new JLabel("Senha:");
        add(usuarioSenha, gbc);

        gbc.gridy = 3; // linha
        gbc.gridx = 1; // coluna
        // cria a JPasswordField da senha
        JPasswordField senhaTxt = new JPasswordField(13);
        add(senhaTxt, gbc);

        //criação da caixa de Confirmação de senha no cadastro
        gbc.gridy = 4; // linha
        gbc.gridx = 0; // coluna
        // cria a label da confirmação de senha
        JLabel usuarioConfSenha = new JLabel("Comfirme a Senha:");
        add(usuarioConfSenha, gbc);

        gbc.gridy = 4; // linha
        gbc.gridx = 1; // coluna
        // cria a JPasswordField da confirmação de senha
        JPasswordField confsenhaTxt = new JPasswordField(13);
        add(confsenhaTxt, gbc);

        //cria a label dos botões de cancelar e cadastrar
        gbc.gridy = 5; // linha
        gbc.gridx = 1; // coluna
        gbc.gridwidth = 2; // duas células na linha
        // alinha os botões à direita
        gbc.anchor = GridBagConstraints.EAST;

        JPanel botoesPanel = new JPanel();

        cancelar = new JButton("Cancelar");



        cadastrar = new JButton("Cadastrar");



        botoesPanel.add(cancelar);
        botoesPanel.add(cadastrar);

        add(botoesPanel, gbc);

        pack(); // ajusta o tamanho da janela ao
        // dos componentes
        setVisible(true);
    }
}
