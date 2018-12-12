
public class Note {
	private Module module;
	private Enseignant enseignant;
	private int note;
	
	

	public Note(int note, Enseignant enseignant, Module module) {
		this.note = note;
		this.enseignant = enseignant;
		this.module = module;
	}



	/**
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}



	/**
	 * @return the enseignant
	 */
	public Enseignant getEnseignant() {
		return enseignant;
	}

	
	/**
	 * @return the note
	 */
	public int getNote() {
		return note;
	}


}
