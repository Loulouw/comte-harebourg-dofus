package fr.gmail.zwawiak.comte_harebourg_dofus;

import fr.gmail.zwawiak.comte_harebourg_dofus.vue.CompteHarebourgVue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Comte Harebourg - Hervyx la strat | Baum le fongeur | Jte-tozz le gay | Loulouw gros zen");
		GridPane sp = new GridPane();
		new CompteHarebourgVue(sp);
		primaryStage.setScene(new Scene(sp,700,230));
		primaryStage.show();
	}
}
