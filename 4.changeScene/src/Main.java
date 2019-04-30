import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window = new Stage();
    private Scene scene1, scene2;
    private VBox layout1 = new VBox(20);
    private VBox layout2 = new VBox(10);

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Now you are in scene 1");
        Label label2 = new Label("Now you are in scene 2");

        Button button1 = new Button("chick it and change scene 2");
        Button button2 = new Button("chick it and change scene 1");

        button1.setOnAction(e -> window.setScene(scene2));
        button2.setOnAction(e -> window.setScene(scene1));

        layout1.getChildren().addAll(button1, label1);
        layout2.getChildren().addAll(button2, label2);

        scene1 = new Scene(layout1, 600, 800);
        scene2 = new Scene(layout2, 200, 800);

        window.setScene(scene1);
        window.show();

    }
}