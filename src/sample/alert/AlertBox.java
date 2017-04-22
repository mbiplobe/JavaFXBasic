package sample.alert;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by mbiplobe on 22-Apr-17.
 */
public class AlertBox {
    private static boolean status = false;

    public static boolean display(String title, String message) {


        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(100);
        window.setMinHeight(100);

        VBox layout = new VBox(10);
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> {
            status = false;
            window.close();
        });
        Button okButton = new Button("Ok");
        closeButton.setOnAction(event -> {
            status = true;
            window.close();
        });
        layout.setAlignment(Pos.CENTER);

        Label label = new Label();
        label.setText(message);
        label.setAlignment(Pos.BASELINE_RIGHT);


        layout.getChildren().addAll(label, okButton,closeButton);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
        return status;
    }
}
