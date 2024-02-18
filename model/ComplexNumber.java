package model;

import java.text.DecimalFormat;

public class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.######");
        if (imaginary >= 0) {
            return String.format("%s + %si", df.format(real), df.format(imaginary));
        }
        return String.format("%s - %si", df.format(real), df.format(imaginary));
    }
}