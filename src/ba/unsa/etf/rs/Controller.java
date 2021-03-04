package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public BorderPane borderPane;
    public GridPane gridPane;

    public Label topLabel;
    public Label leftLabel;
    public Label rightLabel;
    public Label bottomLabel;

    private int counter;



    public void clicked(ActionEvent actionEvent) {
        leftLabel.setText(String.valueOf(counter));
        topLabel.setText(String.valueOf(counter));
        rightLabel.setText(String.valueOf(counter));
        bottomLabel.setText(String.valueOf(counter));
        counter++;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        counter = 0;
    }
}
