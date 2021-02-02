package homeworkOneClass;

import static java.lang.Math.pow;

interface Shape {
    double PI = 3.14;

    String printName();

    double area();

    double perimeter();
}

class Circle implements Shape {
    private final static int DEFAULT_RADIUS = 6;
    private int radius;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String printName() {
        return "a circle with radius " + this.radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}

class Quad implements Shape {
    private int length;
    private int width;
    private static final int DEFAULT_LENGTH = 4;
    private static final int DEFAULT_WIDTH = 6;

    public Quad() {
        this(DEFAULT_LENGTH, DEFAULT_WIDTH);
    }

    public Quad(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String printName() {
        return "a quad with sides " + this.length + "x" + this.width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * this.length + 2 * this.width;
    }
}

class Rhombus implements Shape {
    private int d1, d2; // diagonals
    private static final int DEFAULT_DIAGONAL_1 = 2;
    private static final int DEFAULT_DIAGONAL_2 = 3;

    public Rhombus() {
        this(DEFAULT_DIAGONAL_1, DEFAULT_DIAGONAL_2);
    }

    public Rhombus(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public String printName() {
        return "a rhombus with diagonals " + this.d1 + "x" + this.d2;
    }

    @Override
    public double area() {
        return (this.d1 * this.d2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * Math.sqrt(Math.pow(this.d1 / 2, 2) + Math.pow(this.d2 / 2, 2));
    }
}

class Square implements Shape {
    private int side;
    private static final int DEFAULT_SIDE = 4;

    public Square() {
        this(DEFAULT_SIDE);
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String printName() {
        return "a square with side " + this.side;
    }

    @Override
    public double area() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }
}

class Triangle implements Shape {
    private int side1, side2, side3;
    private static final int DEFAULT_SIDE1 = 3;
    private static final int DEFAULT_SIDE2 = 4;
    private static final int DEFAULT_SIDE3 = 5;

    public Triangle() {
        this(DEFAULT_SIDE1, DEFAULT_SIDE2, DEFAULT_SIDE3);
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String printName() {
        return "a triangle with sides " + this.side1 + "x" + this.side2 + "x" + this.side3;
    }

    @Override
    public double area() {
        int p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}

class PrintInfo {
    public void print(Shape figure) {
        System.out.printf("Current figure is %s \n", figure.printName());
        System.out.printf("Area is %.2f \n", figure.area());
        System.out.printf("Perimeter is %.2f \n", figure.perimeter());
        System.out.println("-".repeat(15));
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        PrintInfo printInfo = new PrintInfo();

        printInfo.print(new Circle());
        printInfo.print(new Circle(5));
        printInfo.print(new Quad());
        printInfo.print(new Quad(6,8));
        printInfo.print(new Square());
        printInfo.print(new Square(5));
        printInfo.print(new Rhombus());
        printInfo.print(new Rhombus(6,8));
        printInfo.print(new Triangle());
        printInfo.print(new Triangle(6,8,12));
    }
}
