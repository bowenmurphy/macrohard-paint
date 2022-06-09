package paint;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;

public class paintfxmlController implements Initializable {

    @FXML
    private ColorPicker colorpicker;

    @FXML
    private TextField bsize;

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
