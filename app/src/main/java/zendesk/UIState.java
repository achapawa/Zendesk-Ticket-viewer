package zendesk;

import javafx.event.EventHandler;

import java.io.IOException;

/** interface for various UI states
 * @Author:Pawan_Acharya
 */
public interface UIState {
    // Has handle and run methods
    void handle(EventHandler event);
    void run() throws IOException;
}
