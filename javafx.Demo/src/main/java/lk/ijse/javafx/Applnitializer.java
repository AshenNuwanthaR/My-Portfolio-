package lk.ijse.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Applnitializer extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader.load(this.getClass().getResource("/viwe/sample_formfxml.fxml"));

        Parent rootNode;
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.setTitle("javaFx Application");

        stage.show();

    }
}
