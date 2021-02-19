import java.util.*;

public class countingwhile {

    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n;
        System.out.println("\nEnter any no.=");
        n=scn.nextInt();
        int i=0;
        while(i<n)
        {
            System.out.println(i+"\n");
            i++;
        }        
    }
}