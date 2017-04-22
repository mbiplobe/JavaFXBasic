package sample.alert;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by mbiplobe on 22-Apr-17.
 */
public class AlertApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Alert Message");
        VBox layout = new VBox(10);
        Button button = new Button("Click Me");
        button.setOnAction(event -> {
           System.out.println(AlertBox.display("Test Alert","Ow it's working"));

        });
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args){
        launch(args);
    }
}
