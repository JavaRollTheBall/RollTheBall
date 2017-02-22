package sample;

import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;



/**
 * Created by Geoff on 9/02/2017.
 */
public class Menuview extends View {
    private static final Image LOGO = new Image("Images/logoRollTheBall.png");

    private ImageView logo;
    private Button playButton;
    private Button optionsButton;
    private Button highscoreButton;

    public Menuview() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        logo = new ImageView("Images/logoRollTheBall.png");
        playButton = new Button("Play");
        optionsButton = new Button("Options");
        highscoreButton = new Button("Highscores");
    }

    private void layoutNodes() {
        this.setSpacing(10.2);
        this.setPadding(new Insets(10.0));
        this.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();

        playButton.setPrefSize(100.0, 20.0);
        optionsButton.setPrefSize(100.0, 20.0);
        highscoreButton.setPrefSize(100.0, 20.0);
        this.getChildren().addAll(logo, playButton, optionsButton, highscoreButton);


    }


}
