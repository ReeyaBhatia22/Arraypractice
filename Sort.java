import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int min=0;
        int i,j;
        // creating an array
        int a[]= new int[5];
        System.out.println("Enter the numbers");
        for(i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            min=i;
            for(j=i+1;j<5;j++)
            {
                
                if(a[j]<a[min])
                {
                    min=j;
                }
            
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("The numbers in ascending order are: ");
        for(i=0;i<5;i++)
        {
           System.out.print(a[i]);
        }
    }
}