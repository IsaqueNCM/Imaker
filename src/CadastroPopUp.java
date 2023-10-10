import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

public class CadastroPopUp extends JDialog {

    private JTextField nomeTextField;
    private JTextField emailTextField;
    private JPasswordField senhaPasswordField;
    private JPasswordField confirmarSenhaPasswordField;

    public CadastroPopUp(JFrame parent) {
        super(parent, "Cadastro", true); // Janela modal


        // Painel principal
        JPanel panel = new JPanel(new GridLayout(0, 2,1, 20 ));

        ((JComponent)getContentPane()).setBorder(new EmptyBorder(100, 200, 100, 200));

        // Labels e campos de texto

        JLabel nomeLabel = new JLabel("Nome:");
        nomeTextField = new JTextField();

        JLabel emailLabel = new JLabel("E-mail:");
        emailTextField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        senhaPasswordField = new JPasswordField();

        JLabel confirmarSenhaLabel = new JLabel("Confirmar Senha:");
        confirmarSenhaPasswordField = new JPasswordField();

        // Adicionando os componentes ao painel
        JLabel cadastreSeLabel = new JLabel("Cadastre-se");
        //aumenta a fonte da JLabel

        JLabel painelVazio = new JLabel("               ");
       painelVazio.setFont(new Font("SansSerif",Font.BOLD,25));

        panel.add(cadastreSeLabel);
        panel.add(painelVazio);

        panel.add(nomeLabel);
        panel.add(nomeTextField);

        panel.add(emailLabel);
        panel.add(emailTextField);

        panel.add(senhaLabel);
        panel.add(senhaPasswordField);

        panel.add(confirmarSenhaLabel);
        panel.add(confirmarSenhaPasswordField);








        // Botões
        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                JDialog cadastroSucesso = new JDialog();

                // Defina o título do diálogo
                cadastroSucesso.setTitle("Sucesso");

                JLabel sucessoLabel = new JLabel("Cadastro Realizado com sucesso");
                JButton okBtn = new JButton("OK"); // Defina o texto do botão

                okBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastroSucesso.dispose();

                    }
                });

                JPanel dialogoFrame = new JPanel();

                dialogoFrame.add(sucessoLabel);
                dialogoFrame.add(okBtn);

                // Defina o comportamento de fechamento do diálogo
                cadastroSucesso.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

                // Adicione todos os componentes ao diálogo
                cadastroSucesso.add(dialogoFrame);

                // Defina o tamanho e a localização do diálogo
                cadastroSucesso.pack();
                cadastroSucesso.setLocationRelativeTo(parent);

                // Tornar o diálogo de sucesso visível
                cadastroSucesso.setVisible(true);

                cadastroSucesso.setModal(true);
            }
        });


        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha o diálogo sem fazer o cadastro
            }
        });

        // Adicionando botões ao painel
        panel.add(cadastrarButton);
        panel.add(cancelarButton);

        // Adicionando o painel ao conteúdo do diálogo
        getContentPane().add(panel);


        pack(); // Ajusta o tamanho do diálogo com base no conteúdo
        setLocationRelativeTo(parent); // Centraliza o diálogo em relação à janela pai
    }
}