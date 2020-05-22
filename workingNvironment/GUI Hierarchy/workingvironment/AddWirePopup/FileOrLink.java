package AddWirePopup;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.Font;

public class FileOrLink
{   
   public static void display()
   {
      
         Button addFile,addLink;
      
      Stage window = new Stage();
      
      //disbling user to interact with other windows
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle("File or Link?" );
      window.setMinWidth(300);
      
      //Label
      Label label = new Label();
      label.setText("Add File or Add Link");
      label.setFont(new Font(25));
      
      //addFile button
      addFile = new Button("Add File");
      addFile.setPrefSize(85, 35);
      //addFile.setOnAction(); fileChooser
      
      //addlink button
      addLink = new Button("Add Link");
      //addLink.setOnAction(); adding new  weboppener with string taking constructor  
      addLink.setPrefSize(85, 35);
      
      //initializing pane
      VBox layout = new VBox(15);
      HBox buttons = new HBox(10);
      buttons.setAlignment(Pos.CENTER);
      layout.setAlignment(Pos.CENTER);
      buttons.getChildren().addAll(addFile,addLink);
      layout.getChildren().addAll(label,buttons);
      
      //displaying window
      Scene scene = new Scene(layout);
      window.setScene(scene);
      window.showAndWait();
      
      
      
      
      
      
   }
   
   
}