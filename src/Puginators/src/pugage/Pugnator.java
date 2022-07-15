package pugage;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pugnator extends JPanel {
		
		boolean closePug = false;
		ArrayList<PugClass> pugQuestionList = new ArrayList<>();
	 	ArrayList<PugClass> pugObjectList = new ArrayList<>();
	 	int valorRng = 0;
	 	String str;
	 	boolean opening = true;
	 	
	public void pugnatorGame() throws IOException, InterruptedException{
		boolean playAgain = true;
		
		while (playAgain) {
			PugReturns pugReturns = new PugReturns();
		 	pugObjectList = pugReturns.returnObjects();
		 	pugQuestionList = pugReturns.returnQuestions();
		 	Random rng = new Random();
		 	PugMethod pug = new PugMethod();
		 	boolean win = false;
		 	
		 	//programa principal
		 	while (!win) {
			 	if (opening) {
			 		try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			 		opening = false;
			 	}	
		 		valorRng = rng.nextInt(pugQuestionList.size());
		 		repaint();
		 		boolean choice;
		 		choice = pug.pugChoice();
		 		
		 		for (int i = 0; i < pugQuestionList.size(); i++) {
		 			boolean deleta = true;	 			
			 		if (pugQuestionList.get(i).supPeca) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).supPeca != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).supPeca) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).muiChip) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).muiChip != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).muiChip) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).energia) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).energia != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).energia) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).comunica) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).comunica != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).comunica) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).fios) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).fios != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).fios) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).botao) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).botao != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).botao) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).tomada) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).tomada != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).tomada) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).quente) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).quente != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).quente) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).cpu) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).cpu != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).cpu) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).soquete) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).soquete != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).soquete) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).calculo) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).calculo != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).calculo) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).cooler) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).cooler != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).cooler) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).memoria) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).memoria != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).memoria) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).mantem) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).mantem != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).mantem) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).fastest) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).fastest != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).fastest) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).input) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).input != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).input) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).output) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).output != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).output) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).click) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).click != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).click) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).video) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).video != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).video) {
			 					deleta = false;
			 				}
			 			}
			 		} else if (pugQuestionList.get(i).external) {
			 			for (int j = 0; j < pugObjectList.size(); j++) {
			 				if (i == valorRng) {
			 					if (pugObjectList.get(j).external != choice) {
			 						pugObjectList.remove(j);
			 						j--;
			 					}
			 				} else if (pugObjectList.get(j).external) {
			 					deleta = false;
			 				}
			 			}
			 		}
			 		
			 		if (deleta) {
			 			pugQuestionList.remove(i);
			 			valorRng--;
			 			i--;
			 		}
		 		}
		 		
		 		//condicoes de termino
		 		if (pugObjectList.size() == 1) {
		 			pugQuestionList.clear();
		 			str = "Voce pensou em: " + pugObjectList.get(0).nome + "?";
		 			repaint();
		 			choice = pug.pugChoice();
		 			if (choice) {
		 				pugQuestionList.clear();
		 				str = "Eu sabia, eu sou um genio reles humano. Quer jogar novamente?";
		 				repaint();
		 				win = true;
			 			playAgain = pug.pugChoice();
		 			} else {
		 				pugQuestionList.clear();
		 				str = "Eu não consegui descobrir o que voce imaginou. Quer jogar novamente?";
		 				repaint();
		 				win = true;
			 			playAgain = pug.pugChoice();
		 			}
		 		} if (pugObjectList.size() <= 0) {
		 			pugQuestionList.clear();
		 			str = "Eu nao consegui descobrir o que voce imaginou. Quer jogar novamente?";
		 			repaint();
		 			win = true;
		 			playAgain = pug.pugChoice();
		 			
		 		}
		 		
		 	}
		 	
		}
		
		closePug = true;
		str = "Adeus, ate a proxima, humano.";
		repaint();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	
	@Override
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		
		Graphics2D g = (Graphics2D) g2.create();
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		BufferedImage background = null;
		BufferedImage pugTextBox = null;
		Font pugFont;
		
		try {
			pugFont = new Font("Calibri", 50, 30);
		} catch (Exception e) {
			pugFont = new Font("Calibri", 50, 30);
		}	
		g.setFont(pugFont);
		
		try {
			background = ImageIO.read(new File("files/pugnatorBackground.png"));
			pugTextBox = ImageIO.read(new File("files/pugBox.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		g.drawImage(background, 0, 0, 854, 480, 0, 0, background.getWidth(), background.getHeight(), null);
		g.drawImage(pugTextBox, 400, 20, null);
		
		
		try {

		 	String[] pugString = new String [4];
		 	if (pugQuestionList.size() > 0) {
		 		str = pugQuestionList.get(valorRng).nome;
		 	}
			
			int stringIndex = 0;
			if (opening) {
				str = "Humano eu sou Pugnator, sendo o genio da TI descobrirei qual peca voce esta pensando.";
	 		}
			for (int i = 23; i < str.length() && stringIndex < 3; i--) {
				if (Character.toString(str.charAt(i)).equals(" ")) {
	 				pugString[stringIndex] = str.substring(0, i);
					str = str.substring(i+1);
					stringIndex++;
					i = 23;
				}
			}
	 		
	 		pugString[stringIndex] = str;
			
			g.drawString(pugString[0], 462, 70);
			g.drawString(pugString[1], 462, 95);
			g.drawString(pugString[2], 462, 120);
			g.drawString(pugString[3], 462, 145);
			
		} catch (Exception e) {}
		
		
	}
	
}
