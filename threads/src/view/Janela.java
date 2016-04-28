package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import control.CarroThread;


public class Janela extends JFrame implements ActionListener {

private JPanel jpPrincipal, jpSecundario;
private JButton btnCorrida, btnCancel;
private JLabel lblPista ;
private ImageIcon imgCarro1, imgCarro2, imgCarro3, pista;

public Janela() {
	
	
setSize(500,500);
SpringLayout layout = new SpringLayout();
setBackground(Color.blue);
setVisible(true);

jpPrincipal = new JPanel(layout);
jpPrincipal.setPreferredSize(new Dimension(100,100));
jpPrincipal.setBackground(Color.BLACK);


jpSecundario = new JPanel();
jpSecundario.setPreferredSize(new Dimension(200,200));
jpSecundario.setBackground(Color.BLUE);


pista       = new ImageIcon("./src/imagens/pista.png");
imgCarro1   = new ImageIcon("./src/imagens/carro1.png");
imgCarro2   = new ImageIcon("./src/imagens/carro2.png");
imgCarro3   = new ImageIcon("./src/imagens/carro3.png");

//CRIANDO BOTOES
btnCorrida = new JButton("Start");
btnCancel  = new JButton("Stop");
btnCorrida.setBounds(500, 550, 120, 50);
btnCancel .setBounds(640, 550, 120, 50);
btnCorrida.addActionListener(this);
btnCancel .addActionListener(this);

//CRIANDO BOTOES
btnCorrida = new JButton("Start");
btnCancel  = new JButton("Stop");
btnCorrida.setBounds(500, 550, 120, 50);
btnCancel .setBounds(640, 550, 120, 50);

add(jpPrincipal);

jpPrincipal.add(btnCancel);
jpPrincipal.add(btnCorrida);

jpSecundario.setVisible(true);
jpPrincipal.setVisible(true);

this.repaint();


}


// INSERINDO AS JLABELS DOS CARROS
public JLabel JLabelCarros(String nome, ImageIcon img, int posX, int posY) {
CarroThread carro = new CarroThread(nome, img, posX, posY);
carro.setSize(256, 141);
carro.setVisible(true);
jpPrincipal.add(carro);
return carro;
}


// PROGRAMANDO A AÇÃO DOS BOTÕES
@Override
public void actionPerformed(ActionEvent dispara) {if (dispara.getSource() == this.btnCorrida) {
	this.lblPista.add(JLabelCarros("Carro1", imgCarro1, 0, 50));
	this.lblPista.add(JLabelCarros("Carro1", imgCarro2, 0, 200));
	this.lblPista.add(JLabelCarros("Carro1", imgCarro3, 0, 350));
	}

if (dispara.getSource() == this.btnCancel) {
	System.exit(0);
	}
}
}
