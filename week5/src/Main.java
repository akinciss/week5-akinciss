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
    }
}
