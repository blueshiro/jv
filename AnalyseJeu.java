//Nom:Daniel Pascual
import java.io.*;
import java.util.Scanner;

public class AnalyseJeu {
	
	AnalyseJeu(){}
	
	//Creation de objet UnePartie
	PartieDe UnePartie=new PartieDe();
	int resultats[]=new int[5];

	
	//Calcule la somme totale des faces d'une partie
	int Somme(int[] info, int g) {
		int total=0;
		for(int j=0;j<6;j++) {//face
			
		for(int a=0; a!=11; a++) {//nb de parties
			if(info[j]==a)
				total+=a*(j+1);//Le no. de face * le nb de fois obtenues est additionné
		}		
		}
		resultats[g]=total;//Sauvegarde tout les resultats pour plus tard comparer le plus haut total
		 return total;
	}
	
	
	//Affiche le nb de faces du dé NON UTILISÉ
	int nbLancer() {
		return UnePartie.result.length;
	}
	
	
	//Utilisation de chaque methode avec affichage
	void affichage(int j) {
	
		int test[]=new int[6];
		test=UnePartie.LancerDe();
	
		  System.out.println("Jeu de dé");
    	 
   		  System.out.println("Partie "+j);
   		  System.out.print("Face tirés: ");
   		    for(int a=0;a<6;a++) {
   			  System.out.print(UnePartie.result[a]);
   			  }
   		    
   		  System.out.println("");
   		  System.out.println("Somme des faces: "+Somme(test,j));
   		  System.out.print("Non tiré: ");
   		  nonTirer(test);
   		  System.out.println("");
   		  
   		  for(int i=0;i<6;i++) {//Clean les valeurs pour le prochain jeu
   			  test[i]=0;
   		  }  
	}

   	//Affiche les faces non tiré  
	void nonTirer(int[] info) {
		for(int a=0;a<6;a++) {
			if(info[a]==0) System.out.print((a+1)+" ");
		}	
	}
	
	//Affiche le meilleur resultats obtenu entre les parties
	void bestResult(int r[]) {
		int max=r[0];
		int game=0;
		for(int i = 1; i < r.length;i++){
			if(r[i] > max){
				max = r[i];
				game=i;
			}
		}
		System.out.println("La meilleur partie est: "+(game+1)+" avec un total de: "+max);
	}
	
	
	public static void main(String[]args)throws IOException
	   {
	      BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	      char reponse;
	      String chaine;
	    
	      AnalyseJeu jeu=new AnalyseJeu();
	      
	      
	      do //Boucle generale pour permettre la repetition du programme
	      {
	    	  
	    	  for(int j=1;j<6;j++) {
	  
	    		  jeu.affichage(j);
	    	  }
	    	  	jeu.bestResult(jeu.resultats);
	/******************************************************************************/
	      System.out.println("Une autre partie? O/N ");
	      chaine = stdin.readLine();
	      reponse = chaine.charAt(0);
	      }
	      while(reponse=='o' || reponse =='O');
	   }
	
}
