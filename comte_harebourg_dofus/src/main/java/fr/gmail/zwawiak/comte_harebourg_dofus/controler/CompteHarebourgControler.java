package fr.gmail.zwawiak.comte_harebourg_dofus.controler;

import java.util.Collections;
import java.util.Comparator;

import fr.gmail.zwawiak.comte_harebourg_dofus.etat.Rotation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CompteHarebourgControler {

	private ObservableList<Rotation> listeRotation;

	private static CompteHarebourgControler compteHarebourgControler = null;

	private CompteHarebourgControler() {
		listeRotation = FXCollections.observableArrayList(Rotation.values());
		Collections.sort(listeRotation, new Comparator<Rotation>() {
			public int compare(Rotation f1, Rotation f2) {
				return f1.toString().compareTo(f2.toString());
			}
		});
	}

	public static CompteHarebourgControler getInstance() {
		if (compteHarebourgControler == null) {
			compteHarebourgControler = new CompteHarebourgControler();
		}
		return compteHarebourgControler;
	}

	/**
	 * @return the listeRotation
	 */
	public ObservableList<Rotation> getListeRotation() {
		return listeRotation;
	}

	/**
	 * @param listeRotation the listeRotation to set
	 */
	public void setListeRotation(ObservableList<Rotation> listeRotation) {
		this.listeRotation = listeRotation;
	}

}
