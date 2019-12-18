package mvnpr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {
	private List<Route> routes;
	private List<Tarifs> tarifs;
	
	public CompagnieAutoroute() {
		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarifs>();
	}


	public void ajouterRoute(Route route) {
		this.routes.add(route);
	}
	public void ajouterTarif(Tarifs t) {
		this.tarifs.add(t);
	}
	
	public BigDecimal  obtenirTarif(Porte p1,Porte p2) {
		Tarifs tt;
		for(Tarifs t: tarifs){
			if(t.getEntree().getNumeroDePorte()==p1.getNumeroDePorte()&&t.getSortie().getNumeroDePorte()==p2.getNumeroDePorte()) {
				tt=t;
				return tt.getPrix() ;
			}	
		}
		return  null;
		
	}
	
	private Tarifs getTarifCalcule(Porte p1,Porte p2) {
		return null;}
	private Tarifs getTarifExact(Porte p1,Porte p2) {
		return null;}
	

}
