package pugage;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class PugWindow {
	
	static boolean answer;
	static boolean repeat = true;
	
	
	public static void main(String[] args) throws Exception {
		JFrame pugWindow = new JFrame("Pugnator");
		Button pugButtonYes = new Button("SIM");
		Button pugButtonNo = new Button("NAO");
		PugMethod pug = new PugMethod();
		Pugnator pugnator = new Pugnator();
		Font pugFont = new Font("Calibri", 50, 60);
		BufferedImage pugIcon = null;
		
		try {
			pugIcon = ImageIO.read(new File("files/pugIcon.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pugButtonYes.setBounds(450, 200, 350, 80);
		pugButtonYes.setFont(pugFont);
		pugButtonYes.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				answer = true;
				repeat = false;
			}
		});  
		
		pugButtonNo.setBounds(450, 300, 350, 80);
		pugButtonNo.setFont(pugFont);
		pugButtonNo.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				answer = false;
				repeat = false;
			}
		}); 
		
		pugWindow.setIconImage(pugIcon);
		pugWindow.setSize(854, 480);
		pugWindow.setLocationRelativeTo(null);
		pugWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pugWindow.setVisible(true);
		pugWindow.setResizable(false);
		
		pugWindow.add(pugButtonYes);
		pugWindow.add(pugButtonNo);
		pugWindow.add(pugnator);
		
		try {
			pugnator.pugnatorGame();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (pugnator.closePug) {
			System.exit(0);
		}
		
	}
	
}
