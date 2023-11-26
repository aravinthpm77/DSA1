import java.util.*;
public class marathon {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();

        int[][] participants=new int[n][t+1];
        for(int i=0;i<n;i++){
            for (int j=0;j<=t;j++){
                participants[i][j] = sc.nextInt();
            }
        }

        int[] leadingcount=new int[n];

        for(int i=1;i<t;i+=2){
            int[] distancecoverd= new int[n];
            for(int j=0;i<n;j++){
                for(int k=0;k<=i;k++){
                    distancecoverd[j]=participants[j][k];
                } 
            }
            int[] topParticipants=findtopparticipants(distancecoverd);
            for (int participant : topParticipants) {
                leadingcount[participant - 1]++;
            }
            int winner = findWinner(leadingCount) + 1;
        }
    }
    private static int[] findtopparticipants(int[] distancecoverd){
        int topParticipants=0;
        for (int i=0;i<distancecoverd.length;i++){
            if (distancecoverd[i]>distancecoverd[topParticipants]){
                
            }
        }
        return new int[]{topParticipants+1};
    }
}
