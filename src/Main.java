import java.util.Scanner;

public class Main {
    public static void bubblesort(int[] sortArr){
        for (int i=0;i<sortArr.length-1;i++){
            for (int j=0;j<sortArr.length-i-1;j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] sortArr = new int[N];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = in.nextInt();
        }
        bubblesort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
                System.out.println(sortArr[i]);
        }
    }
}
