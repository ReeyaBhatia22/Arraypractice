import java.util.Scanner;
public class Project
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int i,k=0,p=0,ns,lb=0,ub=9;
        int m[]= new int[10];
        System.out.println("Enter the numbers in the array :  ");
        for(i=0;i<10;i++)
        {
            m[i]= sc.nextInt();
        }
        System.out.println("Enter the number to be searched  ");
        ns= sc.nextInt();
        while(lb<=ub)
        {
            p=lb+ub/2;
            if(m[p]<ns)
        lb=p+1;
        if(m[p]>ns)
        ub=p-1;
        if(m[p]==ns)
        {
            k=1;
            break;
        }
    }
    if(k==1)
    {
        System.out.println("The search is successful and the number is present ");

    }
    else
    {
        System.out.println("The search is not uccessful and the number is not present ");
    }
      
    sc.close();
  }
  

 }

