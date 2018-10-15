package fr.gmail.zwawiak.comte_harebourg_dofus.vue;

import fr.gmail.zwawiak.comte_harebourg_dofus.controler.CompteHarebourgControler;
import fr.gmail.zwawiak.comte_harebourg_dofus.etat.Rotation;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CompteHarebourgVue {

	public CompteHarebourgVue(GridPane pane) {

		pane.setVgap(4);
		pane.setHgap(10);
		pane.setPadding(new Insets(5, 5, 5, 5));

		final ComboBox<Rotation> rotations = new ComboBox<>(CompteHarebourgControler.getInstance().getListeRotation());
		final ImageView legende = new ImageView();
		final ImageView strat = new ImageView();

		rotations.getSelectionModel().selectFirst();
		rotations.valueProperty().addListener(new ChangeListener<Rotation>() {

			@Override
			public void changed(ObservableValue<? extends Rotation> observable, Rotation oldValue, Rotation newValue) {
				strat.setImage(new Image(newValue.getEtat().getPath()));
			}

		});

		pane.add(rotations, 0, 0);

		Image image = new Image("legende.png");
		legende.setImage(image);

		Image image2 = new Image(rotations.getValue().getEtat().getPath());
		strat.setImage(image2);

		pane.add(legende, 0, 1);
		pane.add(strat, 1, 1);

	}

}
