public interface ModeleAbstrait {
	void enregistrerObservateur(Observateur o);
	void supprimerObservateur(Observateur o);
	void notifierObservateurs();
}
