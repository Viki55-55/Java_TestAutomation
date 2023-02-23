import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        int type;

    public MorseCode() {
            this.input = "";
            this.type = 0;
        }

        public String getInput() {
            return input;
        }

        public void setInput() {
            Scanner input = new Scanner(System.in);
            System.out.println("Zin");
            this.input = input.nextLine();
        }

        public int getType() {
            return type;
        }

        public void setType() {
            Scanner input = new Scanner(System.in);
            System.out.println("mors");
            this.type = input.nextInt();
        }
    }
}