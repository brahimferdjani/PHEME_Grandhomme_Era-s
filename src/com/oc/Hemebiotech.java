package com.oc;

import java.util.ArrayList;
import java.util.Map;

/** méthode main afin de lancer le programme, les autres classes sont liées à celle-ci */
public class Hemebiotech {
	public static void main(String[] args) throws Exception {
		
	
		// Chaîne de caractère pour stocker le chemin du fichier
		String file = "symptoms.txt";
		
		
	    /**CLASS 1 : lire le fichier et le mettre dans une liste*/
		ArrayList<String> listSymptoms = ReadSymptomFile.read(file);
	        
	    //CLASS 2 : comptez le nombre de chaque symptôme et trie dans l'ordre alphabétique
	    Map<String, Integer> counter = Counter.count(listSymptoms); 
	        
	    //CLASS 3 :Générez un nouveau fichier et trier par ordre alphabétique
	    CreateFile.write(counter);  
	        
	        
	       
	}             
}        
