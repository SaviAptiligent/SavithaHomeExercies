package com.json;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Savi on 5/22/2016.
 */


public class FizzBuzz
{
    public ArrayList<String> tryFizzBuzz(int range)
    {
        ArrayList<String> s = new ArrayList();
        for(int i = 1; i <= range; i++)
        {
            if (((i % 5) == 0) && ((i % 3) == 0))
            {
                s.add("fizzbuzz");
                System.out.print("fizzbuzz");
            }
            else if ((i % 5) == 0)
            {
                s.add("fizz");
              System.out.print("fizz");
            }
            else if ((i % 3) == 0)
            {
                s.add("buzz");

                System.out.print("buzz");
            }
            else
            {
                s.add(Integer.toString(i));
                System.out.print(i);
            }
            System.out.print(" ");
        }
        return s;
    }
    public static void main(String[] args) {
        int range = 0;
        System.out.print("Enter the range : ");
        Scanner input = new Scanner(System.in);
        range = input.nextInt();
        input.close();

        FizzBuzz fb = new FizzBuzz();
        ArrayList result = fb.tryFizzBuzz(range);
      //  System.out.println(result.size());

    }
}