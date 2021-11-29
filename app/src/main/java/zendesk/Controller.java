package zendesk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.json.JSONObject;

public class Controller {

    HandleAPI api =new HandleAPI();
    @FXML
    private void getAllTickets(
    ActionEvent event){
        JSONObject get = api.getAllTickets();
        System.out.println(get);
    }

    public void getById(ActionEvent actionEvent) {
        //getOne=api.getTicketByID(stringId);
        //System.out.println(getOne);

    }
}
