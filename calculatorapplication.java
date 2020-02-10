package helloword;
import java.util.Scanner; 
import java.text.NumberFormat; 
public class calculatorapplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calc 1.0!");
        System.out.println("This is the main menu");
        System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide ");
        int choice = input.nextInt();
        switch (choice){
        case 1:
            addition();
            break;
        case 2:
            substraction();
            break;
        case 3:
            multiplication();
            break;
        case 4:
            divide();
            break;
        case 5:
        	System.out.println("please enter accordind to menu");
        	break;
            }
        }
    static void addition(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a + b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void substraction() {
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a - b;
        System.out.println ("The total value is " + c);
        return;
    }

    static void multiplication(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a * b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void divide(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a / b;
        System.out.println ("The total value is " + c);
        return;
    }
}
