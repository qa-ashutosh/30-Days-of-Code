import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int da = sc.nextInt();
    int ma = sc.nextInt();
    int ya = sc.nextInt();

    int de = sc.nextInt();
    int me = sc.nextInt();
    int ye = sc.nextInt();

    int fine = 0;

    if (ya > ye) fine = 10000;
        else if (ya == ye) {
            if (ma > me) fine = (ma - me) * 500;
            else if (ma == me && da > de) fine = (da - de) * 15;
        }

    System.out.println(fine);
    }
}

