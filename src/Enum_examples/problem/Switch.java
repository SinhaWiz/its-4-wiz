package Enum_examples.problem;

import java.util.Scanner;

enum Calc{
    ADD(1),DIV(4),PRODUCT(3),SUBTRACT(2);
    final int number;
    Calc(int number){
        this.number = number;
    }

}

public class Switch {

        double num1,num2;
        Switch(double num1 ,double num2){
              this.num1=num1;
              this.num2=num2;
        }
    public void performOperation(Calc choice){
        switch(choice ){
            case ADD:
                double sum = num1 + num2 ;
                System.out.println("Summation "+ sum);
                break;
            case SUBTRACT:
                double subtraction = num1 - num2 ;
                System.out.println("Subtraction "+ subtraction);
                break;
            case PRODUCT:
                double product = num1 * num2 ;
                System.out.println("product "+ product);
                break;
            case DIV:
                double division = num1 / num2 ;
                System.out.println("Division "+ division);
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st Number:");
        double n1 = sc.nextDouble();
        System.out.println("2nd Number:");
        double n2 = sc.nextDouble();
        System.out.println("Choice:");
        String c=  sc.next();
        Switch sw = new Switch(n1,n2);
        sw.performOperation(Calc.valueOf(c));


    }
}
