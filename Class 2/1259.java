import java.io.*;
import java.lang.*;
import java.util.*;

class G2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        while(true)
        {
            String n = scanner.nextLine();
            int t = n.length();
            String m = "yes";

            for(int i = 0; i < t/2; i++)
            {
                if(n.charAt(i) != n.charAt(t - i - 1))
                {
                    m = "no";                    
                }
            }

            if(n.equals("0"))
            {
                break;
            }
            System.out.println(m);
        }
    }
}
