
public class Enseignant {
	
	private String nom, prenom, mail, specialite;
	
	public Enseignant(String nom, String prenom, String mail, String specialite) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.specialite = specialite;
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
	 * @return the specialité
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialité the specialité to set
	 */
	public void setSpecialite(String specialité) {
		this.specialite = specialité;
	}

}
