import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	
	public static ArrayList<Module> listeModules = new ArrayList<>();
	public static ArrayList<Enseignant> listeEnseignants = new ArrayList<>();
	public static ArrayList<Etudiant> listeEtudiant = new ArrayList<>();

	public static void main(String[] args) {
		initialiser();

	}
	
	public static void initialiser() {
		System.out.println("...Initialisation...");
		Enseignant mrWang = new Enseignant("Wang", "Patrick", "patrick.xang@isep.fr", "spec");
		listeEnseignants.add(mrWang);
		listeModules.add(new Module("Algo & Programmation" , "II.1102"));
		getModulebyCode("II.1102").setEnseignantnReferent(mrWang);
		
		Etudiant mlelong = new Etudiant("Lelong", "Maxime", "maxime.lelong@isep.fr", "A1");
		listeEtudiant.add(mlelong);
		mlelong.suivre(getModulebyCode("II.1102"));
	}
	
	public static void ajouterModule() {
		System.out.println("===Ajout d'un module===");
		System.out.println("Entrer le nom du module :");
		String nom = scan.nextLine();
		System.out.println("Entrer le code du module : ");
		String code = scan.nextLine();		
		
		listeModules.add(new Module(nom, code));
	}
	
	public static void ajouterEnseignant() {
		System.out.println("===Ajout d'un enseignant===");
		System.out.println("Entrer le nom de l'enseignant");
		String nom = scan.nextLine();
		System.out.println("Entrez le prénom de l'enseignant");
		String prenom = scan.nextLine();
		System.out.println("Entrer le mail de l'enseignant");
		String mail = scan.nextLine();
		System.out.println("Entrer la spécialité de l'enseignant");
		String specialite = scan.nextLine();
		
		listeEnseignants.add(new Enseignant(nom, prenom, mail, specialite));
	}
	
	public static void ajouterEtudiant() {
		System.out.println("===Ajout un étudiant===");
		System.out.println("Entrer le nom de l'étudiant");
		String nom = scan.nextLine();
		System.out.println("Entrez le prénom de l'étudiant");
		String prenom = scan.nextLine();
		System.out.println("Entrer le mail de l'étudiant");
		String mail = scan.nextLine();
		System.out.println("Entrer le niveau d'étude de l'étudiant");
		String niveauDEtude = scan.nextLine();
		
		listeEtudiant.add(new Etudiant(nom, prenom, mail, niveauDEtude));
	}

	
	public static boolean assignerReferent() {
		
		System.out.println("Entrer le code du module dont vous voulez change le référent : ");
		String code = scan.nextLine();	
		
		//on vérifie que le module existe bien
		if(getModulebyCode(code).equals(null)) {
			System.out.println("Ce module n'existe pas");
			return false;
		}
		
		System.out.println("Entrer le nom de l'enseignant à assigner comme référent : ");
		String nomEnseignant = scan.nextLine();		
		
		//on vérifie que l'enseignant existe bien
		if(getEnseignantByNom(nomEnseignant).equals(null)) {
			System.out.println("Cet enseignant n'existe pas");
			return false;
		} else {
			getModulebyCode(code).setEnseignantnReferent(getEnseignantByNom(nomEnseignant));
			return true;
		}	
	}
	
	public static boolean affecterEnseignant() {
		System.out.println("Entrer le nom de l'enseignant à affecter: ");
		String nomEnseignant = scan.nextLine();	
		
		if(getEnseignantByNom(nomEnseignant).equals(null)) {
			System.out.println("Cet enseignant n'existe pas");
			return false;
		}
		
		System.out.println("Entrer le code du module dont vous voulez change le référent : ");
		String code = scan.nextLine();
		
		//on vérifie que le module existe bien
		if(getModulebyCode(code).equals(null)) {
			System.out.println("Ce module n'existe pas");
			return false;
		} else {
			getModulebyCode(code).getListeEnseignants().add(getEnseignantByNom(nomEnseignant));
			return true;
		}
		
		
	}
	
	public static Module getModulebyCode(String code) {
		for (Module module : listeModules) {
			if(module.getCode().equals(code)) {
				return module;
			}
		}
		return null;
	}
	
	public static Enseignant getEnseignantByNom(String nom) {
		for (Enseignant enseignant : listeEnseignants) {
			if(enseignant.getNom().equals(nom)) {
				return enseignant;
			}
		}
		return null;
	}

}
