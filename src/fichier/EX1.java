package fichier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
class EX1 {
	
	private static Scanner output1;


	public static void ecrireFichier(String nom) throws FileNotFoundException {
		DataOutputStream File = new DataOutputStream(new FileOutputStream(nom));
		Scanner output1 = new Scanner(System.in);     // permet de saisie des infos par utilisateur
		
		while(true) {
			System.out.println("Saisir un verbe");
			String verbe = output1.nextLine();        // quand on veut un var ,on l'appel
			
			try {
				File.writeBytes(verbe);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("un autre verbe? (0/1)");
			int choix = Integer.parseInt(output1.nextLine());
			
			if(choix==0) {
				System.out.println("Ecriture dans le fichier "+nom+ " terminé !");
				break;
			}
			else {
				
			}
			
		
	}
	
}
	public static boolean checkVerb(String verbe2) {
		String verbecaractere = verbe2.toLowerCase();
		for(int i=0; i<=verbecaractere.length(); i++) {
			if(verbecaractere.charAt[i]<'a' | verbecaractere.charAt[i]<'z') {
				
			}
		}
		
	}


public static void main(String[] args) throws FileNotFoundException{
	ecrireFichier("verbes.bin");
	}

}

	

