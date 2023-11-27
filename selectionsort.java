import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;

public class selectionsort {
    public static void  sort(int[] arr) {

        
        for (int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){ //3<10  4 1
                    index=j;
                }
                
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            
            
        }
    }
    public static void main(String[]args){
        
        Random rd= new Random();
        int arr[]=new int[6];
        System.out.println("Before Sorting :");
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100000000);
            System.err.print(arr[i]+" ");
        }
        long start=System.currentTimeMillis();
        // System.err.println("Before Sorting Current time :" +start);
        System.err.println();
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        long end =System.currentTimeMillis();
        System.err.println();
        // System.err.println("After Sorting Current Time "+end);
        System.err.println("Total time : "+(end-start)+" millisecond");
    }
}
