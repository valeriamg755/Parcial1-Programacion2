import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to your contact agenda!");

        switch (args.length) {
            case 1:
                System.out.println("Add a new contact");

            case 2:
                System.out.println("List of contacts for category");

            case 3:
                System.out.println("Count of contacts for category");

            case 4:
                System.out.println("List of contacts for category. In this case, only the name and the number " +
                        "will appear");
        }

        

    }

}
