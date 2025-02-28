import java.util.*;

class insertion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Values:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(a));

        s.close(); // Closing the scanner
    }
}
