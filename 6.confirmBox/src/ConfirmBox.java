import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    private static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.setTitle(title);
        // I don't known why I must write this code
        window.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(message);
        Button yes_button = new Button("Yes");
        Button no_button = new Button("no");

        yes_button.setOnAction(e -> {
            answer = true;
            window.close();
        });

        no_button.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(label, yes_button, no_button);
        window.setMinWidth(250);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
        return answer;
    }
}
