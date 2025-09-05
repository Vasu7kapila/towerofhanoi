import java.util.*;

public class vasu {
    public static void towerofhanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println(" TRANSFER disk " + n + " FROM " + source + " TO " + destination);
            return;
        }
        towerofhanoi(n - 1, source, destination, helper);
        System.out.println(" TRANSFER disk " + n + " FROM " + source + " TO " + destination);
        towerofhanoi(n - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofhanoi(n, "A", "B", "C");
        sc.close();
    }
}