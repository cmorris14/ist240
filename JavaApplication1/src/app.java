public class  app
{
  public static void main(String args[])
  {
    student st = new student("John","Smith",20); 
    student st2 = new student("Zack","Mills",21); 
    
    if ( st.age < st2.age )
    {
        System.out.println("The youngest student is " + st.getName() + ".");
        System.out.println("The oldest student is " + st2.getName() + ".");
    }
    else
    {
        System.out.println("The youngest student is " + st2.getName() + ".");
        System.out.println("The oldest student is " + st.getName() + ".");
    }
  }
}