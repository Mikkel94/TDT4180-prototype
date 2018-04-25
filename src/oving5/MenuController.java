package oving5;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.ButtonBar;

public class MenuController {

	@FXML private Button home, profile, konk, trophy;
	
	@FXML private void goHomeAction() {
		loadFxml("main.fxml", true);
	}
	
	@FXML private void goProfileAction() {
		loadFxml("Profil.fxml", true);
	}
	
	@FXML private void goKonkAction() {
		if (Store.konk.length()>0){
			loadFxml("VelgKonkurranse.fxml", true);
		}
		loadFxml("konk.fxml", true);
	}
	
	@FXML private void goTrophyAction() {
		loadFxml("trophy.fxml", true);
	}
	
	public void loadFxml(String fxml, boolean close) {
		if (close) {
			Stage stage = (Stage) home.getScene().getWindow();
		    stage.close();	
		}
	    	try {
	    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
	    		Parent root1 = (Parent) fxmlLoader.load();
	    		Stage stage2 = new Stage();
	    		stage2.setTitle("Treningsapp");
	    		stage2.setScene(new Scene(root1, 335, 600));  
	    		stage2.show();
	    } 
	    	catch (IOException e) {
	    		System.err.println("Got an exception! ");
	        System.err.println(e.getMessage());
	    }
	}
	
}
