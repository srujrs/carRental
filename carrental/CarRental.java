import java.util.*;
import java.lang.String;

public class CarRental {
    public static void main(String[] args) {
        System.out.println("Welcome to the CarRental System");
        System.out.println("Press 1 for Login (or) Press 2 for Registration");
        Scanner sc = new Scanner(System.in);
        short choice;
        choice = sc.nextShort();
        while(choice != 1 || choice != 2)
                switch(choice)
                {
                        case 1: System.out.println("Login Menu");
                                System.out.println("Enter user ID : ");
                                String id = sc.next();
                                System.out.println("Enter password : ");
                                String password = sc.next();

                                break;
                        case 2: System.out.println("Registration Menu");
                        		User u = new User();
                        		System.out.println("Enter name : ");
                        		String name = sc.next();
                        		System.out.println("Enter email-Id : ");
                        		String email = sc.next();
                        		System.out.println("Enter mobile-No : ");
                        		String mobNo = sc.next();
                        		u.setUser(name,mobNo,email);
                        		System.out.println(u.getName());
                                break;
                        default: System.out.println("Invalid Choice!");
                }

    }
}
