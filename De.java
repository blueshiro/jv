//Daniel Pascual
import java.util.Random;
//Donne un resultat random de 1 a 6
public class De {

De(){}
	
int LancerDe(){
    Random r = new Random();

    return r.nextInt((6 - 1) + 1) + 1;
}

}
