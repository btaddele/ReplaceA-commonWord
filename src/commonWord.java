import java.util.Arrays;
import java.util.Scanner;

/*
* create string string array, string value
* import scanner for the user to enter a text
* if a user enters q close the loop
* if a users inter a word "the" change it to "BE"
* */

public class commonWord {
        public static void main(String[] args){
            String word;
            String array [];
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your text or 'q' to quit: ");
            word = sc.nextLine();

            while (!(word.equalsIgnoreCase("q"))){

                array = word.split(" ");

                for(int x = 0; x < array.length; x++){

                    if(array[x].equalsIgnoreCase("the")){
                        array[x] = "BE";
                    }
                }

                for (int x = 0; x < array.length; x++) {
                    System.out.print(array[x] + " ");
                }
                System.out.println();
                System.out.println("Enter Your text or 'q' to quit: ");
                word = sc.nextLine();
            }
        }
    }

