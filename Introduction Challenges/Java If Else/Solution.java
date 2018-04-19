import java.util.*;

public class Solution
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        while(n<=0||n>100)
        {
            n=input.nextInt();
        }
        
        if(n%2==1)
        {
            System.out.println("Weird");
            //System.out.println("1");
        }
        else if(n>=2&&n<=5)
        {
            System.out.println("Not Weird");
            //System.out.println("2");
        }
        else if(n>=6&&n<=20)
        {
            System.out.println("Weird");
            //System.out.println("3");
        }
        else
        {
            System.out.println("Not Weird");
            //System.out.println("4");
        }
    }
}