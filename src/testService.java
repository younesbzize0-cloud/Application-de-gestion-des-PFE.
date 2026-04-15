import java.util.Date;

import metier.*;

public class testService {
	Filliere F1 = new Filliere("0", "GI", "Informatique");
	Filliere F2 = new Filliere("1", "SIBD", "Math");
	Etudiant et1 = new Etudiant("T321999", "beniss", "Anas", "0001", F1);
	Etudiant et2 = new Etudiant("T321933", "beniss", "Yahya", "0002", F2);
	Encadrant enc1 = new Encadrant("T111111", "Mohammedi", "Taha", "Math");
	Encadrant enc2 = new Encadrant("T111333", "Tahari", "Amin", "Info");
	Entreprise entr1 = new Entreprise("Oracle", "orale@gmail.com", "0700000000");	
	Entreprise entr2 = new Entreprise("OpenAi", "openai@gmail.com", "0700009999");
	Date datedebut = new Date();
	Date dateFin = new Date();
	Date dateSoutnance = new Date();
	PFE pfe1 = new PFE("pfe de Anas", datedebut, dateFin, dateSoutnance, et1, enc1, 19.9F);
	
}
