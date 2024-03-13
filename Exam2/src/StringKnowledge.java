// Questions 1 and 2

import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String theFirstString = "";
        String theSecondString = "";
        String justAstring = "";

        System.out.println("Please enter the first string: ");
        theFirstString = in.nextLine();
        System.out.println("Please enter the second string: ");
        theSecondString = in.nextLine();

        System.out.println("Please enter a string: ");
        justAstring = in.nextLine();
        System.out.println(endOther(theFirstString, theSecondString));
        System.out.println("Does the string repeat? ");
        System.out.println(findRepeats(justAstring));
    }

    public static Boolean endOther(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();

        return a.endsWith(b) || b.endsWith(a);

    }

    public static Boolean findRepeats(String toTest) {
        toTest = toTest.toLowerCase();
        return ((toTest + toTest).indexOf(toTest, 1) != toTest.length());

    }


}