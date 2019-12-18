package mvnpr;

import java.util.ArrayList;
import java.util.List;

public class Route {
	public List<Porte> portes;
	public Route() {
		this.portes = new ArrayList<Porte>();
	};
	public void addPorte(Porte p) {
		portes.add(p);
	}
	
	public String toString() {
		return null;
		
	}
}
