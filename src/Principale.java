import javax.swing.*;
import java.awt.*;

/**
 * Classe créant le jframe et le jpanel principal,
 * ainsi que toutes les instances des modèles, vues, et contrôleurs.
 */
public class Principale {
	/**
	 * Méthode principale
	 * @param args non utilisé.
	 */
	public static void main(String[] args) {
		creerFenetre();
	}

	/**
	 * Crée le JFrame.
	 */
	public static void creerFenetre() {
		JFrame fenetre = new JFrame();
		fenetre.setContentPane(ajouterContenu());
		fenetre.setTitle("LocaVe");
		fenetre.pack();
		fenetre.setVisible(true);
	}

	/**
	 * Crée le JPanel qui sert de contenu au JFrame,
	 * crée le modèle,
	 * crée les 3 vues, les enregistre auprès du modèle, et les ajoute au JPanel.
	 * @return JPanel contenant les 3 vues.
	 */
	private static JPanel ajouterContenu() {
		JPanel contenu = new JPanel(new BorderLayout());
		contenu.setPreferredSize(new Dimension(400, 400));
		Modele m = new Modele();
		VueDonnerChaine VDC = new VueDonnerChaine();
		VDC.ajouterControleur(new Controleur(m));
		VueListe VL = new VueListe();
		VueExtremes VE = new VueExtremes();
		m.enregistrerObservateur(VDC);
		m.enregistrerObservateur(VL);
		m.enregistrerObservateur(VE);
		contenu.add(VDC, BorderLayout.NORTH);
		contenu.add(new JScrollPane(VL), BorderLayout.CENTER);
		contenu.add(VE, BorderLayout.SOUTH);
		return contenu;
	}
}
