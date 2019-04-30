import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

        window.setTitle("this is title");

        GridPane gridPane = new GridPane();

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("usr name :");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField("LCS");
        GridPane.setConstraints(nameInput, 1, 0);

        TextField psdInput = new TextField("");
        psdInput.setPromptText("password");
        GridPane.setConstraints(psdInput, 1, 1);

        Button loginButton = new Button("login");
        loginButton.setOnAction(e -> isNumber(nameInput.getText()));
        GridPane.setConstraints(loginButton, 1, 2);

        gridPane.getChildren().addAll(nameLabel, nameInput, psdInput, loginButton);

        Scene scene = new Scene(gridPane, 600, 400);

        window.setScene(scene);
        window.show();
    }

    private boolean isNumber(String message) {
        try {
            int age = Integer.parseInt(message);
            System.out.println("Usr is " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR]: this is not a number");
            return false;
        }
    }
}
