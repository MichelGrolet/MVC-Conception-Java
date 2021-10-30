import javax.swing.*;

/**
 * Vue centrale de l'interface,
 * affichant la totalité de la liste.
 */
public class VueListe extends JTextArea implements Observateur {

	/**
	 * Empêche l'utilisateur de modifier la liste à la main.
	 */
	public VueListe() {
		this.setEditable(false);
	}

	/**
	 * Ajoute le nouveau mot à la fin de la liste.
	 * @param m modèle sur lequel accorder la vue.
	 */
	@Override
	public void actualiser(Modele m) {
		this.append(m.getMots().get(m.getMots().size()-1)+"\n");
	}
}