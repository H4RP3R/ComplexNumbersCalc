package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.ComplexNumber;

public class InputUtil {
    private final Scanner in;
    private final List<String> validOperators;

    public InputUtil(Scanner in) {
        this.in = in;
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    public ComplexNumber getComplexNum() {
        ComplexNumber cNum = new ComplexNumber();
        System.out.print("Введите действительную часть: ");
        cNum.setReal(in.nextInt());
        System.out.print("Введите мнимую часть: ");
        cNum.setImaginary(in.nextInt());

        return cNum;
    }

    public Character getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите математическую операцию (*, +, /, -) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Введен неверный математический оператор. " + "Валидные операции (*, +, /, -) : ");
                operator = in.nextLine();
            } else
                return operator.charAt(0);
        }
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    public void clear() {
        this.in.next();
    }
}
