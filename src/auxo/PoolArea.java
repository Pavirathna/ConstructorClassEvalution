package auxo;

import java.util.Scanner;

public class PoolArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("rectangle.width= "+rectangle.getWidth());
        System.out.println("rectangle.length= "+rectangle.getLenght());
        System.out.println("rectangle.area= "+rectangle.getArea());
        Cuboid cuboid=new Cuboid(5,10,5);
        System.out.println("cuboid.width= "+cuboid.getWidth());
        System.out.println("cuboid.length= "+cuboid.getLenght());
        System.out.println("cuboid.area= "+cuboid.getArea());
        System.out.println("cuboid.height= "+cuboid.getHeight());
        System.out.println("cuboid.volume= "+cuboid.getVolume());
    }
}

class Rectangle
{
    double width;
    double lenght;
    Rectangle(double width,double lenght)
    {
        this.width=isValid(width);
        this.lenght=isValid(lenght);

    }
    public double isValid(double number)
    {
        if(number>0)
        {
            return number;
        }
        else
            return 0;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLenght()
    {
        return lenght;
    }
    public double getArea()
    {
        double area=width*lenght;
        return area;
    }
}

class Cuboid extends Rectangle
{
    double height;
    Cuboid(double width, double lenght,double height) {
        super(width, lenght);
        this.height=isValid(height);
    }

    public double getHeight() {
        return height;
    }
    public double getVolume()
    {
        double volume=getArea()*height;
        return volume;
    }
}
