package auxo;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName ,LastName ,Age :");
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int age=sc.nextInt();
        Person person=new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        System.out.println("FullName :"+person.getFullName());
        System.out.println("teen : "+person.isTeen());

    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if((age>0)&&(age<100)){
            this.age=0;
        }
        else
            this.age=age;
    }

    public boolean isTeen()
    {
        if((age>12)&&(age<20))
        {
            return true;
        }
        return false;
    }

    public String getFullName()
    {
        String emptyString=" ";
        if(firstName.isEmpty()&&lastName.isEmpty())
        {
            return emptyString;
        }
        else if(firstName.isEmpty())
        {
            return lastName;
        }
        else if(lastName.isEmpty())
        {
            return firstName;
        }
        else
        {
            return firstName+" "+lastName;
        }
    }

}
