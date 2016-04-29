package control;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class CarroThread extends JLabel implements Runnable {
private Thread carroThread = null;
private int posX;
private int posY;
private ImageIcon imagem;

public CarroThread() {
}

public CarroThread(String nome, ImageIcon  img, int posX, int posY){
	super(img);
	this.imagem = img;
	this.posX = posX;
	this.posY = posY;
	carroThread = new Thread(this, nome);
	carroThread.start();
}
@Override
public void run() {
	posX += new Random().nextInt(2)*1;
	this.setLocation( posX, posY);
	
	if (posX == 800){
		JOptionPane pane = new JOptionPane("Chegou!!!");
        JDialog dialog = pane.createDialog("Titulo");
         dialog.setLocation(800,100);
         dialog.setVisible(true);
         dialog.dispose(); 
         run();} 
	
	if (posX >=  800)	return;
		try {Thread.sleep( new Random().nextInt(10) * 10); 
	     	run();} 
		catch ( Exception e) {e.printStackTrace();}
	

    }

}
