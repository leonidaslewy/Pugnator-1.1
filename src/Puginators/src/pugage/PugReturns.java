package pugage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PugReturns {
	
	private ArrayList<PugClass> pugObjects = new ArrayList<>();
	private ArrayList<PugClass> pugQuestions = new ArrayList<>();
	
	
	public ArrayList<PugClass> returnObjects() throws IOException {
		BufferedReader pugReader = new BufferedReader(new FileReader("files/pugObjects.txt")); 
		String pugLine;
		
		while ((pugLine = pugReader.readLine()) != null) {
	 		PugClass pugBuild = new PugClass();
	 		
	 		//while de modificacao do objeto base pugBuild
	 		while (!pugLine.equals("end")) {
		 		
	 			//se for maiuscula reconhece como nome
		 		if (Character.isUpperCase(pugLine.charAt(0))) {
		 			pugBuild.nome = pugLine;
		 		} else {
		 			
		 			//reconhece e armazena a posicao do =
		 			int equalsPosition = 0;
		 			for (int i = 0; equalsPosition == 0; i++) {
		 				try {
							if (Character.toString(pugLine.charAt(i)).equals("=")) {
								equalsPosition = i;
							}
						} catch (Exception e) {
							
						}
		 				
		 			}
		 			
		 			//apartir daqui, comeca o reconhecimento dos atributos
		 			if (pugLine.substring(0, equalsPosition).equals("supPeca")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.supPeca = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("muiChip")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.muiChip = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("energia")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.energia = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("comunica")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.comunica = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("fios")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.fios = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("botao")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.botao = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("tomada")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.tomada = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("quente")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.quente = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("cpu")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.cpu = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("soquete")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.soquete = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("calculo")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.calculo = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("cooler")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.cooler = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("memoria")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.memoria = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("mantem")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.mantem = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("fastest")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.fastest = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("input")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.input = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("output")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.output = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("click")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.click = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("video")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.video= true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("external")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.external = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("lasanha")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.lasanha = true;
		 				}
		 			}
		 		}
	 			//passa a linha
		 		pugLine = pugReader.readLine();
		 		
	 		}
	 		//adiciona ao pugList
	 		pugObjects.add(pugBuild);	
	 		
	 	} 
		return pugObjects;
	}
	
	public ArrayList<PugClass> returnQuestions() throws IOException {
		BufferedReader pugReader = new BufferedReader(new FileReader("files/pugQuestions.txt")); 
		String pugLine;
		
		while ((pugLine = pugReader.readLine()) != null) {
	 		PugClass pugBuild = new PugClass();
	 		
	 		//while de modificacao do objeto base pugBuild
	 		while (!pugLine.equals("end")) {
		 		
	 			//se for maiuscula reconhece como nome
		 		if (Character.isUpperCase(pugLine.charAt(0))) {
		 			pugBuild.nome = pugLine;
		 		} else {
		 			
		 			//reconhece e armazena a posicao do =
		 			int equalsPosition = 0;
		 			for (int i = 0; equalsPosition == 0; i++) {
		 				try {
							if (Character.toString(pugLine.charAt(i)).equals("=")) {
								equalsPosition = i;
							}
						} catch (Exception e) {
							
						}
		 				
		 			}
		 			
		 			//apartir daqui, comeca o reconhecimento dos atributos
		 			if (pugLine.substring(0, equalsPosition).equals("supPeca")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.supPeca = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("muiChip")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.muiChip = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("energia")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.energia = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("comunica")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.comunica = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("fios")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.fios = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("botao")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.botao = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("tomada")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.tomada = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("quente")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.quente = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("cpu")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.cpu = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("soquete")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.soquete = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("calculo")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.calculo = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("cooler")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.cooler = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("memoria")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.memoria = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("mantem")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.mantem = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("fastest")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.fastest = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("input")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.input = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("output")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.output = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("click")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.click = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("video")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.video= true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("external")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.external = true;
		 				}
		 			}
		 			
		 			if (pugLine.substring(0, equalsPosition).equals("lasanha")) {
		 				if (pugLine.substring(equalsPosition+1, pugLine.length()).equalsIgnoreCase("true")) {
		 					pugBuild.lasanha = true;
		 				}
		 			}
		 		}
	 			//passa a linha
		 		pugLine = pugReader.readLine();
		 		
	 		}
	 		//adiciona ao pugList
	 		pugQuestions.add(pugBuild);	
	 		
	 	} 
		return pugQuestions;
	}

}
