class Point {
    public int xCoord, yCoord;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    Point(int x) {
        this(x, x);
    }
}

class Circle {
    private Point center;
    private int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    Point getCenter() {
        return center;
    }

    void setCenter(Point center) {
        this.center = center;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    private Point topleft;
    private int sideA, sideB;

    Rectangle(Point topleft, int sideA, int sideB) {
        this.topleft = topleft;
        setSideA(sideA);
        setSideB(sideB);
    }

    Rectangle(Point topleft, int sideA) {
        this(topleft, sideA, sideA);
    }

    Point getTopleft() {
        return topleft;
    }

    void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    int getSideA() {
        return sideA;
    }

    void setSideA(int sideA) {
        if (sideA < 0) {
            this.sideA = 0;
            System.out.println("Side A cannot be negative");
        } else {
            this.sideA = sideA;
        }
    }

    int getSideB() {
        return sideB;
    }

    void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B cannot be negative");
        } else {
            this.sideB = sideB;
        }
    }

    int perimeter() {
        return 2 * (sideA + sideB);
    }

    int area() {
        return sideA * sideB;
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3, 4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Rectangle r1 = new Rectangle(new Point(3, 4), 5, 6);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopleft().xCoord);
        System.out.println(r1.getTopleft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(new Point(2, 2), 5);
        System.out.println(c1.getCenter().xCoord);
        System.out.println(c1.getCenter().yCoord);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
