import javax.swing.*;
import java.awt.*;

public class VueDonnerChaine extends JPanel implements Observateur {
	private final JLabel donnerChaine = new JLabel("Donner une chaîne", JLabel.CENTER);
	private final JTextField texte = new JTextField();

	public VueDonnerChaine() {
		this.setLayout(new GridLayout(1,2));
		this.add(this.donnerChaine);
		this.add(this.texte);
	}

	public void ajouterControleur(Controleur c) {
		this.texte.addActionListener(c);
	}

	public String getTexte() {
		return texte.getText();
	}

	@Override
	public void actualiser(Modele m) {
		this.texte.setText("");
	}
}
