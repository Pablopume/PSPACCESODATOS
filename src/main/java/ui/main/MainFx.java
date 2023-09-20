package ui.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.screens.login.LoginController;

public class MainFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ruta/a/tu/archivo.fxml"));
        Parent root = loader.load();

        // Obtener el controlador
        LoginController controller = loader.getController();

        // Configurar la escena
        Scene scene = new Scene(root, 1050, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tu Aplicación");

        // Mostrar la ventana principal
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
