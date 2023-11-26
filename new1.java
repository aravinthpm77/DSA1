import java.util.Scanner;
public class new1{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        int flag =1;


        int ar[]= new int[26]; 
        for (int k=0;k<a.length();k++){
            int ind=(int)a.charAt(k)-97+1;
            ar[ind-1]++;
        }
        for(int i = 0; i < a.length(); i++)
        {
            int index = (int)a.charAt(i) - 97 + 1;

            if (ar[index - 1] != index)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
