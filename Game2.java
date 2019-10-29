package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Game2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private TextArea outputArea = new TextArea();
    @Override
    public void start(Stage primaryStage) {


        Button rock = new Button("Rock");
        rock.setPrefSize(100,50);
        rock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                writeOutput("You picked rock");
                int computerChoice = rps.compPick();

                if(computerChoice==1){
                    writeOutput("The computer picked rock");
                }
                else if(computerChoice == 2){
                    writeOutput("The computer picked paper");
                }
                else {
                    writeOutput("The computer picked scissors");
                }




                int result = rps.checker(computerChoice,1);
                if (result == 2){
                    writeOutput("It was a tie!");
                }
                else if(result == 0){
                    writeOutput("You beat the computer!");
                }
                else if(result == 1){
                    writeOutput("You lost!");
                }
                else{
                    writeOutput("something went wrong :(");
                }
                writeOutput("-------------------------------------");


            }
        });


        Button paper = new Button("Paper");
        paper.setPrefSize(100,50);
        paper.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                writeOutput("You pressed paper");


                int computerChoice = rps.compPick();

                if(computerChoice==1){
                    writeOutput("The computer picked rock");
                }
                else if(computerChoice == 2){
                    writeOutput("The computer picked paper");
                }
                else {
                    writeOutput("The computer picked scissors");
                }



                int result = rps.checker(rps.compPick(),2);
                if (result == 2){
                    writeOutput("It was a tie!");
                }
                else if(result == 0){
                    writeOutput("You beat the computer!");
                }
                else if(result == 1){
                    writeOutput("You lost!");
                }
                else{
                    writeOutput("something went wrong :(");
                }

                writeOutput("-------------------------------------");
            }
        });


        Button scissors = new Button("Scissors");
        scissors.setPrefSize(100,50);
        scissors.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                writeOutput("you pressed scissors");

                int computerChoice = rps.compPick();

                if(computerChoice==1){
                    writeOutput("The computer picked rock");
                }
                else if(computerChoice == 2){
                    writeOutput("The computer picked paper");
                }
                else {
                    writeOutput("The computer picked scissors");
                }


                int result = rps.checker(rps.compPick(),3);
                if (result == 2){
                    writeOutput("It was a tie!");
                }
                else if(result == 0){
                    writeOutput("You beat the computer!");
                }
                else if(result == 1){
                    writeOutput("You lost!");
                }
                else{
                    writeOutput("something went wrong :(");
                }



                writeOutput("-------------------------------------");
            }
        });


        BorderPane.setAlignment(rock, Pos.BOTTOM_LEFT);

        BorderPane.setAlignment(paper, Pos.BOTTOM_CENTER);

        BorderPane.setAlignment(scissors, Pos.BOTTOM_RIGHT);
        Label label = new Label("Pick one");


        BorderPane borderpane = new BorderPane();
        borderpane.setLeft(rock);
        borderpane.setRight(scissors);
        borderpane.setCenter(paper);

        



        BorderPane root = new BorderPane();

        root.setBottom(borderpane);
        outputArea.setMaxHeight(90);
        root.setTop(outputArea);
        root.setCenter(label);





        Scene scene = new Scene(root,500,300);






        primaryStage.setScene(scene);




        primaryStage.show();

    }
    public Label getLabel(){
        Label label = new Label("peepee");
        return label;
    }
    public void writeOutput(String msg){
        this.outputArea.appendText(msg + "\n");
    }
}
