// Import the JavaFX classes we need
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// Main class
// It extends Application because every JavaFX application
// must start from the Application class.
public class TextToLabel extends Application {

    // This method is automatically called when the JavaFX
    // application starts.
    @Override
    public void start(Stage stage) {

        // ------------------------------------------------
        // 1. Create the TextField
        // ------------------------------------------------
        // TextField is the textbox where the user enters text.
        TextField textBox = new TextField();

        // Give a small prompt inside the textbox
        textBox.setPromptText("Enter some text");



        // ------------------------------------------------
        // 2. Create the Label
        // ------------------------------------------------
        // Initially the label contains no text.
        Label label = new Label();


        // ------------------------------------------------
        // 3. Create the Button
        // ------------------------------------------------
        Button button = new Button("Move Text");


        // ------------------------------------------------
        // 4. Handle the button click event
        // ------------------------------------------------
        // setOnAction() specifies what should happen
        // when the button is clicked.
        button.setOnAction(event -> {

            // Get the text currently present in the TextField
            String text = textBox.getText();

            // Put that text into the Label
            label.setText(text);

            // Clear the TextField
            textBox.clear();
        });


        // ------------------------------------------------
        // 5. Create a layout
        // ------------------------------------------------
        // VBox arranges the controls vertically.
        // The number 10 represents the spacing between controls.
        VBox root = new VBox(10);

        // Add the TextField, Button and Label to the VBox
        root.getChildren().addAll(textBox, button, label);

        // ------------------------------------------------
        // 6. Create the Scene
        // ------------------------------------------------
        // The Scene contains the layout (root).
        // 400 = width
        // 250 = height
        Scene scene = new Scene(root, 400, 250);

        // ------------------------------------------------
        // 7. Put the Scene on the Stage
        // ------------------------------------------------
        stage.setScene(scene);

        // Set the title of the window
        stage.setTitle("Text to Label");


        // ------------------------------------------------
        // 8. Display the window
        // ------------------------------------------------
        stage.show();
    }

    // ------------------------------------------------
    // Main method
    // ------------------------------------------------
    public static void main(String[] args) {

        // Launches the JavaFX application.
        launch(args);
    }
}
