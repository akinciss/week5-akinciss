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
