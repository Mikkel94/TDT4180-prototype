package øving5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TeamController {
	
	@FXML Button btnFace, btnAdr, btnFerdig;
	@FXML Text txtLag;
	@FXML ProgressBar barProg;
	
	@FXML private void doneAction() {
		Stage stage = (Stage) btnFerdig.getScene().getWindow();
		stage.close();
	}

}
