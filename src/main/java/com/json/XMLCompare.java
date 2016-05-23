package com.json; /**
 * Created by Savi on 5/20/2016.
 */import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.xml.sax.SAXException;

public class XMLCompare {


    public boolean filecomparing(String first, String second) {
        URL url1 = XMLCompare.class.getResource(first);
        URL url2 = XMLCompare.class.getResource(second);
        FileReader fr1 = null;
        FileReader fr2 = null;
        Diff diff = null;
        try {
            fr1 = new FileReader(url1.getPath());
            fr2 = new FileReader(url2.getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //XMLUnit.setCompareUnmatched(Boolean.FALSE);

        try {
             diff = new Diff(fr1, fr2);
            System.out.println("Similar? " + diff.similar());
            System.out.println("Identical? " + diff.identical());

            DetailedDiff detDiff = new DetailedDiff(diff);
            List differences = detDiff.getAllDifferences();
            for (Object object : differences) {
                Difference difference = (Difference) object;
                System.out.println("***********************");
                System.out.println(difference);
                System.out.println("***********************");
            }

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return diff.similar();
    }

    public static void main(String[] args) {

    }

}

