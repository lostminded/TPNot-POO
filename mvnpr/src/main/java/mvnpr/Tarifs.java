package mvnpr;

import java.math.BigDecimal;

public class Tarifs {
		private Porte entree;
		private Porte sortie;
		private BigDecimal prix;
		//private LocalDateTime datevalidite;
		public Tarifs(Porte pe, Porte ps, BigDecimal p){
			this.entree=pe;
			this.sortie=ps;
			this.prix=p;
			
		}
		public Porte getSortie() {
			return sortie;
		}
		public void setSortie(Porte sortie) {
			this.sortie = sortie;
		}
		public Porte getEntree() {
			return entree;
		}
		public void setEntree(Porte entree) {
			this.entree = entree;
		}
		public BigDecimal getPrix() {
			return prix;
		}
		public void setPrix(BigDecimal prix) {
			this.prix = prix;
		}
		
}
