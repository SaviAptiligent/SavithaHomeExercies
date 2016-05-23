package com.test;

import com.json.FizzBuzz;
import org.testng.annotations.Test;
import org.testng.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Comparator;
import java.util.Iterator;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Savi on 5/22/2016.
 */
public class FizzBuzzTest{
    FizzBuzz fb = new FizzBuzz();
    @Test
    public void FizzBuzzrange20() {
        ArrayList Actual = fb.tryFizzBuzz(20);
        ArrayList Expected = new ArrayList();
        Expected.add(1);
        Expected.add(2);
        Expected.add("buzz");
        Expected.add(4);
        Expected.add("fizz");
        Expected.add("buzz");
        Expected.add(7);
        Expected.add(8);
        Expected.add("buzz");
        Expected.add("fizz");
        Expected.add(11);
        Expected.add("buzz");
        Expected.add(13);
        Expected.add(14);
        Expected.add("fizzbuzz");
        Expected.add(16);
        Expected.add(17);
        Expected.add("buzz");
        Expected.add(19);
        Expected.add("fizz");
 //       1 2 buzz 4 fizz buzz 7 8 buzz fizz 11 buzz 13 14 fizzbuzz 16 17 buzz 19 fizz
boolean flag = true;
for(Object e: Actual)
        {
            for(Object r: Expected)
            if(e.equals(r))
            {
               System.out.println(true);
            }
            else
            {
                flag = false;
             }
  }

     assertEquals(flag, true);
        }
}
