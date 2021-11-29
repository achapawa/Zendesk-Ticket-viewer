package zendesk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    HandleAPI api =new HandleAPI();
    @FXML
    private void getAllTickets(
    ActionEvent event){
        api.getAllTickets();
    }

    public void getById(ActionEvent actionEvent) {
    }
}
