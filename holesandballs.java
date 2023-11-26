import java.util.Scanner;
public class holesandballs {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of H array : ");
        int size= sc.nextInt();
        int[] holes=new int[size];
        for(int i=0;i<size;i++){
            holes[i]=sc.nextInt();
        }
        System.out.println("Enter the value of B array : ");
        int size2= sc.nextInt();
        int[] balls=new int[size2];
        for(int i=0;i<size2;i++){
            balls[i]=sc.nextInt();
        }
        
        
        int[] position = new int[size2];
        int[] depth = new int[size];

        for (int i = 0; i < size2; i++) {
            depth[i] = i + 1;
        }



        for (int j=0 ;j<size2;j++){
            boolean flag=false;

            for (int k=size-1;k>=0;k--){
                if(holes[k]>balls[j]){
                    flag=true;
                }
                else{
                    flag=false;

                }
            }

            
        }
    }    

}


