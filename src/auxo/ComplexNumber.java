package auxo;

public class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary=" + one.getImaginary());
        one.sub(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary=" + one.getImaginary());
        number.sub(one);
        System.out.println("number.real=" + number.getReal());
        System.out.println("number.imaginary=" + number.getImaginary());
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double x, double y) {
        this.real = real + x;
        this.imaginary = imaginary + y;
    }

    public void add(ComplexNumber number) {
        this.real = real + number.real;
        this.imaginary = imaginary + number.imaginary;
    }

    public void sub(double x, double y) {
        this.real = real - x;
        this.imaginary = imaginary - y;
    }

    public void sub(ComplexNumber number) {
        this.real = real - number.real;
        this.imaginary = imaginary - number.imaginary;
    }
}