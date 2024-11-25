import java.util.Scanner;

public class Customer {
    String[] customerName = new String[5];
    public void inputCustomerData(){
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;

        for(int i = 0; i < customerName.length; i++) {
            do {
                System.out.println("Enter the first name of the customer: ");
                firstName = input.nextLine();
            } while (firstName.isEmpty() || firstName.equals(" "));
            do {
                System.out.println("Enter the last name of the customer: ");
                lastName = input.nextLine();
            } while (lastName.isEmpty() || lastName.equals(" "));
            customerName[i] = firstName + " " + lastName;
        }


        }

    public void displayCustomerData() {
        for (String str : customerName) {
            System.out.println(str);
        }
    }
}
