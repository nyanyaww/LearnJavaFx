import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    static void main(String[] args) {
        launch(args);
    }

    // TODO:实现

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("this is title");

        StackPane layout = new StackPane();
        Scene wtf = new Scene(layout, 600, 800);

        primaryStage.setScene(wtf);
        primaryStage.show();
    }

    
    /*
    * 说明
    * 1.你需要把Main扩展成Application
    * 2.main方法里面需要launch(args)
    * 3.重写start方法
    *     javafx中stage相当于是一个窗口的总体框架
    *             scene相当于？可能是一个个场景
    * 4.还有一个StackPanel代表了布局
    */
}
