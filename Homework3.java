package homework3;

// imports the libraries required to build the application
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.shape.*;
import javafx.scene.transform.Transform;

public class Homework3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) {

        //Creates the roof of the house
        int size = 4;

        Polygon roof = new Polygon(710.2, 250.4, 348, 90, 10.4, 250.3);
        roof.setStroke(Color.BLACK);
        roof.setStrokeWidth(2);
        roof.setFill(Color.WHITE);
        Transform translate = Transform.translate(25, -180);
        roof.getTransforms().add(translate);

        //Creates the bar that holds the roof
        Rectangle roofLine = new Rectangle(80, 70, 591, 30);
        roofLine.setStroke(Color.BLACK);
        roofLine.setStrokeWidth(2);
        roofLine.setFill(Color.WHITE);

        //creates the back of the house
        Rectangle backHouse = new Rectangle(80, 99, 590, 350);
        backHouse.setFill(Color.RED);

        // Creates the array that creates the 4 columns that support the house
        Group gp = new Group();
        Rectangle rect = new Rectangle();
        Rectangle[] columns = new Rectangle[size];
        for (int i = 0; i < size; i++) {
            columns[i] = new Rectangle(100, 100, 40, 250);
            columns[i].setTranslateX(170 * i);
            columns[i].setStroke(Color.BLACK);
            columns[i].setStrokeWidth(2);
            columns[i].setFill(Color.WHITE);
            gp.getChildren().add(columns[i]);

        }

        //Creates the first line of the decoration white circles
        int sizec = 4;

        Circle[] decor = new Circle[sizec];
        for (int i = 0; i < sizec; i++) {
            decor[i] = new Circle(140.0f, 115.0f, 15.f);
            decor[i].setTranslateX(170 * i);
            decor[i].setStroke(Color.BLACK);
            decor[i].setStrokeWidth(2);
            decor[i].setFill(Color.WHITE);
            gp.getChildren().add(decor[i]);

        }
//Creates the second line of the decoration white circles
        Circle[] decor2 = new Circle[sizec];
        for (int i = 0; i < sizec; i++) {
            decor2[i] = new Circle(100.0f, 115.0f, 15.f);
            decor2[i].setTranslateX(170 * i);
            decor2[i].setStroke(Color.BLACK);
            decor2[i].setStrokeWidth(2);
            decor2[i].setFill(Color.WHITE);
            gp.getChildren().add(decor2[i]);

        }

        //Creates the small bars that hold the white columns
        Rectangle rect2 = new Rectangle();
        Rectangle[] columnsBtm = new Rectangle[size];
        for (int i = 0; i < size; i++) {
            columnsBtm[i] = new Rectangle(91, 335, 55, 15);
            columnsBtm[i].setTranslateX(170 * i);
            columnsBtm[i].setStroke(Color.BLACK);
            columnsBtm[i].setStrokeWidth(2);
            columnsBtm[i].setFill(Color.WHITE);
            gp.getChildren().add(columnsBtm[i]);

        }

        //Creates the gray window on the top of the middle door
        Rectangle topWind = new Rectangle(335, 121, 75, 43);
        topWind.setFill(Color.LIGHTGRAY);
        topWind.setStroke(Color.BLACK);
        topWind.setStrokeWidth(2);

        //Creates the 3 white window frames and also increments the size of the middle window
        int winFrame = 3;
        Rectangle[] frame = new Rectangle[winFrame];

        for (int i = 0; i < winFrame; i++) {
            frame[i] = new Rectangle(160, 215, 80, 135);
            frame[i].setTranslateX(173 * i);
            frame[i].setStroke(Color.BLACK);
            frame[i].setStrokeWidth(2);
            frame[i].setFill(Color.WHITE);
            frame[1] = new Rectangle(160, 185, 80, 170);
            frame[1].setTranslateX(173 * i);
            frame[1].setStroke(Color.BLACK);
            frame[1].setStrokeWidth(2);
            frame[1].setFill(Color.WHITE);
            gp.getChildren().add(frame[i]);

        }

        //Creates the array that creates the  black windows
        int winSize = 2, winRows = 6;
        Rectangle[] Doordsgn = new Rectangle[winSize];

        for (int i = 0; i < winSize; i++) {
            for (int j = 1; j < winRows; ++j) {
                Doordsgn[i] = new Rectangle(80 * i + 180, 25 * j + 200, 15 + i - 4, 16);
                Doordsgn[i].setTranslateX(-52 * i);
                Doordsgn[i].setFill(Color.BLACK);
                gp.getChildren().add(Doordsgn[i]);

            }
        }
        // Creates the array of the second set of black windows
        int winSize2 = 2, winRows2 = 6;
        Rectangle[] Doordsgn2 = new Rectangle[winSize2];

        for (int i = 0; i < winSize; i++) {
            for (int j = 1; j < winRows; ++j) {
                Doordsgn2[i] = new Rectangle(80 * i + 355, 25 * j + 200, 15 + i - 4, 16);
                Doordsgn2[i].setTranslateX(-52 * i);
                Doordsgn2[i].setFill(Color.BLACK);
                gp.getChildren().add(Doordsgn2[i]);

            }
        }

        //Creates the array of the third set of black windows
        int winSize3 = 2, winRows3 = 6;
        Rectangle[] Doordsgn3 = new Rectangle[winSize3];

        for (int i = 0; i < winSize; i++) {
            for (int j = 1; j < winRows; ++j) {
                Doordsgn3[i] = new Rectangle(80 * i + 525, 25 * j + 200, 15 + i - 4, 16);
                Doordsgn3[i].setTranslateX(-52 * i);
                Doordsgn3[i].setFill(Color.BLACK);
                gp.getChildren().add(Doordsgn3[i]);

            }
        }

        //creates the 2 small gray bars above the stair
        int sizes = 2;
        Rectangle rectLine = new Rectangle();
        Rectangle[] sideSupport = new Rectangle[sizes];
        for (int i = 0; i < sizes; i++) {
            sideSupport[i] = new Rectangle(85, 350, 65, 8);
            sideSupport[i].setTranslateX(512 * i);
            sideSupport[i].setStroke(Color.BLACK);
            sideSupport[i].setStrokeWidth(2);
            sideSupport[i].setFill(Color.LIGHTGRAY);
            gp.getChildren().add(sideSupport[i]);

        }

        //Creates the stairs
        int sizee = 12;
        Rectangle[] stairs = new Rectangle[sizee];
        for (int i = 0; i < sizee; i++) {
            stairs[i] = new Rectangle(137 - i * sizee, 350 + i * sizee, 450 + i * sizee * 2, 11);
            stairs[i].setTranslateX(12);
            stairs[i].setStroke(Color.BLACK);
            stairs[i].setStrokeWidth(2);
            stairs[i].setFill(Color.LIGHTGRAY);

            gp.getChildren().add(stairs[i]);

        }

        //Creates the green ground
        Rectangle ground = new Rectangle(0, 200, 800, 600);
        ground.setFill(Color.GREEN);

        //Call all the groups that build the house
        Group house = new Group(ground, backHouse, gp, topWind, roofLine, roof);
        Scene scene = new Scene(house, 800, 600, Color.LIGHTBLUE);// Creates the scene

        //Set the size of the stage 
        Stage.setMinWidth(400);
        Stage.setMaxWidth(800);
        Stage.initStyle(StageStyle.DECORATED);//Decaorates the stage
        Stage.setTitle("A House");//Assigns a tittle to the stage
        Stage.setScene(scene);//Calls the scene
        Stage.show();//Executes the stage

    }

}
