import java.util.ArrayList;

public class Module {
	
	private String nom, code;
	private Enseignant enseignantReferent;
	private ArrayList<Enseignant> listeEnseignants;

	public Module(String nom, String code) {
		this.nom = nom;
		this.code = code;
	}
	
	public void ajouterEnseignant(Enseignant enseignant) {
		listeEnseignants.add(enseignant);
	}
	
	public void supprimerEnseignant(Enseignant enseignant) {
		listeEnseignants.add(enseignant);
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the enseignantnReferent
	 */
	public Enseignant getEnseignantnReferent() {
		return enseignantReferent;
	}

	/**
	 * @param enseignantnReferent the enseignantnReferent to set
	 */
	public void setEnseignantnReferent(Enseignant enseignantnReferent) {
		this.enseignantReferent = enseignantnReferent;
	}

	/**
	 * @return the listeEnseignants
	 */
	public ArrayList<Enseignant> getListeEnseignants() {
		return listeEnseignants;
	}

	/**
	 * @param listeEnseignants the listeEnseignants to set
	 */
	public void setListeEnseignants(ArrayList<Enseignant> listeEnseignants) {
		this.listeEnseignants = listeEnseignants;
	}

}
