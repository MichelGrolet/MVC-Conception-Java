import javax.swing.*;
import java.awt.*;

public class Principale {
	public static void main(String[] args) {
		creerFenetre();
	}

	public static void creerFenetre() {
		JFrame fenetre = new JFrame();
		fenetre.setContentPane(ajouterContenu());
		fenetre.setTitle("LocaVe");
		fenetre.pack();
		fenetre.setVisible(true);
	}

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
		contenu.add(VL, BorderLayout.CENTER);
		contenu.add(VE, BorderLayout.SOUTH);
		return contenu;
	}
}
