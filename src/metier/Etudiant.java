package metier;

public class Etudiant extends Personne{
	private String numApoge;
	private Filliere filiere;
	
	// ==============Constructeur============
	public Etudiant(String cin, String nom, String prenom, String numApoge, Filliere filiere) {
		super(cin, nom, prenom);
		this.numApoge = numApoge;
		this.filiere = filiere;
		this.filiere.getListEtudiants().add(this);
	}

	
	// =========Getters and setters========
	public String getNumApoge() {
		return numApoge;
	}

	public void setNumApoge(String numApoge) {
		this.numApoge = numApoge;
	}

	public Filliere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filliere filiere) {
		this.filiere = filiere;
	}


	// ===========To string==============
	@Override
	public String toString() {
		return "Etudiant [numApoge=" + numApoge + ", filiere=" + this.filiere.getIntitule() + "]";
	}
	
	
}
