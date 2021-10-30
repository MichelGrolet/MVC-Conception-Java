import javax.swing.*;
import java.awt.*;

/**
 * Vue située au NORD de l'interface,
 * servant à ajouter une chaîne dans la liste.
 */
public class VueDonnerChaine extends JPanel implements Observateur {
	/**
	 * TextField que l'utilisateur va remplir pour ajouter des éléments à la liste.
	 */
	private final JTextField texte = new JTextField();

	/**
	 * Initialise la vue (en tant que JPanel).
	 */
	public VueDonnerChaine() {
		this.setLayout(new GridLayout(1,2));
		JLabel donnerChaine = new JLabel("Donner une chaîne", JLabel.CENTER);
		this.add(donnerChaine);
		this.add(this.texte);
	}

	/**
	 * Cette méthode est déclarée ici afin d'ajouter le controleur
	 * seulement sur ce qui le concerne : le textField.
	 * @param c controleur à ajouter.
	 */
	public void ajouterControleur(Controleur c) {
		this.texte.addActionListener(c);
	}

	/**
	 * Quand le modèle notifie les observateurs,
	 * cette méthode vide le texte du JTextField.
	 * @param m modèle sur lequel accorder la vue.
	 */
	@Override
	public void actualiser(Modele m) {
		this.texte.setText("");
	}
}
