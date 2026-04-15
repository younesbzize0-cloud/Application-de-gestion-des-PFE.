package metier;

import java.util.ArrayList;

public class Filliere {
	private String CodeF;
	private String intitule;
	private String dept;
	private ArrayList<Etudiant> listEtudiants; // auto
	
	// ============Constructeur==============
	public Filliere(String codeF, String intitule, String dept) {
		this.CodeF = codeF;
		this.intitule = intitule;
		this.dept = dept;
		listEtudiants = new ArrayList<>();
	}

	
	// ==========Getters annd setters=========
	public String getCodeF() {
		return CodeF;
	}

	public void setCodeF(String codeF) {
		CodeF = codeF;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public ArrayList<Etudiant> getListEtudiants() {
		return listEtudiants;
	}

	public void setListEtudiants(ArrayList<Etudiant> listEtudiants) {
		this.listEtudiants = listEtudiants;
	}


	// ==========To string==========
	@Override
	public String toString() {
		return "Filliere [CodeF=" + CodeF + ", intitule=" + intitule + ", dept=" + dept + ", listEtudiants="
				+ listEtudiants + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		Filliere e = (Filliere)obj;
		return this.CodeF.equals(e.CodeF);
	}

	
}
