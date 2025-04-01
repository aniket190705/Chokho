import java.util.Scanner;



abstract class Figure {
    int x, y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}

class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    void area() {
        System.out.println("Rectangle Area: " + (x * y));
    }
}

class Square extends Figure {
    Square(int side) {
        super(side, side);
    }

    void area() {
        System.out.println("Square Area: " + (x * x));
    }
}

class Triangle extends Figure {
    Triangle(int base, int height) {
        super(base, height);
    }

    void area() {
        System.out.println("Triangle Area: " + (0.5 * x * y));
    }
}


public class FigureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Shape: 1. Rectangle 2. Square 3. Triangle");
        int shapeChoice = scanner.nextInt();
        Figure figure;

        if (shapeChoice == 1) {
            System.out.print("Enter length: ");
            int length = scanner.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = scanner.nextInt();
            figure = new Rectangle(length, breadth);
        } else if (shapeChoice == 2) {
            System.out.print("Enter side: ");
            int side = scanner.nextInt();
            figure = new Square(side);
        } else {
            System.out.print("Enter base: ");
            int base = scanner.nextInt();
            System.out.print("Enter height: ");
            int height = scanner.nextInt();
            figure = new Triangle(base, height);
        }

        figure.area();
        scanner.close();
    }
}
