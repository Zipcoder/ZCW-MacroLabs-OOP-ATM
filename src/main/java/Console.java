import java.util.Scanner;

public class Console {
    Main main = new Main();
    BreakCheck breakCheck = new BreakCheck();
    Scanner userInput = new Scanner(System.in);

    public void greetingMessage(){
        System.out.println("Welcome to a real financial institution! \n");
    }

    // We will need a prompt to enter a PIN before anything else.
    // link to account object associated with pin in HashMap

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String customerPortal(/*String prompt*/) {
        System.out.println("Are you already an account holder at real financial institution?");
        System.out.println("1 - New Customer, 2 - Existing Customer, 3 - Exit");
        //getStringInput(prompt);
        String customerStatus = "";
        boolean invalidInput = true;
        while (invalidInput) {
            customerStatus = userInput.nextLine();
            switch (customerStatus) {
                case "1": {
                    main.newCustomer();
                    invalidInput = false;
                    break;
                }
                case "2": {
                    invalidInput = false;
                    break;
                }
                case "3": {
                    System.out.println("Good - Bye.");
                    System.exit(0);
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }
        return customerStatus;
    }


    //Simple user Interface
    public String chooseAccount() {
        System.out.println("Which account would you like to access?");
        String accountType = breakCheck.confirmIsNumber();
        System.out.println("You have chosen " + accountType);
        return accountType;
    }
// this will expand to include transfer and other method calls
    public String accountActions() {
        System.out.println("Would you like to deposit or withdraw funds?");
        System.out.println("1 - Deposit, 2 - Withdraw, 3 - Transfer, 4 - Go Back, 5 - Exit");

        String accountAction = "";
        boolean invalidInput = true;
        while (invalidInput) {
            accountAction = userInput.nextLine();
            switch (accountAction) {
                case "1": {
                    main.depositMade();
                    break;
                }
                case "2": {
                    main.withdrawMade();
                    break;
                }
                case "3": {
                    main.transferMade();
                    break;
                }
                case "4": {
                    chooseAccount();
                    break;
                }
                case "5": {
                    System.out.println("Good - Bye.");
                    System.exit(0);
                }
                default: {
                    System.out.println("Please choose from the menu.");
                    break;
                }
            }
        }
        return accountAction;
    }
}
