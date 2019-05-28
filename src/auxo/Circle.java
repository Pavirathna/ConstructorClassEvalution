package auxo;

import java.util.Scanner;

class Circle {
   double radius;

Circle(){

}
   Circle(double radius)
   {
      this.radius=isValid(radius);

   }

   public double getRadius()
   {
       return radius;
   }
   public double getArea()
   {
       double area=radius*radius*3.14;
       System.out.println(radius);
       return area;
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
}
class Cylinder extends Circle
{
    double height;
    double radius;
    Cylinder(double radius,double height)
    {
        super(radius);
        this.height=isValid(height);
        this.radius=isValid(radius);

    }
    public double getHeight() {
        return height;
    }

    public double getVolume()
    {
        double volume=getArea()*height;
        return volume;
    }


    public static void main(String[]args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius  for circle:");
        double radius=sc.nextDouble();
        Circle circle=new Circle(radius);
        System.out.println("Circle .radius ="+circle.getRadius());
        System.out.println(("Circle.area ="+circle.getArea()));
        System.out.println("Enter Radius   and height for cylinder:");
        double radius2=sc.nextDouble();
        double height=sc.nextDouble();
        Cylinder cylinder=new Cylinder(radius2,height);
        System.out.println("Cylinder.radius = "+cylinder.getRadius());
        System.out.println("Cylinder.height = "+cylinder.getHeight());
        System.out.println("Cylinder.area = "+cylinder.getArea());
        System.out.println("Cylinder.volume= "+cylinder.getVolume());
    }

}

