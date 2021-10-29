import javax.swing.*;

public class VueListe extends JTextArea implements Observateur {

	public void vueListe() {
		this.setEditable(false);
	}

	@Override
	public void actualiser(Modele m) {
		StringBuilder mots = new StringBuilder();
		for (String mot : m.getMots()) mots.append(mot).append("\n");
		this.setText(String.valueOf(mots));
	}
}