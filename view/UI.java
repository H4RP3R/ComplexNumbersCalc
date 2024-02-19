package view;

import java.util.InputMismatchException;
import java.util.logging.Logger;

import controller.CalcController;
import model.ComplexNumber;
import utils.InputUtil;

public class UI {
    private final CalcController<ComplexNumber> calcController;
    private final InputUtil input;
    private final Logger logger;

    public UI(CalcController<ComplexNumber> calcController, InputUtil input, Logger logger) {
        this.calcController = calcController;
        this.input = input;
        this.logger = logger;
    }

    public void run() {
        System.out.println("\nctrl+C чтобы завершить программу\n");
        while (true) {
            try {
                ComplexNumber a = input.getComplexNum();
                Character op = input.getOperator();
                ComplexNumber b = input.getComplexNum();
                var result = calcController.process(a, b, op);
                System.out.println(result);
            } catch (InputMismatchException e) {
                logger.warning(e.toString());
                input.clear();
            } catch (ArithmeticException e) {
                logger.warning(e.toString());
            }
        }
    }
}
