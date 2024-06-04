package com.example.helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.awt.Desktop;

public class StyleController {

    @FXML
    private Label label;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    public void initialize(){
//        label.setScaleX(2.0);
//        label.setScaleY(2.0);
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter(){
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick(){
        FileChooser chooser = new FileChooser();
        //        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text","*.txt"),
                new FileChooser.ExtensionFilter("PDF","*.pdf"),
                new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png",".gif"),
                new FileChooser.ExtensionFilter("All Files","*.*")
        );
        //File file = chooser.showSaveDialog(gridPane.getScene().getWindow());
       // File file = chooser.showOpenDialog(gridPane.getScene().getWindow());

        //DirectoryChooser chooser  = new DirectoryChooser();
       // File file = chooser.showDialog(gridPane.getScene().getWindow());

      //  if (file != null){
      //      System.out.println(file.getPath());
      //  }else {
      //      System.out.println("Chooser was cancelled");
        // }

        //Multiple Files
        List<File> files = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (files != null){
            for (int i = 0; i < files.size(); i++) {
                System.out.println(files.get(i));
            }
        }else {
            System.out.println("No file was chosen");
        }
    }

    @FXML
    public void handleLinkClick(){
        try{
            Desktop.getDesktop().browse(new URI("https://www.google.com"));
        }catch (IOException e){
            e.printStackTrace();
        }catch (URISyntaxException e){
            e.printStackTrace();
        }
    }

}
