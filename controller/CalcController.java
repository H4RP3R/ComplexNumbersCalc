package controller;

import java.util.HashMap;
import java.util.function.BiFunction;

import model.Calculator;

public class CalcController<T> {
    private final Calculator<T> calculator;
    private final HashMap<Character, BiFunction<T, T, T>> operations;

    public CalcController(Calculator<T> calculator) {
        this.calculator = calculator;
        this.operations = new HashMap<>();
        this.operations.put('+', (a, b) -> sum(a, b));
        this.operations.put('-', (a, b) -> subtract(a, b));
        this.operations.put('*', (a, b) -> multiply(a, b));
        this.operations.put('/', (a, b) -> divide(a, b));
    }

    public T sum(T a, T b) {
        return calculator.sum(a, b);
    }

    public T subtract(T a, T b) {
        return calculator.subtract(a, b);
    }

    public T multiply(T a, T b) {
        return calculator.multiply(a, b);
    }

    public T divide(T a, T b) {
        return calculator.divide(a, b);
    }

    public T process(T a, T b, Character operator) {
        var result = operations.get(operator).apply(a, b);
        return result;
    }
}
