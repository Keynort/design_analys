import java.util.Scanner;

class Task_4 {
    static boolean findPair(int arr[],int n) {
        int size = arr.length;
        int i = 0, j = 1;
        while (i < size && j < size) {
            if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)) {
                System.out.print("Pair Found: "+
                        "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
        System.out.print("No such pair");
        return false;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int m = in.nextInt();
        findPair(arr,m);
    }
}
