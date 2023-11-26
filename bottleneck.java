import java.util.*;
public class bottleneck {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] a =new int[n];
        for (int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        
        for (int i=0;i<n-1;i++){
            
            if (a[i]!=a[i+1]){  
                if(a[i]<a[i+1]){
                    a[i]=0;
                    
                }

            }
            else{
                int j=i;
                while(j<n-1 && (a[j]==a[i+1])){
                    j++;
                    
                }
                if (j<n-1 && a[i]<a[j+1]) {
                    a[i] = 0;
                }
            }
        
            
            
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    
    }
}
