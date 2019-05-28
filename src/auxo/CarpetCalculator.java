package auxo;

import java.util.Scanner;

public class CarpetCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Width and height");
        double width=sc.nextDouble();
        double length=sc.nextDouble();
        Floor floor = new Floor(width, length);
        System.out.println("Enter the cost");
        double cost = sc.nextDouble();
        Carpet carpet = new Carpet(cost);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total cost " + calculator.getTotalCost());

    }
}

class Floor
{
    double width;
    double length;
    Floor(double width,double lenght)
    {
        this.width=isValid(width);
        this.length=isValid(lenght);
        double area=width*lenght;
    }
    public double getArea(double width,double length)
    {
        double area=width*length;
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

class Carpet
{
    double cost;
    Carpet(double cost)
    {
        if(cost>0) {
            this.cost = cost;
        }
        else
            this.cost=0;
    }
    public double getCost()
    {
        return cost;
    }

}

class Calculator
{
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet)
    {
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost()
    {
        double totalcost=(this.floor.length*this.floor.width)*this.carpet.cost;
        return  totalcost;

    }
}