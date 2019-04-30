import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    private Button click_me = new Button();


    static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("this is title");

        click_me.setText("click me!");
        // 方法一 Lambda
        click_me.setOnAction(e -> System.out.println("okay gays..."));
        // 方法二 Inner
        click_me.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("anyway you successful");
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(click_me);


        Scene wtf = new Scene(layout, 600, 800);

        primaryStage.setScene(wtf);
        primaryStage.show();
    }

}
