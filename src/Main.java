import java.util.Scanner;

public class Main {

    String input, morse_code;
    public static void main(String[] args)
    {
    }
    //Change Main with:
    //Read text from user
    //Print result on the screen

       public String getInput()
    {
       Scanner scan= new Scanner(System.in);// read the sentence
       System.out.println("Enter your sentence to get Morse code for it: ");
       input = scan.nextLine();


    }
       public void PrintMorse()
    {
        System.out.println(morse_code); // print the code
    }
  }

