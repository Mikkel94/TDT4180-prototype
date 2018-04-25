package oving5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;

public class TrophyController extends MenuController {
	
	@FXML private ImageView newTrophy;
	
	@FXML
	public void handleTrophyClicked(ActionEvent event) throws IOException {
		final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
		Stage current = (Stage) ((Node)event.getSource()).getScene().getWindow();
        dialog.initOwner(current);
        int dialogSize = 200;
        VBox dialogVbox = new VBox(dialogSize);
        Text reviewText = new Text("Detaljer om trofe her...");
        reviewText.wrappingWidthProperty().bind(dialogVbox.widthProperty());
        dialogVbox.getChildren().add(reviewText);
        dialogVbox.setAlignment(Pos.CENTER);
        Scene dialogScene = new Scene(dialogVbox, 200, 200);
        dialog.setScene(dialogScene);
        dialog.show();
	}
	

}
