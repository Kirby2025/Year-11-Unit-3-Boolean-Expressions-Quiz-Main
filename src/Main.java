public class Main {

    public static void main(String[] args) {
        System.out.println(calculateGrade(90));
        System.out.println(fizzBuzz(5));
        System.out.println(frontBack("helloolleh"));
        System.out.println(twoAsOne(1,3,4));
        System.out.println(endUp("horray"));
    }
    // Question 1 - calculateGrade

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int fizz) {
        if (fizz % 3 == 0 && fizz % 5 == 0) {
            return "fizzbuzz";
        }
        if (fizz % 3 == 0) {
            return "fizz";
        } else if (fizz % 5 == 0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars + str + firstTwoChars;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a+b==c||a+c==b||b+c==a){
            return true;
        }
        return false;
    }


    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int lastThree = str.length() - 3;
        String firstPart = str.substring(0, lastThree);
        String lastPart = str.substring(lastThree);
        return firstPart + lastPart.toUpperCase();
    }
    }


