import java.util.Arrays;
import java.util.Scanner;

public class station {

    public static int minimumPlatforms(int n, int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int platformsNeeded = 1; 
        int maxPlatforms = 1;

        int i = 1; 
        int j = 0; 

        while (i < n && j < n) {
            if (arrivals[i] <= departures[j]) {
                platformsNeeded++; 
                i++;
            } else {
                platformsNeeded--; 
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int[] arrivals = new int[n];
        int[] departures = new int[n];

        for (int i = 0; i < n; i++) {
            arrivals[i] = scanner.nextInt();
            departures[i] = arrivals[i] + scanner.nextInt();
        }

        int result = minimumPlatforms(n, arrivals, departures);
        System.out.println(result);

        scanner.close();
    }
}

