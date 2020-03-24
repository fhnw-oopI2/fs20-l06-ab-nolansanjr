package ch.fhnw.module06.ab3;

import ch.fhnw.module06.layout.Area;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {

    private Button top;
    private Button left;
    private TextArea textarea;
    private Button right;
    private Button bottom;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        BorderPane borderPane = new BorderPane();
        top = new Button("Top");
        left = new Button("Left");
        textarea = new TextArea("Text Area");
        right = new Button("Right");
        bottom = new Button("Bottom");

    }

    public void layoutControls(){
        setTop(top);
        setCenter(textarea);
        setLeft(left);
        setRight(right);
        setBottom(bottom);
        top.setMaxWidth(Double.MAX_VALUE);
        bottom.setMaxWidth(Double.MAX_VALUE);
        getChildren().stream().forEach(x -> setMargin(x, new Insets(3)));

    }
}
