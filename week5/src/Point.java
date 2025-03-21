public class Point {
    public int xCoord, yCoord;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int x) {
        this(x, x);
    }
}
