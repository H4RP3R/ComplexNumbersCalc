import java.util.Scanner;

import controller.CalcController;
import model.Calculator;
import model.ComplexNumber;
import model.impl.ComplexNumberCalculator;
import utils.InputUtil;
import view.UI;

public class Main {
    public static void main(String[] args) {
        Calculator<ComplexNumber> calc = new ComplexNumberCalculator();
        CalcController<ComplexNumber> calcController = new CalcController<>(calc);

        UI UI = new UI(calcController, new InputUtil(new Scanner(System.in)));
        UI.run();
        // TODO: exceptions, logging, CHECK DOUBLES!!!, fix toString with double minus!
    }
}