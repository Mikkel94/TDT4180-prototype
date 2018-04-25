package oving5;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VelgKonkuranseController {
	
	@FXML Button btnSok, done;
	@FXML TextField srcField;
	@FXML ListView<String> listTable;
	
	
	public void initialize(){
		ObservableList<String> konkurranser = FXCollections.observableArrayList("Konkurranse 1", "Konkurranse 2", "Konkurranse 3");
		listTable.setItems(konkurranser);
	}
	
	@FXML private void doneAction() {
		Store.konk =listTable.getSelectionModel().getSelectedItem();
		
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AktivKonkurranse.fxml"));
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
		Stage stage = (Stage) done.getScene().getWindow();
		stage.close();
	}
}
