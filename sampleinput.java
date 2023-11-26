import java.util.Scanner;

public class sampleinput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[7];
        try{
            for (int i=2;i<=7;i++){
                a[1]=6;
                a[i]=a[i-1]+16+(a[i-1]-a[i-2]);
            }
        }
        catch(Exception e){
            System.err.println("Error "+e);
        }

        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
                System.err.println('*');
            }
            System.err.println('\n');
        }
        
    }
}
