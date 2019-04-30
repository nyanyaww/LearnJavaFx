import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox layout = new VBox();
    private Button button = new Button("you can click it to change windwow");

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("hello new window");


        button.setOnAction(e->AlertBox.display("wtaht","Nooooo"));
        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 600, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}