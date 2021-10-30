import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Vue située au SUD de l'interface,
 * affichant le mot le plus long et le mot le plus court,
 * les extremes de la liste.
 */
public class VueExtremes extends JPanel implements Observateur {
	/**
	 * TextField non éditable contenant le plus grand mot de la liste.
	 */
	private final JTextField plusGrandMot = new JTextField();

	/**
	 * TextField non éditable contenant le plus petit mot de la liste.
	 */
	private final JTextField plusPetitMot = new JTextField();

	/**
	 * Initialise this (en tant que JPanel).
	 * Ajoute les deux labels et les deux textFields.
	 */
	public VueExtremes() {
		this.setLayout(new GridLayout(2,2));
		JLabel labelGrand = new JLabel("Plus grand mot", JLabel.CENTER);
		this.add(labelGrand);
		this.plusGrandMot.setEditable(false);
		this.add(this.plusGrandMot);
		JLabel labelPetit = new JLabel("Plus petit mot", JLabel.CENTER);
		this.add(labelPetit);
		this.plusPetitMot.setEditable(false);
		this.add(this.plusPetitMot);
	}

	/**
	 * Affiche les nouveaux plusGrand et plusPetit.
	 * @param m modèle sur lequel accorder la vue.
	 */
	@Override
	public void actualiser(Modele m) {
		String plusGrand = "";
		String plusPetit = "";
		for (String mot : m.getMots()) {
			if (plusGrand.equals("") || mot.length()>plusGrand.length())
				plusGrand = mot;
			if (plusPetit.equals("") || mot.length()<plusPetit.length())
				plusPetit = mot;
		}
		this.plusGrandMot.setText(plusGrand);
		this.plusPetitMot.setText(plusPetit);
	}
}
