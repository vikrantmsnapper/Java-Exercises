
import ASCIIArtGenerator.ASCIIArtGenerator;

public class Main {
    public static void main(String[] args) throws Exception {
        java.util.Date date = new java.util.Date();
        String[] dateArr = {String.valueOf(date)};

        ASCIIArtGenerator.main(dateArr);
    }
}