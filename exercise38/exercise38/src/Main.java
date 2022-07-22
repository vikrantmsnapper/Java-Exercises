
public class Main {
    String toCount;
    int alphabetCount;
    int numbersCount;
    int otherCount;
    int spaceCount;

    public Main(String input) {
        toCount = input;
        alphabetCount = 0;
        numbersCount = 0;
        otherCount = 0;
        spaceCount = 0;
    }

    public void countString() {
        char[] alphabetArr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
        char[] numbersArr = {'0', '1', '2', '3', '4', '5', '6','7','8', '9'};
        char[] charArr = toCount.toCharArray();

        for (char c : charArr) {
            if (new String(numbersArr).indexOf(c) != -1) {
                numbersCount++;
            } else if (new String(alphabetArr).indexOf(c) != -1) {
                alphabetCount++;
            } else if (c == ' ') {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
    }

    public static void main(String[] args) {
        String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        Main contains = new Main(string);
        contains.countString();
        
        System.out.println("Letters: " + contains.alphabetCount);
        System.out.println("Numbers: " + contains.numbersCount);
        System.out.println("Spaces: " + contains.spaceCount);
        System.out.println("Other: " + contains.otherCount);
    }
}
