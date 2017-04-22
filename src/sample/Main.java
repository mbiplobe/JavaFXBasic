package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {


    private Scene mFirstScence, mSecondScence;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Scence Transaction");

        StackPane layout1 = new StackPane();
        Button mButton = new Button();
        mButton.setText("Hello");
        layout1.getChildren().add(mButton);
        mFirstScence = new Scene(layout1, 360, 360);



        primaryStage.setScene(mFirstScence);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void handle(ActionEvent event) {


    }
}
