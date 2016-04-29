package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.CarroThread;

public class Janela extends JFrame implements ActionListener {
	private JFrame jfJanela;
	private JPanel jpPrincipal, jpSecundario;
	private JButton btnCorrida, btnCancel;
	private ImageIcon imgCarro1, imgCarro2, imgCarro3, pista;

public Janela() {
	jfJanela = new JFrame();
	jfJanela.setSize(1000,600);
	jfJanela.setLocationRelativeTo(null);
	jfJanela.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 
	jfJanela.setResizable(false);
	jfJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	jpPrincipal = new JPanel();
	jpPrincipal.setPreferredSize(new Dimension(900, 550)); 
	jpPrincipal.setLayout(null); 
	jpPrincipal.setBackground(Color.black);
	
	//jpSecundario = new JPanel();
	//jpSecundario.setPreferredSize(new Dimension(200,200));
	//jpSecundario.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 500)); 
	//jpSecundario.setBackground(Color.BLUE);
	
	ImageIcon img = new ImageIcon("./src/imagens/pista2.png");
	JLabel label  = new JLabel(img);
	label.setBounds(0, 0, 900, 550);
		
	imgCarro1   = new ImageIcon("./src/imagens/carro1.png");
	imgCarro2   = new ImageIcon("./src/imagens/carro2.png");
	imgCarro3   = new ImageIcon("./src/imagens/carro3.png");
	
	
	//CRIANDO BOTOES
	btnCorrida = new JButton("Start");
	btnCancel  = new JButton("Stop");
	btnCorrida.setBounds(300, 450, 100, 50);
	btnCancel .setBounds(500, 450, 100, 50);
	btnCorrida.addActionListener(this);
	btnCancel .addActionListener(this);
	
	jfJanela.add(jpPrincipal);
	//jfJanela.add(jpSecundario);
	
	jpPrincipal.add(label);
		
	jpPrincipal.add(btnCancel);
	jpPrincipal.add(btnCorrida);
	
	//jpSecundario.setVisible(true);
	jfJanela.setVisible(true);
	jpPrincipal.setVisible(true);
		
	this.repaint();
}


// INSERINDO AS JLABELS DOS CARROS
public JLabel JLabelCarros(String nome, ImageIcon img, int posX, int posY) {
CarroThread carro = new CarroThread(nome, img, posX, posY);
carro.setSize(5, 500);
carro.setVisible(true);
jpPrincipal.add(carro);
return carro;
}


// PROGRAMANDO A AÇÃO DOS BOTÕES
@Override
public void actionPerformed(ActionEvent dispara) {if (dispara.getSource() == this.btnCorrida) {
	this.jpPrincipal.add(JLabelCarros("Carro1", imgCarro1, 0, 30));
	this.jpPrincipal.add(JLabelCarros("Carro1", imgCarro2, 0, 30));
	this.jpPrincipal.add(JLabelCarros("Carro1", imgCarro3, 0, 30));
	}




if (dispara.getSource() == this.btnCancel) {
	System.exit(0);
	}
}
}
