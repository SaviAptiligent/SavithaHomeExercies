/**
 * Created by Savi on 5/20/2016.
 */

package com.json;
import java.io.*;
import java.util.ArrayList;


public class IPAddress {
    public ArrayList<String> isIPaddress(String number) {
        StringBuilder sb = null;
        ArrayList<String> s = new ArrayList<>();

        int l = number.length() - 3;
        for (int a = 0; a < l; a++) {
            for (int b = 0; b < l - a; b++) {
                for (int c = 0; c < l - a - b; c++) {
                    sb = new StringBuilder(number);
                    sb.insert(a + 1, ".");
                    sb.insert(a + b + 3, ".");
                    sb.insert(a + b + c + 5, ".");
                    s.add(sb.toString());
                 }
            }
        }
        return s;
    }

    public static void main(String[] args) {   // Every program must have main()

        IPAddress ip = new IPAddress();
        ArrayList Actual = ip.isIPaddress("23944");
        //ArrayList Expected =
        int i=0;
        ArrayList<String> Expected = new ArrayList<>();
    for(i = 0; i<Actual.size(); i++) {
        System.out.println(Actual.get(i));
        }
        Expected.add("");
    }
}



