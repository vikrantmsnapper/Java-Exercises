import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numArr = new int[3];
        for (int i = 0; i < args.length; i++) {
            numArr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
