/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

public class LayoutGUIController implements Initializable {

    private String crrntArthOp = "DEFAULT";

    private String opd1 = "0";

    @FXML
    private TextField textBox;
    @FXML
    private Button delbtn;
    @FXML
    private Button acbtn;
    @FXML
    private Button percentbtnpercentbtn;
    @FXML
    private Button dividionbtn;
    @FXML
    private Button onebtn;
    @FXML
    private Button twobtn;
    @FXML
    private Button sevenbtn;
    @FXML
    private Button minusbtn;
    @FXML
    private Button sixbtn;
    @FXML
    private Button fivebtn;
    @FXML
    private Button fourbtn;
    @FXML
    private Button multiplybtn;
    @FXML
    private Button threebtn;
    @FXML
    private Button zerobtn;
    @FXML
    private Button plusbtn;
    @FXML
    private Button ninebtn;
    @FXML
    private Button eightbtn;
    @FXML
    private Button dotbtn;
    @FXML
    private Button equalbtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void addDigits(ActionEvent event) {

        Button btn = (Button) event.getSource();

        switch (btn.getText()) {
            case "1":
                textBox.setText(textBox.getText() + "1");
                break;
            case "2":
                textBox.setText(textBox.getText() + "2");
                break;
            case "3":
                textBox.setText(textBox.getText() + "3");
                break;
            case "4":
                textBox.setText(textBox.getText() + "4");
                break;
            case "5":
                textBox.setText(textBox.getText() + "5");
                break;
            case "6":
                textBox.setText(textBox.getText() + "6");
                break;
            case "7":
                textBox.setText(textBox.getText() + "7");
                break;
            case "8":
                textBox.setText(textBox.getText() + "8");
                break;
            case "9":
                textBox.setText(textBox.getText() + "9");
                break;
            case "0":
                textBox.setText(textBox.getText() + "0");
                break;
            case ".":
                textBox.setText(textBox.getText() + ".");
                break;

        }

    }

    @FXML
    private void arOpMeth(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn.getText().equals("+")) {
            if (crrntArthOp.equals("DEFAULT")) {
                opd1 = textBox.getText();
                crrntArthOp = "Add";
                textBox.clear();

            } else if (crrntArthOp.equals("DEFAULT")) {
                opd1 = textBox.getText();
                crrntArthOp = "Multi";
                textBox.clear();

            } else if (crrntArthOp.equals("DEFAULT")) {
                opd1 = textBox.getText();
                crrntArthOp = "Division";
                textBox.clear();

            } else if (crrntArthOp.equals("DEFAULT")) {
                opd1 = textBox.getText();
                crrntArthOp = "Substract";
                textBox.clear();

            }
        }

    }

    @FXML
    private void decimalPnt(ActionEvent event) {

    }

    @FXML
    private void processResult(ActionEvent event) {

        double num1 = Integer.parseInt(opd1);
        double num2 = Integer.parseInt(textBox.getText());
        if (crrntArthOp.equals("Substract")) {
            textBox.setText("" + (num1 - num2));

        } else if (crrntArthOp.equals("Add")) {
            textBox.setText("" + (num1 + num2));

        } else if (crrntArthOp.equals("Multi")) {
            textBox.setText("" + (num1 * num2));

        } else if (crrntArthOp.equals("Division")) {
            textBox.setText("" + (num1 / num2));
        } else {
            textBox.setText("Error occur");
        }
    }

    @FXML
    private void delOp(ActionEvent event) {

        if (crrntArthOp.equals("Del")) {
            textBox.setText("");
            return;
        }

    }

}
