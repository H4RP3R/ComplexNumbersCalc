package model;

public class ComplexNumber {
    private int real, imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%s + %si", real, imaginary);
        }
        return String.format("%s - %si", real, -imaginary);
    }
}