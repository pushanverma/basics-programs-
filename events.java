import java.util.*;

public class events
{
    public static void main(String[] args)
    {
        int e1s,e1e,e2s,e2e;
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter starting and ending of event 1=>");
        e1s=scn.nextInt();
        e1e=scn.nextInt();
        System.out.println("\nEnter starting and ending of event 2=>");
        e2s=scn.nextInt();
        e2e=scn.nextInt();

    if(e2s>e1e || e1s>e2e )
    {
        System.out.println("\nNo Overlap");
    }
    else if(e2s>e1s && e1e>e2e || e1s>e2s && e2e>e1e)
    {
        System.out.println("\nFull Overlap");
    }
    else
    {
        System.out.println("\nPartial Overlap");
    }

    }
}