import java.util.*;
public class add{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);//used to take the input
        
        System.out.println("Enter the first number:");
        int x = scn.nextInt(); //reads the input
        
        System.out.println("Enter the second number:");
        int y = scn.nextInt(); //reads the input
        
        int sum = x + y; //add the two numbers
        System.out.println("Sum is " + sum);
    }
}