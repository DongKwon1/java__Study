// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int []arr = new int[100];

        // An = An-1 + An-2; n>=3
        //a1 = 1. a2 = 1
        arr[1] = 1;
        arr[2] = 1;

        for (int i=3; i<100; i++){
            arr[i] = arr[i-1] + arr[i -2];
        }
    }
}