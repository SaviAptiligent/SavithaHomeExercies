package com.json;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Savi on 5/20/2016.
 */

public class PrintZ {

    public static String shape;
    public ArrayList printZ(int n, String s)
    {
        int t = n;
        ArrayList ar = new ArrayList();
        for (int x = 1; x <= n; x++)
        {
            System.out.print(x);
            ar.add(x);
        }
        System.out.println();
        for (int x = n - 3; x >= 0; x--)
        {
            int y = 0;
            for (y = x; y >= 0; y--)
            {
                ar.add(" ");

                System.out.print(" ");
            }
            t = t + 1;
            System.out.println(t);
            ar.add(t);

        }
        for (int x = 0; x < n - 1; x++)
        {
            t = t + 1;
            System.out.print(t);
            ar.add(t);
        }
       System.out.print(0);
        ar.add(0);
System.out.println("AR Size : "+   ar.size());

        return ar;
    }

    public ArrayList printN(int n, String shape)
    {
        int t = n;
        ArrayList ar = new ArrayList();
//char a =
       return ar;
            }
    public static void main(String[] args) {
        System.out.print("Enter the shape you want your layout: ");
        Scanner input = new Scanner(System.in);
        shape = input.next();
        System.out.print("Enter the size of the layout: ");
        Scanner size = new Scanner(System.in);
        int n = size.nextInt();

        PrintZ pz = new PrintZ();
        ArrayList Actual = new ArrayList();


                if(shape.equals("Z") || shape.equals("z")) {
                    Actual = pz.printZ(n, shape);
               }
                else if(shape.equals("N")|| shape.equals("n"))
                {
                     Actual = pz.printN(n, shape);
                }
                else
                {
                    System.out.println("Please Enter the valid number");
                }
        }
}


