public class  assignment1
{
  public static void main(String args[])
  {
    professor pr = new professor("John","Smith",29,"PhD Computer Science"); 
    professor pr2 = new professor("Zack","Mills",36,"MS Security and Risk Analysis");
    professor pr3 = new professor("Erik","Brown",48,"BS Information Sciences and Technology");
    
    if ( pr.age < pr2.age && pr.age < pr3.age )
    {
        if ( pr2.age < pr3.age )
        {
            System.out.println("The youngest professor is " + pr.getName() + ".");
            System.out.println("The oldest professor is " + pr3.getName() + ".");
        }
        else
        {
            System.out.println("The youngest professor is " + pr.getName() + ".");
            System.out.println("The oldest professor is " + pr2.getName() + ".");
        }
    }
    else if ( pr2.age < pr.age && pr2.age < pr3.age )
    {
        if ( pr.age < pr3.age )
        {
            System.out.println("The youngest professor is " + pr2.getName() + ".");
            System.out.println("The oldest professor is " + pr3.getName() + ".");
        }
        else
        {
            System.out.println("The youngest professor is " + pr2.getName() + ".");
            System.out.println("The oldest professor is " + pr.getName() + ".");
        }
    }
    else
    {
        if ( pr.age < pr2.age )
        {
            System.out.println("The youngest professor is " + pr3.getName() + ".");
            System.out.println("The oldest professor is " + pr2.getName() + ".");
        }
        else
        {
            System.out.println("The youngest professor is " + pr3.getName() + ".");
            System.out.println("The oldest professor is " + pr.getName() + ".");
        }
    }
  }
}