package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Roll the ball");
        Menuview view = new Menuview();
        Scene scene = new Scene(view);
        scene.setFill(Color.BROWN);
        primaryStage.setScene(scene);
        Scene startmenu = new Scene(new Group());
        startmenu.setFill(Color.BROWN);
        Scene optionsmenu = new Scene(new Group());
        optionsmenu.setFill(Color.BROWN);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
