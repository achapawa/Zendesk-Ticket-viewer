package zendesk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.animation.PauseTransition;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static zendesk.App.setState;

public class LoadingState implements UIState {
    public static Stage stage;
    public static final String WELCOME_BOX_FXML = "/Welcome.fxml";

    public LoadingState(Stage stage) {
        this.stage=stage;
    }


    public void run() {
        try {
            testState(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void handle(EventHandler event) {


    }


    public void testState(Stage stage) throws IOException {

        //create nodes
        stage.setTitle("Welcome to Ticket Viewer!");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(WELCOME_BOX_FXML));
        Parent root = loader.load();
        Scene scene = new Scene(root, 700, 400);
        stage.setScene(scene);
        stage.show();



    }



    @FXML
    private void Continue(
            ActionEvent event) throws IOException {

        setState(new MainPage(stage));
    }




}

