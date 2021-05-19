package com.oc;

import java.util.ArrayList;
import java.util.Map;

/** m�thode main afin de lancer le programme, les autres classes sont li�es � celle-ci */
public class Hemebiotech {
	public static void main(String[] args) throws Exception {
		
	
		// Cha�ne de caract�re pour stocker le chemin du fichier
		String file = "symptoms.txt";
		
		
	    /**CLASS 1 : lire le fichier et le mettre dans une liste*/
		ArrayList<String> listSymptoms = ReadSymptomFile.read(file);
	        
	    //CLASS 2 : comptez le nombre de chaque sympt�me et trie dans l'ordre alphab�tique
	    Map<String, Integer> counter = Counter.count(listSymptoms); 
	        
	    //CLASS 3 :G�n�rez un nouveau fichier et trier par ordre alphab�tique
	    CreateFile.write(counter);  
	        
	        
	       
	}             
}        
