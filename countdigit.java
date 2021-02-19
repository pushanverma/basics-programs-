import java.util.Scanner;

public class countdigit {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nenter no. =");
        int n= scn.nextInt();
        int digit=0;
        while(n!=0)
        {
            n=n/10;
            digit++;
        }
        System.out.println("\nthe digits are ="+digit);

    }
}