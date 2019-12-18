package mvnpr;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte>{
	
	public OrdrePorteComparator() {
		super();
	}
	public int compare(Porte p1, Porte p2) {
		// TODO Auto-generated method stub
		return p1.getNumeroDePorte()-p2.getNumeroDePorte();
	};
	/*public boolean equals(Object o) {
		return ;
		
	}*/
}
