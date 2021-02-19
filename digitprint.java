import java.util.Scanner;

public class digitprint {

    public static void main(String[] args)
    {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("\nenter no.=");
        int n= scn.nextInt();
        
        //1st job - to find the no. of digits 
        int dig=0;
        int temp =n;
        while(temp!=0)
        {
            temp = temp/10;
            dig++;
        }
        //2nd job - to print digits in order

        int div =(int)Math.pow(10, dig-1);

        while(n!=0)
        {
            //main step-
            int q= n/div;
            System.out.println("\n"+q);
            //now we have to decrease n and div respectively ...
            n=n%div;

            div=div/10;
        }




    }
}