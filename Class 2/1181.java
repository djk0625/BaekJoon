import java.io.*;
import java.lang.*;
import java.util.*;

class I2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        String data[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            data[i] = scanner.next();
        }

        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                if(a1.length() == a2.length())
                {
                    return a1.compareTo(a2);
                }
                else
                {
                    return a1.length() - a2.length();
                }
            }
        });

        System.out.println(data[0]);

        for(int i = 1; i < n; i++)
        {
            if(!data[i].equals(data[i-1]))
            {
                System.out.println(data[i]);
            }
        }
    }
}