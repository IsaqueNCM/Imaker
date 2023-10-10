import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel extends JFrame {


        public Painel() { super("Imaker");


            JFrame painelPrincipal = new JFrame();

            Login painelLogin = new Login();

            Cadastrar painelCadastrar = new Cadastrar();








            painelLogin.getCadastrarButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    painelLogin.setVisible(false);
                    painelCadastrar.setVisible(false);

                }
            });

            painelCadastrar.getCancelarButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    painelCadastrar.setVisible(false);
                    painelLogin.setVisible(false);

                }
            });

        }
}


