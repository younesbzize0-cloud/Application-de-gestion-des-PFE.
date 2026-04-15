package metier;

public class Entreprise {
	// ========Attributs===============
	private Integer numE;
	private String nomEntreprise;
	private String email;
	private String telEntreprise;
	private static int nbEntreprise = 0;
	
	// ==========Constructeur===========
	public Entreprise(String nomEntreprise, String email, String telEntreprise) {
		this.nomEntreprise = nomEntreprise;
		this.email = email;
		this.telEntreprise = telEntreprise;
		numE = nbEntreprise++;
	}
	
	
	// ============Getters and setters================
	public Integer getNumE() {
		return numE;
	}

	public void setNumE(Integer numE) {
		this.numE = numE;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelEntreprise() {
		return telEntreprise;
	}

	public void setTelEntreprise(String telEntreprise) {
		this.telEntreprise = telEntreprise;
	}

	// ===========To string=============
	@Override
	public String toString() {
		return "Entreprise [numE=" + numE + ", nomEntreprise=" + nomEntreprise + ", email=" + email + ", telEntreprise="
				+ telEntreprise + "]";
	}

	// ==============equals===============
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		Entreprise e = (Entreprise)obj;
		return this.nomEntreprise.equals(e.nomEntreprise);
	}
	
	
}
