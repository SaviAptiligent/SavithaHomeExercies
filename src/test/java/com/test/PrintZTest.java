package com.test;

import com.json.PrintZ;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Savi on 5/21/2016.
 */
public class PrintZTest {

    @Test
    public void testPrintZ()
    {
        PrintZ pz = new PrintZ();
        ArrayList Actual = pz.printZ(4, "z");
        ArrayList Expected = new ArrayList();
        Expected.add(1);
        Expected.add(2);
        Expected.add(3);
        Expected.add(4);
        Expected.add(" ");
        Expected.add(" ");
        Expected.add(5);
        Expected.add(" ");
        Expected.add(6);
        Expected.add(7);
        Expected.add(8);
        Expected.add(9);
        Expected.add(0);


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

