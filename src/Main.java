import decimal.DecToBin;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application{

    TextField tf;
    Label response;

    public static void main(String[] args) {
        DecToBin dtb = new DecToBin();

        System.out.println(dtb.posDemToBinaryString(14));
        System.out.println(dtb.negDemToBinaryString(-879));

        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(-879));

        launch(args);
    }

    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start");
        primaryStage.setTitle("Binary Converter");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(scene);

        tf = new TextField();
        tf.setPromptText("Enter number");

        rootNode.getChildren().addAll(tf);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
