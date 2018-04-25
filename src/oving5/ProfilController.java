package oving5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ProfilController extends MenuController {

    @FXML private Button btnNiva, btnGodta, btnAvsla;
    
    @FXML private Label txtNiva, anon, invitations, lagnavn;

    @FXML private ToggleButton btnAnonym;
    
    @FXML private HBox teamInvite; 
    
    @FXML private VBox allTeamInvites;
    
    @FXML protected void initialize() {
    		txtNiva.setText(Store.level);
    		anon.setText("Anonym: " + String.valueOf(Store.isAnon));
    		if (Store.myTeam.length() > 0) {
    			teamInvite.getChildren().clear();
        		invitations.setText("Du er med i lag: " + Store.myTeam);
    		} else if (!Store.isInvitedToTeam) {
    			teamInvite.getChildren().clear();
        		invitations.setText("Ingen laginvitasjoner :(");
    		}
    }
    
    @FXML private void godta() {
    		Store.isInvitedToTeam = false;
    		Store.myTeam = lagnavn.getText();
    		teamInvite.getChildren().clear();
    		invitations.setText("Du er med i lag: " + Store.myTeam);
    }
    
    @FXML private void avslag() {
    		Store.isInvitedToTeam = false;
    		teamInvite.getChildren().clear();
    		invitations.setText("Ingen laginvitasjoner :(");
    }
    
    @FXML private void byttAnon() {
    		if (Store.isAnon == false) {
    			Store.isAnon = true;
    		} else {
    			Store.isAnon = false;
    		}
    		anon.setText("Anonym: " + String.valueOf(Store.isAnon));
    }
    
    @FXML private void byttNivaAction() {
    		if (Store.level.equals("Nybegynner")) {
    			Store.level = "Avansert";
    		}else {
    			Store.level = "Nybegynner";	
    		}
    		txtNiva.setText(Store.level);	
    }

}
