package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent rootNode = FXMLLoader.load(getClass().getResource("/viwe/CustomerForm.fxml"));
       Scene secene = new Scene(rootNode);
       stage.setScene(secene);
       stage.show();

    }
}