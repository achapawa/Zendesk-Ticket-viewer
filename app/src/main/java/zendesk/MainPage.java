package zendesk;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPage implements UIState {

    public static Stage stage;
    public static final String HOME_FXML = "/Home.fxml";


    public MainPage(Stage stage){
        this.stage=stage;
    }

    @Override
    public void handle(EventHandler event) {

    }

    @Override
    public void run() throws IOException {

        mainState(stage);

    }



    public void mainState(Stage stage) throws IOException {

        //create nodes
        stage.setTitle("Welcome to the HomePage");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(HOME_FXML));
        Parent root = loader.load();
        Scene scene = new Scene(root, 700, 400);
        stage.setScene(scene);
        stage.show();

    }



}
