import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("this is title");
        VBox layout = new VBox();

        Button button = new Button("this is button");
        button.setOnAction(e -> {
            boolean answer = ConfirmBox.display("ok", "Are you sure?");
            System.out.println(answer);
        });

        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 600, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
