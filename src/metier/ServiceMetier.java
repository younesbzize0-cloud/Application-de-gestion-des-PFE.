package metier;

import java.util.ArrayList;

import java.util.List;

import  Exceptions.InvalidePFEException;

public class ServiceMetier {
	
	// ========Attributs=========
	public static ArrayList<PFE> listPFEs = new ArrayList<>();
    public static ArrayList<Etudiant> listEtudiants = new ArrayList<>();
    public static ArrayList<Encadrant> listEncadrants = new ArrayList<>();
    public static ArrayList<Filliere> listFilieres = new ArrayList<>();
    public static ArrayList<Entreprise> listEntreprises = new ArrayList<>();
	
	// ==============Methodes=================
    
    /// ===============Recherche==============
	public static Encadrant getEncadrant (String cin) {
		for (Encadrant encadrant : listEncadrants) {
			if (encadrant.getCin().equals(cin))
				return encadrant;
		}
		return null;
	}
	
	public static Etudiant getEtudiant (String numApoge) {
		for (Etudiant etudiant : listEtudiants) {
			if (etudiant.getNumApoge().equals(numApoge))
				return etudiant;
		}
		return null;
	}
	
	public static Filliere getFilliere (String CodeF) {
		for (Filliere filiere : listFilieres) {
			if (filiere.getCodeF().equals(CodeF))
				return filiere;
		}
		return null;
	}
	
	public static Entreprise getEntrprise (String nomEntrprise) {
		for (Entreprise entrep : listEntreprises) {
			if (entrep.getNomEntreprise().equals(nomEntrprise))
				return entrep;
		}
		return null;
	}
	
	public static PFE getCodePFE (String CodePFE) {
		for (PFE pfe : listPFEs) {
			if (pfe.getCodePFE().equals(CodePFE))
				return pfe;
		}
		return null;
	}
	
	/// =============Add================
	public static void addPFE(PFE pfe) throws InvalidePFEException {
        int moisDebut = pfe.getDateDebut().getMonth();
        int moisFin = pfe.getDateFin().getMonth();
        int dureeMois = moisFin - moisDebut;
        
        if (dureeMois < 4) {
            throw new InvalidePFEException("La durée du PFE doit être d'au moins 4 mois.");
        }

        for (PFE existingPfe : listPFEs) {
            if (existingPfe.getCodePFE().equals(pfe.getCodePFE())) {
                throw new InvalidePFEException("Un projet avec ce code existe déjà.");
            }
        }

        listPFEs.add(pfe);
    }

	
	public static void addEtudiant(Etudiant etudiant) {
        listEtudiants.add(etudiant);
    }

    public static void addEncadrant(Encadrant encadrant) {
        listEncadrants.add(encadrant);
    }

    public static void addFiliere(Filliere filiere) {
        listFilieres.add(filiere);
    }

    public static void addEntreprise(Entreprise entreprise) {
        listEntreprises.add(entreprise);
    }
    
    
    /// ====================Get==================
    public static List<PFE> getPFEsParAnnee(Integer annee) {
        List<PFE> resultat = new ArrayList<>();
        for (PFE p : listPFEs) {
            if (p.getDateDebut().getYear() == annee) {
                resultat.add(p);
            }
        }
        return resultat;
    }

    public static List<Encadrant> getEncadrantParSpecialite(String sp) {
        List<Encadrant> resultat = new ArrayList<>();
        for (Encadrant e : listEncadrants) {
            if (e.getSpecialite().equalsIgnoreCase(sp)) {
                resultat.add(e);
            }
        }
        return resultat;
    }

    public static List<PFE> getPFEPareEncadrant(String cin, int annee) {
        List<PFE> resultat = new ArrayList<>();
        for (PFE p : listPFEs) {
            if (p.getEncadrant().getCin().equals(cin) && p.getDateDebut().getYear() == annee) {
                resultat.add(p);
            }
        }
        return resultat;
    }

    public static List<PFE> getPFEPareFiliere(String codeF, int annee) {
        List<PFE> resultat = new ArrayList<>();
        for (PFE p : listPFEs) {
            if (p.getEtudiant().getFiliere().getCodeF().equals(codeF) && p.getDateDebut().getYear() == annee) {
                resultat.add(p);
            }
        }
        return resultat;
    }
}

