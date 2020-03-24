package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

    private Label label;
    private TextField textfield;
    private TextArea textarea;
    private Button button;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        button = new Button("Button");
        label = new Label("Label");
        textfield = new TextField("Text Feld");
        textarea = new TextArea("Text Area");

    }

    public void layoutControls(){
        setPadding(new Insets(10));
        getChildren().addAll(label, textfield, textarea, button);

    }

}