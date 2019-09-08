import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Dog[] dogArray = new Dog[5];
        Cat[] catArray = new Cat[5];

        int dogInd = 0;
        int catInd = 0;


        boolean enlessLoop = true;

        while(enlessLoop) {
            Utils.options();
            char options = userInput.next().charAt(0);

            switch (options) {
                case 'a':

                    String dogName = userInput.next();
                    Dog dog1 = new Dog(dogName);
                    dogArray[dogInd] = dog1;
                    dogInd++;
                    break;
                case 'b':

                    String catName = userInput.next();
                    Cat cat1 = new Cat(catName);
                    catArray[catInd] = cat1;
                    catInd++;
                    break;
                case 'c':
                    System.out.println("List of Dogs");
                    for (int i = 0; i<dogInd; i++) {
                        System.out.println(dogArray[i]);
                    }
                    break;
                case 'd':
                    System.out.println("List of Cats");
                    for (int i = 0; i<catInd; i++){
                        System.out.println(catArray[i]);
                    }
                    break;
                case 'e':
                    enlessLoop = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Please input a character from the option list below");
            }

        }


















//        System.out.println("Enter a byte");
//
//        while (!userInput.hasNextByte()){
//            System.out.println("The value inputted wasn't a byte");
//            userInput.nextLine();
//        }
//        System.out.println("Your byte is " + userInput.nextByte());
//
//        System.out.println("Enter a short");
//
//        while (!userInput.hasNextShort()){
//            System.out.println("The value inputted wasn't a short");
//            userInput.nextLine();
//        }
//        System.out.println("Your short is " + userInput.nextShort());
//
//        System.out.println("Enter a char");
//
//        Pattern myPatt = Pattern.compile(".");
//        while (!userInput.hasNext(myPatt)){
//
//               System.out.println("The value inputted wasn't a char");
//           userInput.next();
//        }
//        System.out.println("Your char is " + userInput.next().charAt(0));

    }

    public static Double round(double input, int decimal) {

        String trim = "0.";

        for (int i = 0; i < decimal; i++) {

            trim += "0";

        }
        DecimalFormat df = new DecimalFormat(trim);


        return Double.parseDouble(df.format(input));

    }


}
