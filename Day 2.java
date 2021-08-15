import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, double tip_percent, double tax_percent) 
    {
    // Write your code here
      
     tip_percent=(tip_percent*meal_cost)/100;
     tax_percent=(tax_percent*meal_cost)/100;
     meal_cost=meal_cost+tip_percent+tax_percent;
      int value = (int)Math.round(meal_cost);
      
        System.out.println(value);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        double tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        double tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}