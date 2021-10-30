import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controleur du JTextField de VueDonnerChaine.
 * Récupère le texte quand l'utilisateur appuie sur entrée et l'ajoute dans le modèle.
 */
public class Controleur implements ActionListener {
	/**
	 * Modele en charge du controleur
	 */
	private Modele modele;

	/**
	 * Assigne le modele.
	 * @param m modele assigné.
	 */
	public Controleur(Modele m) {
		this.modele = m;
	}

	/**
	 * Methode déclenchée lors de l'appui sur entrée dans la VueDonnerChaine associée.
	 * Ne communique ave le modèle que si des caractères autres que des espaces sont entrés.
	 * @param e données récupérées depuis l'événement de VueDonnerChaine.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField textField = (JTextField) e.getSource();
		String texte = textField.getText().trim();
		if (!texte.equals("")) modele.ajouterMot(texte);
	}
}
