import java.util.ArrayList;
import java.util.Scanner;

public class marriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] b = sc.next().toCharArray();
        char[] g = sc.next().toCharArray();
        int count = 0;
        ArrayList<Character> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < g.length; j++) {
                if (b[i] == g[j]) {
                    count++;
                    for (int k = 0; k <= j; k++) {
                        g[k] = ' ';
                    
                    }

                    break;
                } else {
                    lst.add(g[j]);
                }
            }
            print
            if (count == 0) {
                break;
            } else {
                g = new char[lst.size()];
                for (int k = 0; k < lst.size(); k++) {
                    g[k] = lst.get(k);
                    g[k]=lst.get(k+1);
                }
                lst.clear();
                count = 0;
            }
        }

        System.out.println(g.length);
    }
}
