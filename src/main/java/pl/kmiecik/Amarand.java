package pl.kmiecik;

import java.util.Arrays;

public class Amarand {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAmarand(str1, str2));
    }

    private static boolean isAmarand(String str1, String str2) {
        if ((str1 == null) || (str2 == null)) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return new String(charArray1).equals(new String(charArray2));
    }


}
