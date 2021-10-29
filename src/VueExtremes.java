import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VueExtremes extends JPanel implements Observateur {
	private final JTextField plusGrandMot = new JTextField();
	private final JTextField plusPetitMot = new JTextField();

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

	@Override
	public void actualiser(Modele m) {
		actualiserPlusGrand(m.getMots());
		actualiserPlusPetit(m.getMots());
	}

	private void actualiserPlusGrand(ArrayList<String> mots) {
		String plusGrand = "";
		for (String mot : mots) if (plusGrand.equals("") || mot.length()>plusGrand.length())
			plusGrand = mot;
		this.plusGrandMot.setText(plusGrand);
	}

	private void actualiserPlusPetit(ArrayList<String> mots) {
		String plusPetit = "";
		for (String mot : mots) if (plusPetit.equals("") || mot.length()<plusPetit.length())
			plusPetit = mot;
		this.plusPetitMot.setText(plusPetit);
	}
}
