public class Main {

    public static void main (String[] args) {
        double firstNum = Double.parseDouble(args[0]);

        for (int i = 0; i <= 10; i++) {
            System.out.println(firstNum + " x " + i + " = " + firstNum * i);
        }
    }
}
