package FinalPackage;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Button rock;
    public Button paper;
    public Button scissors;
    public Label lbl;
    public Label lbl2;

    public void playRock(ActionEvent actionEvent) {
        rps.Outcome result = rps.pickedRock();
        if(result== rps.Outcome.WIN){
            lbl.setText("You Won");
            lbl2.setText("computer: scissors");
        }
        else if(result == rps.Outcome.DRAW){
            lbl.setText("It was a draw");
            lbl2.setText("computer: rock");
        }
        else{
            lbl.setText("You Lost");
            lbl2.setText("computer: paper");
        }
    }
    public void playScissors(ActionEvent actionEvent) {
        rps.Outcome result = rps.pickedScissors();
        if(result== rps.Outcome.WIN){
            lbl.setText("You Won");
            lbl2.setText("computer: paper");
        }
        else if(result == rps.Outcome.DRAW){
            lbl.setText("It was a draw");
            lbl2.setText("computer: scissors");
        }
        else{
            lbl.setText("You Lost");
            lbl2.setText("computer: rock");
        }
    }

    public void playPaper(ActionEvent actionEvent) {
        rps.Outcome result = rps.pickedPaper();
        if(result== rps.Outcome.WIN){
            lbl.setText("You Won");
            lbl2.setText("computer: rock");
        }
        else if(result == rps.Outcome.DRAW){
            lbl.setText("It was a draw");
            lbl2.setText("computer: paper");
        }
        else{
            lbl.setText("You Lost");
            lbl2.setText("computer: scissors");
        }

    }
}
