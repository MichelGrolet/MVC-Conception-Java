import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {
	private Modele modele;

	public Controleur(Modele m) {
		this.modele = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		modele.updateTexte();
	}
}
