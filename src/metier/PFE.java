package metier;

import java.util.Date;

public class PFE implements Comparable<Object>{
	
	// =================Attributs=================
	private String codePFE; // automatic
	private String titre;
	private Date dateDebut, dateFin, dateSoutenance;
	private Etudiant etudiant;
	private Encadrant encadrant;
	private Float note;
	private static int nbPFE = 0;
	
	// ===============Constructeur==================
	public PFE(String titre, Date dateDebut, Date dateFin, Date dateSoutenance, Etudiant etudiant, Encadrant encadrant,
			Float note) {
		this.titre = titre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateSoutenance = dateSoutenance;
		this.etudiant = etudiant;
		this.encadrant = encadrant;
		this.note = note;
		codePFE = this.etudiant.getFiliere().getCodeF() + dateDebut + this.etudiant.getNumApoge();
		encadrant.addPFE(this);
	}

	// ================Getters et setters====================
	public String getCodePFE() {
		return codePFE;
	}

	public void setCodePFE(String codePFE) {
		this.codePFE = codePFE;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Date getDateSoutenance() {
		return dateSoutenance;
	}

	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Encadrant getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Encadrant encadrant) {
		this.encadrant = encadrant;
	}

	public Float getNote() {
		return note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	// ==============To string==============
	@Override
	public String toString() {
		return "PFE [codePFE=" + codePFE + ", titre=" + titre + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", dateSoutenance=" + dateSoutenance + ", etudiant=" + etudiant + ", encadrant=" + encadrant
				+ ", note=" + note + "]";
	}
	

	// ==============equals===============
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		PFE pfe = (PFE)obj; 
		return this.codePFE.equals(pfe.codePFE);
	}
	
	// =========compare to=============
	@Override
	public int compareTo(Object o) {
		PFE pfe = (PFE)o;
		return this.note.compareTo(pfe.note);
	}

	
	
}
