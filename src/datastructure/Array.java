package datastructure;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        //datatype - non-primitive
        //declare array and initialize = inline array
        int myNumbers [] = {5,3,8,6,6,8};
        System.out.println(myNumbers[2]);
        for (int i=0; i<6; i++){
            System.out.println(myNumbers[i]);
        }
        System.out.println("------------------------------------");
        // declare array of 5 numbers (size of the array)
        int[] myNumbers2 = new int[5];
        //assign array values
        myNumbers2[0] = 2;
        myNumbers2[1] = 6;
        myNumbers2[2] = 4;
        myNumbers2[3] = 1;
        myNumbers2[4] = 2;

        //System.out.println(myNumbers2[2]);
        for (int i = 0; i<myNumbers2.length; i++){
            System.out.print(myNumbers2[i]);
        }
        System.out.println("-------------------------------------------");

        int list1 [] = new int[10];
        Random random = new Random();
        for (int i = 0; i <list1.length; i++){
            list1[i] = random.nextInt(10);
            System.out.println(list1[i]);
        }

    }
}
