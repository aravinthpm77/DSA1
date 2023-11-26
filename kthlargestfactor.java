import java.util.Scanner;

public class kthlargestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputs = new int[2]; // Assuming two input values (N and k)

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        int number = inputs[0];
        int k = inputs[1];

        int[] factors = new int[number]; // Array to store factors
        int index = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // Store the factor in the array
                
            }
            
        }

        if (k <= index) {
            System.out.println(factors[index - k]); // Output the kth largest factor
        } else {
            System.out.println(1);
        }
        
    }
    
}