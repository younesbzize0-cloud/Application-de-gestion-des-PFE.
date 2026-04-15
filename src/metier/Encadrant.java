package metier;

import java.util.ArrayList;

public class Encadrant extends Personne {
	private String specialite;
	private ArrayList<PFE> listPFE;
	
	// ===========Constructeur============
	public Encadrant(String cin, String nom, String prenom, String specialite) {
		super(cin, nom, prenom);
		this.specialite = specialite;
		this.listPFE = listPFE;
		listPFE = new ArrayList<PFE>();
	}
	

	
	// ========Getters et setters=========
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public ArrayList<PFE> getListPFE() {
		return listPFE;
	}

	public void setListPFE(ArrayList<PFE> listPFE) {
		this.listPFE = listPFE;
	}

	// ==========To string=============
	@Override
	public String toString() {
		return "Encadrant [specialite=" + specialite + ", listPFE=" + listPFE + "]";
	}

	
	// =========addPFE=============
		public void addPFE(PFE pfe) {
			this.listPFE.add(pfe);
		}
}

