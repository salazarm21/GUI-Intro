/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiintroduction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author marina
 */
public class GUIIntroduction extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        //builds head
        Circle c = new Circle(40, 50, 25, Paint.valueOf("BURLYWOOD"));
        root.getChildren().add(c);
        
        //builds nose
        Line l = new Line(45, 55, 50, 55);
        root.getChildren().add(l);
        Line n = new Line(50, 55, 45, 50);
        root.getChildren().add(n);
        //builds eyes
        Ellipse e = new Ellipse(32, 40, 5, 5);
        root.getChildren().add(e);
        Ellipse p = new Ellipse(52, 40, 5, 5);
        root.getChildren().add(p);
        //builds mouth
        Arc a = new Arc(30, 85, 60, 25, 60, 35);
        root.getChildren().add(a);

        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
