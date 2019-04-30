# 初入茅庐

&emsp;&emsp;二话不说，直接贴上代码，这段代码是使用了java8来编译以及运行的。在windows与linux上面运行良好。

&emsp;&emsp;它是一个javaFx的测试，如果这段程序可以跳出一个窗口说明javaFx的配置没有问题。

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    static void main(String[] args) {
        launch(args);
    }


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
```

&emsp;&emsp;下图是运行结果
![创建基础的javaFx程序](../img/1.baseJavaFx.png)
