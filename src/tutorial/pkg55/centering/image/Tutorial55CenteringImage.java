/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg55.centering.image;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Ram
 */
public class Tutorial55CenteringImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX 8 Tutorial 55 - Centering Image Using StackPane");
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 400, 200);
        
        Image img = new Image("file:Javafx.jpg", 100, 150, true, true);
        ImageView iv = new ImageView(img);
        
        Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.MEDIUMSLATEBLUE);
        
        ellipse.radiusXProperty().bind(scene.widthProperty().divide(2));
        ellipse.radiusYProperty().bind(scene.heightProperty().divide(2));
        
        root.getChildren().addAll(ellipse, iv);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
