package mvnpr;

import java.math.BigDecimal;

public class Voyage {
	
	private Porte entree;
	private Porte sortie;
	private CompagnieAutoroute autoroute;
	public Voyage(Porte e, Porte s, CompagnieAutoroute auto) {
		this.setEntree(e);
		this.setSortie(s);
		this.setAutoroute(auto);
	}
	public Porte getEntree() {
		return entree;
	}
	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	public Porte getSortie() {
		return sortie;
	}
	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}
	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}
	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}
	
	public BigDecimal getTarif() {
		return null;}
}
