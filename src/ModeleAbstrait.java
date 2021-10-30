/**
 * Interface définissant les méthodes qu'un modèle
 * doit contenir.
 */
public interface ModeleAbstrait {
	/**
	 * Ajoute un observateur à l'attribut.
	 * @param o observateur à ajouter
	 */
	void enregistrerObservateur(Observateur o);

	/**
	 * Supprime l'observateur.
	 * @param o observateur à supprimer
	 */
	void supprimerObservateur(Observateur o);

	/**
	 * Supprime tous les observateur.
	 */
	void notifierObservateurs();
}
