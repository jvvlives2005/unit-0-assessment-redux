package nyc.c4q;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main (String args[]) {
        // Use main to test your methods
        //print();
        //System.out.println(returnPrimitiveInt55Plus44());
        //System.out.println(returnPrimitiveCharASCII35());
        //System.out.println(isMultipleOfX(35, 7));
        //System.out.println(returnSumOfOddNumbersBetween1And100());
        //System.out.println(returnSumOfTheFirst200MultiplesOf3());
        System.out.println(alternateS1AndS2Xtimes("abra", "cadabra", 2));

    }

    public static void print() {
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }

    public static boolean returnPrimitiveBooleanFalse() {
        return false;
    }

    public static int returnPrimitiveInt55Plus44() {
        return 55 + 44;
    }

    public static double returnPrimitiveDouble2Point718() {
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return 2.718;
    }

    public static char returnPrimitiveCharASCII35() {
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return (char) 35;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isMultipleOfX(int n, int x) {
        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0

        return n % x == 0;
    }

    public static int returnSumOfOddNumbersBetween1And100() {
        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]

        int sum = 0;                           //initialize and declare the variable
        for (int i = 1; i < 100; i++) {        //gives the count from 1 to 100
            if ( (i % 2) != 0 )                //if the number is odd (not not divisible by 2)
                sum += i;                      //then add
        }

        return sum;                            //return the sum of the odd numbers
    }

    public static int returnSumOfTheFirst200MultiplesOf3() {
        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]

        int sum = 0;
        for (int i = 1; i < 600; i++) {       //the reason for 600 is because 3 * 200 = 600
            if (i % 3 == 0)                   //if the number is multiples of 3
                sum += i;                     //then add it
        }

      return sum;                             //return the sum of the 1st 200 multiples of 3
    }

    public static boolean isEmptyString(String str) {
        return str == "";
    }

    public static String alternateS1AndS2Xtimes(String s1, String s2, int x) {
        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        String words = "";
        for (int i = 0; i <= x; i++){
            if (x == 0 || i < x)
                return "";
            else
                words = s1 + s2;
            }
        return words;

    }

    public static String stringSplit(String s, String splitOn) {
        // Given string s, return a string that stops at the first occurrence of "split".
        // For example:
        //      stringSplit("ubiquitous", "q").equals("ubi") == true
        //      stringSplit("hellogoodbye", "good").equals("hello") == true
        //      stringSplit("fancy seeing you", "there").equals("") == true
        // If the string does not contain split, then return the empty string "".

        return "";
    }

    public static Singer returnBeyonce() {
      // should return an instance of Singer with the name "Beyonce" and location "USA"
        Singer beyonce = new Singer("Beyonce", "USA");
      return beyonce;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {
      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
      //      Singer queenB = new Singer("Beyonce", "USA");
      //      Singer rihanna = new Singer("Rihanna", "Barbados");
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados"
        return (s1.getName(), s2.getLocation());
    }

    public static HashMap<String, Singer> returnSingers() {
        // should return a HashMap of the following singers:
        //      key="Beyonce",  Singer(name="Beyonce", location="USA")
        //      key="Jay-Z",    Singer(name="Jay-Z",   location="USA")
        //      key="Bieber",   Singer(name="Bieber",  location="Canada")
        //      key="Drake",    Singer(name="Drake",   location="Canada")
        //      key="Jepsen",   Singer(name="Jepsen",  location="Canada")

        //Create Hash Map
        HashMap<String,Singer> singers = new HashMap<String, Singer>();

        //Declare the singers
        Singer beyonce = new Singer("Beyonce", "USA");
        Singer jayz = new Singer("Jay-Z", "USA");
        Singer bieber = new Singer("Bieber", "Canada");
        Singer drake = new Singer("Drake", "Canada");
        Singer jespen = new Singer("Jespen", "Canada");

        //put them in the Hash Map
        singers.put("Beyonce", beyonce);
        singers.put("Jay-Z", jayz);
        singers.put("Bieber", bieber);
        singers.put("Drake", drake);
        singers.put("Jespen", jespen);

        return singers;
    }

    public static boolean isFromCanada(Singer person) {
        HashMap<String,Singer> singers = new HashMap<String, Singer>();

        return singers.containsValue("Canada");
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")

        //It has to do with the singer.set or people.set...had not much time to finish...WAH!!!!

    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){
        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

    }

    // Bonus Problems (NOT COMPLETED)
//    public static void readFileAndOnlyPrintCanadianCelebrities() {
//        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
//        // https://commons.apache.org/proper/commons-csv/
//      try {
//        FileReader fr = new FileReader("celebrities.csv");
//      } catch (FileNotFoundException e) {
//        e.printStackTrace();
//      }
//    }
//
//    public static void readFileAndPrintCelebrityAges(){
//        // TODO similar as above
//    }
}
