/*
Question : Write a program to check armstrong number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conunt = 0,temp ,temp2,temp3,sum = 0;
        System.out.println("Enter the number to check armstrong :");
        int number = sc.nextInt();
        temp = number;
        while (number > 0){
            number = number / 10;
            conunt++;
        }
        while (temp > 0){
            temp2 = temp % 10;
            temp3 = 1;
            for (int i = 1; i <= conunt; i++)
                temp3 = temp3 * temp2;
                sum = sum + temp3;
              temp = temp / 10;
        }
        if (sum == number){
            System.out.println("Number is a armstrong number : " + sum);
        }else
            System.out.println("Number is not a armstrong number : " + sum);
    }
}