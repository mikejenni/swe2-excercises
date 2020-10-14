package ch.juventus.javadoc.fx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyFxController {
    /*@FXML
    Label label1;

    @FXML
    public void buttonClicked(Event e) {
        System.out.println("Button clicked");
        label1.setText("New text");*/


    @FXML
    private Label actiontarget;
    @FXML
    private TextField name;

    @FXML
    protected void onSubmit(ActionEvent event) {
        String inputName = name.getText();
        actiontarget.setText("Submit button pressed, name is " + inputName);

    }
}
