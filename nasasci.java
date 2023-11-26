import java.util.*;
public class nasasci {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t1,t2,m;
        try{
            t1=sc.nextInt();
            t2=sc.nextInt();
            m=sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
            return;
        }
        MathewJohnnumber(t1,t2,m);
    }
    public  static boolean isperfertSquare(int num){
        int sqrt=(int)Math.sqrt(num);
        return sqrt*sqrt==num;
    }

    public static void MathewJohnnumber(int t1,int t2,int m){   
        if(t1<=0 || t1>=t2|| m<=0){
            System.out.println("Invalid Input");
            return;
        }
        int count=0;
        int n=1;
        while(count<m){
            int mathewnumber=n*((2*n)-1);
            int johnnumber=n*(n+1)/2;

            if (t1<=mathewnumber && mathewnumber<=t2 && isperfertSquare(8*johnnumber+1)){
                count++;
                if(count==m){
                    System.out.println(mathewnumber);
                    return ;
                }
            }
        }
    }

}
