import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        window.setTitle("this is title");
        VBox layout = new VBox();

        Button button = new Button("close program");
        button.setOnAction(e -> {
            closeProgram();
        });

        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 600, 200);

        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Warnning", "Are you sure?");
        System.out.println(answer);
        if (answer) {
            System.out.println("I have saved file");
            window.close();
        }
    }
}
