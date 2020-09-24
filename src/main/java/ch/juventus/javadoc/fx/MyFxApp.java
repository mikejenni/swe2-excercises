package ch.juventus.javadoc.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;


public class MyFxApp extends Application {

    public static final String PROJECT_PATH = "file:///C:/Users/Micha/repo/swe2-excercises";
    public static final String LAYOUT_PATH = "/src/main/java/ch/juventus/javadoc/fx/Layout.fxml";

    /*@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");
        Label label = new Label("Hello World, JavaFX !");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();*/


    @Override
    public void start(Stage primaryStage) throws Exception {
        MyFxController controller = new MyFxController();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL(PROJECT_PATH + LAYOUT_PATH));
        loader.setController(controller);
        GridPane grid = loader.load();
        primaryStage.setTitle("Option 1");
        Scene scene = new Scene(grid, 400,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}