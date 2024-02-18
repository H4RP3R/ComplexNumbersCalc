package model.impl;

import model.Calculator;
import model.ComplexNumber;

public class ComplexNumberCalculator extends Calculator<ComplexNumber> {
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        ComplexNumber cNum = new ComplexNumber();
        cNum.setReal(a.getReal() + b.getReal());
        cNum.setImaginary(a.getImaginary() + b.getImaginary());
        return cNum;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber cNum = new ComplexNumber();
        cNum.setReal(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary());
        cNum.setImaginary(a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
        return cNum;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber cNum = new ComplexNumber();
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        cNum.setReal((a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor);
        cNum.setImaginary((a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor);
        return cNum;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber cNum = new ComplexNumber();
        cNum.setReal(a.getReal() - b.getReal());
        cNum.setImaginary(a.getImaginary() - b.getImaginary());
        return cNum;
    }
}