package package1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your age");
        int age = sc.nextInt();

        System.out.println("your age is: "+age );
    }
}
