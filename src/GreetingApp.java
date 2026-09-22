// Import the JavaFX Application class
import javafx.application.Application;

// Import Scene
import javafx.scene.Scene;

// Import the controls we need
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// Import VBox layout
import javafx.scene.layout.VBox;

// Import Stage (the window)
import javafx.stage.Stage;


// Our JavaFX application class
public class GreetingApp extends Application {

    // JavaFX calls this method when the application starts
    @Override
    public void start(Stage stage) {

        // -----------------------------------------
        // 1. Create the controls
        // -----------------------------------------

        // TextField allows the user to enter a name
        TextField nameBox = new TextField();

        // Display a hint inside the TextField
        nameBox.setPromptText("Enter your name");

        // Label displays the greeting
        Label messageLabel = new Label("Enter your name");

        // Button performs an action when clicked
        Button greetButton = new Button("Greet");


        // -----------------------------------------
        // 2. Create the event handler
        // -----------------------------------------

        // This code executes when the button is clicked
        greetButton.setOnAction(event -> {

            // Get the name entered by the user
            String name = nameBox.getText();

            // Display the greeting in the Label
            messageLabel.setText("Hello, " + name + "!");
        });


        // -----------------------------------------
        // 3. Create the layout
        // -----------------------------------------

        // VBox arranges the controls vertically
        // 10 represents the spacing between controls
        VBox root = new VBox(10);

        // Add the controls to the VBox
        root.getChildren().addAll(
                nameBox,
                greetButton,
                messageLabel
        );


        // -----------------------------------------
        // 4. Create the Scene
        // -----------------------------------------

        // A Scene contains the GUI components
        // 400 = width
        // 250 = height
        Scene scene = new Scene(root, 400, 250);


        // -----------------------------------------
        // 5. Put the Scene on the Stage
        // -----------------------------------------

        stage.setScene(scene);

        // Set the title of the window
        stage.setTitle("Greeting Application");


        // Display the window
        stage.show();
    }


    // The main() method starts the Java program
    public static void main(String[] args) {

        // Start the JavaFX application
        launch(args);
    }
}
