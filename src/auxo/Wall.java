package auxo;

import java.util.Scanner;

public class Wall {
    double width;
    double height;
    Wall()
    {

    }
    public Wall(double width, double height) {

        this.width = notEqual(width);
        this.height = notEqual(height);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        Wall wall=new Wall(height,width);
        wall.setHight(height);
        wall.setWidth(width);
        System.out.println("area : "+wall.area());

    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width=notEqual(width);
    }

    public void setHight(double height)
    {
        this.height=notEqual(height);
    }

    public double area()
    {
        double area=width*height;
        return area;
    }

    public double notEqual(double number)
    {
        if(number>0) {
            return number;
        }
        else
            return 0;

    }
}
