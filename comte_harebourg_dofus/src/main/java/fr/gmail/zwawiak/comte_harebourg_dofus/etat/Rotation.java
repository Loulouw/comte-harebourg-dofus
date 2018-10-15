package fr.gmail.zwawiak.comte_harebourg_dofus.etat;

public enum Rotation {

	CONFUSION_HORAIRE_90(Etat.PREMIER,"confusion horaire 90"),
	CONTRE_HORAIRE_270(Etat.PREMIER,"contre horaire 270"),
	HORAIRE_PI_SUR_2(Etat.PREMIER,"horaire pi/2"),
	HORAIRE_2PI_SUR_4(Etat.PREMIER,"horaire 2pi/4"),
	CONTRE_HORAIRE_3PI_SUR_2(Etat.PREMIER,"contre horaire 3pi/2"),
	CONTRE_HORAIRE_6PI_SUR_4(Etat.PREMIER,"contre horaire 6pi/4"),
	
	CONFUSION_HORAIRE_180(Etat.SECOND,"confusion horaire 180"),
	CONTRE_HORAIRE_180(Etat.SECOND,"contre horaire 180"),
	HORAIRE_PI(Etat.SECOND,"horaire pi"),
	HORAIRE_4PI_SUR_4(Etat.SECOND,"horaire 4pi/4"),
	HORAIRE_2PI_SUR_2(Etat.SECOND,"horaire 2pi/2"),
	
	CONFUSION_HORAIRE_270(Etat.TROISIEME,"confusion horaire 270"),
	CONTRE_HORAIRE_90(Etat.TROISIEME,"contre horaire 90"),
	HORAIRE_3PI_SUR_2(Etat.TROISIEME,"horaire 3pi/2"),
	HORAIRE_6PI_SUR_4(Etat.TROISIEME,"horaire 6pi/4"),
	CONTRE_HORAIRE_PI_SUR_2(Etat.TROISIEME,"contre horaire pi/2"),
	CONTRE_HORAIRE_2PI_SUR_4(Etat.TROISIEME,"contre horaire 2pi/4");
	
	private Etat etat;
	private String value;
	
	Rotation(Etat etat,String value) {
		this.etat = etat;
		this.value = value;
	}

	/**
	 * @return the etat
	 */
	public Etat getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}
}
