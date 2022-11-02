import java.util.Scanner;

/*
public class Runner
{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = myScanner.nextInt();

        if ((num >= -50) && (num <= 50)) {
            System.out.println("Your number is between -50 and 50");
        } else if ((num < -100) || (num > 100)) {
            System.out.println("Your number is more then 100 away from 0!");
        } else {
            System.out.println("Something else");
        }

        myScanner.close();
    }

}
*/
public class Runner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = myScanner.nextLine();
        String first = word.substring(0, 1);  // get first letter

        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
            System.out.println("Your word begins with a vowel");
        } else {
            System.out.println("Your word begins with a consonant");
        }

        myScanner.close();
    }
}

