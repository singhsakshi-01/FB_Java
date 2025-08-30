package Assignment1;

import java.util.Scanner;

public class SumofnNaturalno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer n:");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+ n +"natural numbers is: " + sum);
    }
}