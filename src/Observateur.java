/**
 * Permet au modèle de considérer globalement
 * toutes les classe de vue.
 */
public interface Observateur {
	/**
	 * Actualise la vue en l'accordant avec le modèle.
	 * @param m modèle sur lequel accorder la vue.
	 */
	void actualiser(Modele m);
}
