import java.util.ArrayList;

public class Modele implements ModeleAbstrait {
	private ArrayList<String> mots = new ArrayList<>();
	private ArrayList<Observateur> observateurs = new ArrayList<>();

	public Modele() {
	}

	public void ajouterMot(String mot) {
		if (!mot.equals("")) this.mots.add(mot);
	}

	public ArrayList<String> getMots() {
		return mots;
	}

	public void updateTexte() {
		VueDonnerChaine v = (VueDonnerChaine) observateurs.get(0);
		ajouterMot(v.getTexte());
		notifierObservateurs();
	}

	@Override
	public void enregistrerObservateur(Observateur o) {
		this.observateurs.add(o);
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		this.observateurs.remove(o);
	}

	@Override
	public void notifierObservateurs() {
		this.observateurs.forEach((o) -> o.actualiser(this));
	}
}
