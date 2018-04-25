package øving5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class KonkController extends MenuController{
	
	@FXML Button team, indi;
	
	@FXML private void startTeamAction() {
		loadFxml("OpprettLag.fxml", false);
	}
	
	@FXML private void startIndiAction() {
		loadFxml("VelgKonkurranse.fxml", false);
	}

}
