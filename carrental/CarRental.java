import java.util.*;
import java.lang.String;

public class CarRental {
	
    public static void main(String[] args) {
        System.out.println("Welcome to the CarRental System");
        
        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<Car> carList = new ArrayList<Car>();
        ArrayList<Driver> driverList = new ArrayList<Driver>();
        
        User user1 = new User("Srujan","9876543210","srj123@gmail.com","pass123");
        User user2 = new User("Sagar","9876543210","sgr456@gmail.com","pass456");
        User user3 = new User("Omkar","9876543210","om789@gmail.com","pass789");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        
        Car car1 = new Car("mini","ritz","MH09-54321","white",9.00);
        Car car2 = new Car("mini","i10","MH04-76387","red",9.00);
        Car car3 = new Car("micro","indica","MH06-13485","white",11.00);
        Car car4 = new Car("micro","etios","MH05-92135","white",11.00);
        Car car5 = new Car("sedan","city","MH03-87438","black",15.00);
        Car car6 = new Car("sedan","dzire","MH03-87438","black",15.00);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        
        Driver driver1 = new Driver("Satish","6873452210","DL5473264",4.2);
        Driver driver2 = new Driver("Sameer","6873457230","DL5734687",4.5);
        Driver driver3 = new Driver("Pramod","6873458899","DL4327634",3.9);
        Driver driver4 = new Driver("Amit","6873432423","DL3463532",4.6);
        driverList.add(driver1);
        driverList.add(driver2);
        driverList.add(driver3);
        driverList.add(driver4);
       
        
        System.out.println("Press 1 for Login (or) Press 2 for Registration");
        Scanner sc = new Scanner(System.in);
        short choice = 1;
    	choice = sc.nextShort();
        while(choice!=0) {
                switch(choice)
                {
                        case 1: System.out.println("Login Menu");
                                System.out.println("Enter user ID : ");
                                String id = sc.next();
                                System.out.println("Enter password : ");
                                String password = sc.next();
                                int val = loginMethod(id,password,userList);
                                if(val==-1) {
                                	System.out.println("Invalid credentials, Try again!");
                                }
                                else {
                                	System.out.println("Login successful!");
                                }
                                booking(val,userList,carList,driverList);
                                choice = 0;
                                break;
                        case 2: System.out.println("Registration Menu");
		                        System.out.println("Enter name : ");
		                        String na = sc.next();
		                        System.out.println("Enter mobile-No : ");
		                        String con = sc.next();
		                        System.out.println("Enter email-Id : ");
		                        String emI = sc.next();
		                        System.out.println("Enter password : ");
		                        String pass = sc.next();
		                        registrationMethod(na,con,emI,pass,userList);
		                        choice = 1;
                                break;
                        default: System.out.println("Invalid Choice!");
                }
        }
        sc.close();
    }

	private static int loginMethod(String id, String password, ArrayList<User> userList) {
		int i;
        for(i=0;i<userList.size();++i)
        {
                if(userList.get(i).getUserName().equals(id))
                {
                        if(userList.get(i).getPassword().equals(password))
                                return i;
                        else return -1;
                }
        }
		return -1;
	}
	
	private static void registrationMethod(String na, String con, String emI, String pass, ArrayList<User> userList) {
		User user4 = new User(na,con,emI,pass);
		System.out.println("Registration successful!");
		System.out.println("Your user-id is : " + user4.getUserName());
		userList.add(user4);
	}
	
	private static void booking(int index, ArrayList<User> userList,ArrayList<Car> carList, ArrayList<Driver> driverList) {
		System.out.println("Enter pick-up location : ");
		Scanner sc = new Scanner(System.in);
		String pL = sc.next();	
		System.out.println("Enter drop-location : ");
		String dL = sc.next();
		System.out.println("Press 1 for intermediate stop or 2 for no stop : ");
		int choice = sc.nextInt();
		String via = "None";
		if(choice==1) {
			System.out.println("Enter intermediate location : ");
			via = sc.next();
		}
		System.out.println("Press 1 for mini or 2 for micro or 3 for sedan : ");
		choice = sc.nextInt();
		int i;
		String carDetails = "";
		String driverDetails = "";
		switch(choice) {
				case 1 : for(i=0;i<2;++i) 
					     	if(carList.get(i).isCarStatus()==false) 
					     		carDetails = carList.get(i).getData();
					     
				case 2 : for(i=2;i<4;++i) 
					     	if(carList.get(i).isCarStatus()==false) 
					     		carDetails = carList.get(i).getData();	 
					     
				case 3 : for(i=4;i<6;++i) 
					     	if(carList.get(i).isCarStatus()==false) 
					     		carDetails = carList.get(i).getData();						
		}
		
		if(carDetails=="")
	    	 System.out.println("No cars available at the moment!");
		else {
			for(i=0;i<driverList.size();++i) 
		    	 if(driverList.get(i).isStatus()==false)
		    		 driverDetails = driverList.get(i).getData();
		     if(driverDetails=="") 
		    	 System.out.println("No drivers available at the moment!");
		     else {
		    	 System.out.println("Your ride details : ");
		    	 System.out.println("Going from : " + pL);
		    	 System.out.println("Going to : " + dL);
		    	 if(via!="None") 
		    		 System.out.println("Via : " + via);
		    	 System.out.println("Car : " + carDetails);
		    	 System.out.println("Driver : " + driverDetails);
		    	 System.out.println("Press 1 to confirm booking or 2 to cancel : ");
		    	 choice = sc.nextInt();
		    	 sc.close();
		    	 if(choice==1) 
		    		 System.out.println("Booking confirmed and details sent to " + userList.get(index).getEmailId());
		    	 else 
		    		 System.out.println("Booking cancelled!");						    	 
		     } 
		}
	}
}
