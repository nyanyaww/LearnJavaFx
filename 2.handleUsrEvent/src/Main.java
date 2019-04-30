import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {

    private Button click_me = new Button();


    static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("this is title");

        click_me.setText("click me!");
        click_me.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(click_me);


        Scene wtf = new Scene(layout, 600, 800);

        primaryStage.setScene(wtf);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == click_me) {
            System.out.println("hello!");
        }
    }

    /*
    事件的监听
    1.在这个类implements EventHandler<ActionEvent>
    2.比如监听的对象叫a，你需要实现a.setAction(this)，这个是套路
    3.重写方法handle，用法与swing一致
     */
}
