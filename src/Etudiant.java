import java.util.ArrayList;

public class Etudiant {
	
	private String nom, prenom, mail, niveauDEtude;
	private ArrayList<Module> moduleSuivis = new ArrayList<>();
	private ArrayList<Note> listeNotes = new ArrayList<>();

	public Etudiant(String nom, String prenom, String mail, String niveauDETUDE){
		this.mail = mail;
		this.niveauDEtude = niveauDETUDE;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public boolean ajouterNote(int note, Enseignant enseigant, Module module) {
		
		if (note < 0 || note >20) {
			return false;
		}else if(module.getListeEnseignants().contains(enseigant)) {
			return false;
		} else {
			listeNotes.add(new Note(note, enseigant, module));
			return true;
		}
	}
	
	public void suivre(Module module) {
		moduleSuivis.add(module);
	}
	
	public float moyenneModule(Module module) {
		float moy = 0;
		
		//on fait la somme de toutes les notes
		for (Note note : this.getNotesByModule(module)) {
			moy += note.getNote();
		}
		
		//on divise la somme par le nombre de notes
		moy /= (float) this.getNotesByModule(module).size();
		return moy;
	}
	
	public float moyenneGenerale() {
		float moy = 0;
		
		//on fait la somme de toutes les notes
		for(Note note : listeNotes) {
			moy += note.getNote();
		}
		
		//on divise la somme par le nombre de note
		moy /= listeNotes.size();
		
		return moy;
	}
	
	public ArrayList<Note> getNotesByModule(Module module) {
		ArrayList<Note> listeNotesModule = new ArrayList<>();
		
		for (Note note : listeNotes) {
			if(note.getModule().equals(module)) {
				listeNotesModule.add(note);
			}
		}
		return listeNotesModule;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the niveauDEtude
	 */
	public String getNiveauDEtude() {
		return niveauDEtude;
	}

	/**
	 * @param niveauDEtude the niveauDEtude to set
	 */
	public void setNiveauDEtude(String niveauDEtude) {
		this.niveauDEtude = niveauDEtude;
	}

	/**
	 * @return the moduleSuivis
	 */
	public ArrayList<Module> getModuleSuivis() {
		return moduleSuivis;
	}

	/**
	 * @param moduleSuivis the moduleSuivis to set
	 */
	public void setModuleSuivis(ArrayList<Module> moduleSuivis) {
		this.moduleSuivis = moduleSuivis;
	}

	/**
	 * @return the listeNotes
	 */
	public ArrayList<Note> getListeNotes() {
		return listeNotes;
	}

	/**
	 * @param listeNotes the listeNotes to set
	 */
	public void setListeNotes(ArrayList<Note> listeNotes) {
		this.listeNotes = listeNotes;
	}


}
