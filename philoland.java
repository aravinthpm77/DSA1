import java.io.*;
import java.util.Scanner;
class philoland{


    static int findMinDenomin(int n) {
        return ((int)(Math.log(n)/Math.log(2))+1);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(findMinDenomin(n));
    }
}