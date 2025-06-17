//package basics;
import java.util.Scanner;

public class arrayExample {
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);

    int[] myArray = {1,2,3,4,5};
    int[] anotherArray = new int[10];
    String[] gender = {"male","female"};
    
    for (int i = 0; i < anotherArray.length; i++) {
        System.out.println("insert item at "+i);
        anotherArray[i] = input.nextInt();
    }
    for  (int i = 0; i < anotherArray.length; i++) {
        System.out.println("item at "+ i+ "is" + anotherArray[i]);

    }
    int sum = 0;
    for  (int i = 0; i < anotherArray.length; i++) {
        sum += anotherArray[i];}
        System.out.println(sum);
    }}