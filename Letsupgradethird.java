import java.util.Scanner;
public class Letsupgradethird {
    public static void main(String [] args)
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter integer value : ");
        n=obj.nextInt();
        System.out.println("The sum of all integer is :");
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            System.out.println(sum);
        }
    }
    
}
