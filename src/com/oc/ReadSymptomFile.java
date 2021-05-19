package com.oc;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**Permet de lire le fichier Symptoms et de le mettre dans une liste*/

public class ReadSymptomFile {
	public static ArrayList<String> read(String document)
			throws IOException {
		ArrayList<String> listSymptoms = new ArrayList<String>();

		if (document != null) {

			BufferedReader br = new BufferedReader(new FileReader(document));
			String line = br.readLine();

			while ((line = br.readLine()) != null){

				/** affiche le r�sultat dans la console */
				System.out.println(line);

				/**ajoute les symptoms dans la nouvelle list */
				listSymptoms.add(line);
			}

			/** affiche le r�sultat dans la console */
			System.out.println(listSymptoms);

			br.close();
		}
		return listSymptoms;
	}

}