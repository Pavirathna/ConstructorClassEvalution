package auxo;

import java.util.Scanner;

public class Point {
    int x;
    int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {

            System.out.println("enter the main points");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x, y);
            System.out.println("point distance from 0,0 =" + point.distance());
            System.out.println("enter the points you want to calculate");
            int dis_x = scanner.nextInt();
            int dis_y = scanner.nextInt();

            System.out.println("distance between (" + point.x + " " + point.y + ")" + "  (" + dis_x + " " + dis_y + " )=" + point.distance(dis_x, dis_y));
            System.out.println("enter the passing point ");
            int p_x = scanner.nextInt();
            int p_y = scanner.nextInt();
            Point sec = new Point(p_x, p_y);
            System.out.println("distance between new point to old point =" + point.distance(sec));

        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((this.x - 0) * (this.x - 0)) + ((this.y - 0) * (this.y - 0))); //Distance between two points formula
    }

    public double distance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));//Distance between two points formula
    }

    public double distance(Point point) {
        return Math.sqrt(((x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)));//Distance between two points formula
    }
}