package codingBat;

public class EndUp {
    public static String endUp(String str) {
        String newStr;
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            newStr = str.substring(0, str.length() - 3);
            return newStr += str.substring(str.length() - 3).toUpperCase();
        }
    }
}
