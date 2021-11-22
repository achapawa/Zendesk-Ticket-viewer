/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package zendesk;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Class app extends Application from JavaFx that helps in UI
 * JavaFx is used for the UI in this project
 * Addition to that, there is use of state design pattern.
 * @Auther:Pawan_Acharya
 */
public class App extends Application {

    /**
     *instances for the class
     * store the private UI states
     */
    private static UIState state;


    // main method
    public static void main(String[] args) {
        Application.launch(args);
    }


    // start method from Application in JavaFx
    @Override
    public void start(Stage primaryStage) throws Exception {
        setState(new LoadingState(primaryStage));
        state.run();
    }

    // this is  a test state
    public void testState(Stage stage){
        Scene scene = new Scene(new VBox(10), 595, 200);
        stage.setTitle("Test Layout");
        stage.setScene(scene);
        stage.show();
    }



    // getter method
    public static UIState getState() {
        return state;
    }

    // setter method
    public static void setState(UIState state) throws IOException {
        App.state = state;
        App.state.run();
    }

}