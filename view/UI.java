package view;

import controller.CalcController;
import model.ComplexNumber;
import utils.InputUtil;

public class UI {
    private final CalcController<ComplexNumber> calcController;
    private final InputUtil input;

    public UI(CalcController<ComplexNumber> calcController, InputUtil input) {
        this.calcController = calcController;
        this.input = input;
    }

    public void run() {
        while (true) {
            ComplexNumber a = input.getComplexNum();
            Character op = input.getOperator();
            ComplexNumber b = input.getComplexNum();

            var result = calcController.process(a, b, op);
            System.out.println(result);
        }
    }
}
