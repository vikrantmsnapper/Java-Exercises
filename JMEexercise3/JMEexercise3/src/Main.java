import javax.swing.text.AttributeSet;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

/*
  Write a Java method to display the middle character of a string.
  Note:
   a) If the length of the string is odd there will be two middle characters.
   b) If the length of the string is even there will be one middle character.
*/

public class Main {

String newString;

    public Main(String string) {
        newString = string;
    }

    public void whereIsIt() {
        char[] charArr = newString.toCharArray();
        double length = newString.length();
        if (length % 2 == 1) {
            System.out.println(charArr[charArr.length / 2] + " & " +  charArr[charArr.length / 2 + 1]);
        } else {
            System.out.println(charArr[charArr.length / 2]);
        }
    }

    public static void main(String[] args) {
        Main findIt = new Main("3023422");
        findIt.whereIsIt();
    }
}
