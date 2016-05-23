package com.test;
import com.json.IPAddress;
import org.testng.annotations.Test;
import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Savi on 5/20/2016.
 */

public class IPAddressTest {
    @Test
    public void IPAddress() {
        IPAddress ip = new IPAddress();
        ArrayList Actual = ip.isIPaddress("23454");
                ArrayList<String> Expected = new ArrayList<>();

        Expected.add("2.3.9.44");
        Expected.add("2.3.94.4");
        Expected.add("2.39.4.4");
        Expected.add("23.9.4.4");
        boolean Result;
    if(Actual.equals(Expected)==true)
    {
        Result= true;
    }
        else
    {
        Result = false;
    }
        assertEquals(Result, true);
   }
}