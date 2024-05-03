package Enum_examples.solution;
import Enum_examples.problem.Switch;
import java.util.Scanner;
enum Perform{

    ADD{
        public void result(int n1,int n2){
            System.out.println(n1+n2);
        }
    },
    SUB{
        public void result(int n1,int n2){
            System.out.println(n1-n2);
        }
    },
    DIV{
        public void result(int n1,int n2){
            System.out.println(n1/n2);
        }
    },
    MULTI{
        public void result(int n1,int n2){
            System.out.println(n1*n2);
        }
    };
    public abstract void result(int n1 , int n2);

}
public class Calculator {


        double num1,num2;
        Calculator(double num1 ,double num2){
            this.num1=num1;
            this.num2=num2;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1st Number:");
            int n1 = sc.nextInt();
            System.out.println("2nd Number:");
            int n2 = sc.nextInt();
            System.out.println("Choice:");
            String c=  sc.next();
            Calculator sw = new Calculator(n1,n2);
            Perform.ADD.result(n1,n2);

        }
    }

