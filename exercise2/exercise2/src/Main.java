public class Main {
    static double multiply(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
    public static void main (String[] args) {
        double firstNum = Double.parseDouble(args[0]);
        double secondNum = Double.parseDouble(args[1]);
        System.out.println(multiply(firstNum, secondNum));
    }
}
