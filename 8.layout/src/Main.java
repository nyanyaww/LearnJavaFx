import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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

        HBox topMenu = new HBox();
        Button button1 = new Button("A");
        Button button2 = new Button("B");
        Button button3 = new Button("C");
        topMenu.getChildren().addAll(button1, button2, button3);

        VBox leftMenu = new VBox();
        Button button4 = new Button("E");
        Button button5 = new Button("F");
        Button button6 = new Button("G");
        leftMenu.getChildren().addAll(button4, button5, button6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 600, 200);

        window.setScene(scene);
        window.show();
    }


}
