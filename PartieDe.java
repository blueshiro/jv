//Daniel Pascual

public class PartieDe {

	int[] result=new int[6];
	
	PartieDe(){}
	
	int[] LancerDe() {
	//Creation de objet UnDe
	De UnDe= new De();
	
	
	//Methode De est lancé 10x pour une partie et sauvegardé
	for(int i=0;i<10;i++) {
	
	switch(UnDe.LancerDe()) {
	case 1: result[0]++; break;
	case 2: result[1]++; break;
	case 3: result[2]++; break;
	case 4: result[3]++; break;
	case 5: result[4]++; break;
	case 6: result[5]++; break;
	}
	}
	return result;
	}
	
}
