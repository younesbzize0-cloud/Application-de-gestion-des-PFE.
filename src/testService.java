import java.util.Date;
import Saisie.OutilsSaisie;
import metier.*;

public class testService {
    
    public static void main(String[] args) throws Exception { 
        
        Filliere F1 = new Filliere("0", "GI", "Informatique");
        Filliere F2 = new Filliere("1", "SIBD", "Math");
        
        Etudiant et1 = new Etudiant("T321999", "beniss", "Anas", "0001", F1);
        Encadrant enc1 = new Encadrant("T111111", "Mohammedi", "Taha", "Math");
        
        Entreprise entr1 = new Entreprise("Oracle", "orale@gmail.com", "0700000000");   
        Entreprise entr2 = new Entreprise("OpenAi", "openai@gmail.com", "0700009999");
        
        System.out.println("Veillez saisir la date de debut du PFE.");
        Date dateDebut = OutilsSaisie.demanderDate(); 
        System.out.println("===========================================");
        
        System.out.println("Veillez saisir la date de fin du PFE.");
        Date dateFin = OutilsSaisie.demanderDate();
        System.out.println("===========================================");
        
        System.out.println("Veillez saisir la date de la soutnance du PFE.");
        Date dateSoutnance = OutilsSaisie.demanderDate();
        System.out.println("===========================================");
        
        PFE pfe1 = new PFE("pfe de Anas", dateDebut, dateFin, dateSoutnance, et1, enc1, 19.9F);
        System.out.println("Le PFE a été créé avec succès !");
        System.out.println(pfe1.toString());
    }
}