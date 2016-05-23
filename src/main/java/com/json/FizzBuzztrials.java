package com.json;

/**
 * Created by Savi on 5/20/2016.
 */
public class FizzBuzztrials
{
    int temp = 0;
    int i = 0;

    public int checkFizzBuzz()
    {
        int fizzbuzz = 0;
        for (i = 1; i <= 100; i++)
        {
            if (((i % 5) == 0) && ((i % 3) == 0))
            {
                //System.out.println("FIZZBUZZ : " + i);
                fizzbuzz++;
            }
        }
        return fizzbuzz;
    }
    public int checkBuzz()
    {
        int buzz = 0;
        for (i = 1; i <= 100; i++)
        {
            if ((i % 3) == 0)
            {
                //System.out.println("BUZZ : " + i);
                buzz++;
            }
      }
        return buzz;
    }
   public int checkFizz()
   {
        int fizz = 0;
        for (i = 1; i <= 100; i++)
        {
            if ((i % 5) == 0)
            {
                //System.out.println("Fizz : " + i);
                fizz++;
            }
        }
        return fizz;
    }

    public int checkelse()
    {
        int remaining = 0;
        for (i = 1; i <= 100; i++)
        {
            if (((i % 5) == 0 || (i % 3) == 0) ||((i % 5) == 0) && ((i % 7) == 0))
            {
                remaining++;
            }
        }
         System.out.println("Remaining : " + remaining);
        return remaining;
    }
    public static void main(String[] args)
    {
        FizzBuzztrials f = new FizzBuzztrials();
        int fb = f.checkFizzBuzz();
        int b = f.checkBuzz();
        int fi = f.checkFizz();
        int rem = f.checkelse();

        //Ideally the test class is written in a separate package here is the logic to test..

        if (fb == 6)
        {
            System.out.print(" FizzBuzztrials test passed..");
        }
/*
        if (b == 47)
        {
            System.out.print(" Buzz test passed..");
        }
        if (fi == 33)
        {
            System.out.print(" Fizz test passed..");
        }
        if (rem == 20)
        {
            System.out.print(" remaing numbers test passed..");
        }
*/
    }
}
