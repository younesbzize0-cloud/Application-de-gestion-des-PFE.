package metier;

public class Personne {
	protected Integer numP; // automatic
	protected String cin;
	protected String nom, prenom;
	private static int nbP = 0;
	
	// ===========Consstructeur=============
	public Personne(String cin, String nom, String prenom) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		numP = nbP++;
	}

	// ==============Getterset setters===============
	public Integer getNumP() {
		return numP;
	}

	public void setNumP(Integer numP) {
		this.numP = numP;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	// ===========To string================
	@Override
	public String toString() {
		return "Personne [numP=" + numP + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	// ==============equals===============
		@Override
		public boolean equals(Object obj) {
			
			if(this == obj)
				return true;
			
			if (obj == null)
				return false;
			
			Personne p = (Personne)obj; 
			return this.cin.equals(p.cin);
		}
	
}
