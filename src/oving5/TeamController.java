package oving5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TeamController {
	
	@FXML Button btnFace, btnAdr, btnFerdig, back;
	@FXML Text txtLag;
	@FXML TextField lagnavn;
	@FXML ProgressBar barProg;
	@FXML Label feilmld;
	
	
	@FXML private void doneAction() {
		if (lagnavn.getText().length() > 0) {
			Store.myTeam = lagnavn.getText();
			Store.isInvitedToTeam = false;
			Stage stage = (Stage) btnFerdig.getScene().getWindow();
			stage.close();			
		} else {
			feilmld.setText("Du må ha et lagnavn");
		}
	}
	
	@FXML private void close() {
		Stage stage = (Stage) btnFerdig.getScene().getWindow();
		stage.close();	
	}

}
