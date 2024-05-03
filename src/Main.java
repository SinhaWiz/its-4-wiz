import javax.swing.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

            Integer [] intArray= {1,4,1,5,2,6,3};
            Character [] charArray= {'A','B','C','D'};
            Double [] doubleArray= {1.0,4.1,1.4,1.5,2.4,2.6,3.2};
            String [] stringArray= {"Ferrari","Bugatti","Maserati"};
                displayArray(doubleArray);
                new Game2();
            }
    public static<Thing> void displayArray(Thing[] a){
        for(Thing x: a)
            System.out.println(x+" ");
    }

    }
