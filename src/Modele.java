import java.util.ArrayList;

/**
 * Unique classe de modèle comprenant des méthodes
 * sur les observateurs et sur la liste de mots.
 */
public class Modele implements ModeleAbstrait {
	/**
	 * Liste des mots affichés.
	 */
	private final ArrayList<String> mots = new ArrayList<>();

	/**
	 * Liste des observateurs associés au modèle.
	 */
	private final ArrayList<Observateur> observateurs = new ArrayList<>();

	/**
	 * Ajoute le mot en paramètre et notifie les observateurs.
	 * @param mot mot à ajouter
	 */
	public void ajouterMot(String mot) {
		this.mots.add(mot);
		this.notifierObservateurs();
	}

	/**
	 * Retourne la liste des mots pour les vues.
	 * @return liste des mots actuelle.
	 */
	public ArrayList<String> getMots() {
		return mots;
	}

	/**
	 * Ajoute un observateur à l'attribut.
	 * @param o observateur à ajouter
	 */
	@Override
	public void enregistrerObservateur(Observateur o) {
		this.observateurs.add(o);
	}

	/**
	 * Supprime l'observateur.
	 * @param o observateur à supprimer
	 */
	@Override
	public void supprimerObservateur(Observateur o) {
		this.observateurs.remove(o);
	}

	/**
	 * Supprime tous les observateur.
	 */
	@Override
	public void notifierObservateurs() {
		this.observateurs.forEach((o) -> o.actualiser(this));
	}
}
