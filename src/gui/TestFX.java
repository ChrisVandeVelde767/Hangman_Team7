
package gui;

        import javafx.application.*;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.Pane;
        import javafx.scene.text.Text;
        import javafx.stage.*;



public class TestFX extends Application
{
    public void start( Stage primaryStage )
    {
        primaryStage.setTitle("Dit is een JavaFx test");
        GridPane pane = new GridPane();
        Label label = new Label("Geef je naam in: ");
        TextField invoer = new TextField();
        Text uitvoer = new Text();
        pane.add(label,0,0);
        pane.add(invoer,1,0); // kolom 0 van rij 1
        pane.add(uitvoer,0,2);
        invoer.setOnAction(eventInvoer -> {
            uitvoer.setText("Welkom "+invoer.getText());
        });
        Scene scene = new Scene(pane,500,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main( String[] args )
    {
        launch();
    }
}