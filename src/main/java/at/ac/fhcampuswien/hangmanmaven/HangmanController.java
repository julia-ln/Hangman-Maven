package at.ac.fhcampuswien.hangmanmaven;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HangmanController implements Initializable{
    @FXML
    private ChoiceBox<String> categoryButton;

    private WordProvider wordProvider;

    private GameLogic gameLogic;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wordProvider = new WordProvider();


        categoryButton.getItems().addAll(wordProvider.getCategories());
    }

    public void onPlayButtonClick(){
        String selectedCategory = categoryButton.getValue();
        if (selectedCategory != null){
            try {
                Stage currentStage = (Stage) categoryButton.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("hangman-view.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root);

                currentStage.setScene(scene);
                currentStage.close();
                currentStage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}