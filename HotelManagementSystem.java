import java.util.Scanner; public class HotelManagementSystem { public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("==============================================");
	System.out.println("	WELCOME TO GRAND HOTEL");
System.out.println("==============================================");
// Menu display
	System.out.println("Menu Card:");
	System.out.println("1. Veg Thali	- Rs.150");
	System.out.println("2. Non-Veg Thali	- Rs.200");
	System.out.println("3. Paneer Tikka	- Rs.180");
	System.out.println("4. Chicken Biryani - Rs.250");
	System.out.println("5. Ice Cream	- Rs.100");
	System.out.println("6. Generate Bill & Exit");
	
	System.out.println("==============================================");
	double totalBill = 0; int choice;
	do {
	System.out.print("\nEnter your choice (1-6): "); choice = sc.nextInt();
	switch (choice) {	
	case 1:
	System.out.print("Enter quantity: "); int qty1 = sc.nextInt(); totalBill += qty1 * 150;
	System.out.println("Added Veg Thali x" + qty1); break;
	case 2:
	System.out.print("Enter quantity: "); int qty2 = sc.nextInt(); totalBill += qty2 * 200;
	System.out.println("Added Non-Veg Thali x" + qty2);
	break;
	case 3:
	System.out.print("Enter quantity: "); int qty3 = sc.nextInt(); totalBill += qty3 * 180;
	System.out.println("Added Paneer Tikka x" + qty3); break;
	case 4:
	System.out.print("Enter quantity: "); int qty4 = sc.nextInt(); totalBill += qty4 * 250;
	System.out.println("Added Chicken Biryani x" + qty4); break;
	case 5:
	System.out.print("Enter quantity: "); int qty5 = sc.nextInt(); totalBill += qty5 * 100;
	System.out.println("Added Ice Cream x" + qty5); break;
	case 6:
	System.out.println("\nGenerating Bill...");
	System.out.println("------------------------------------------------");
	System.out.println("Total Bill Amount: Rs." + totalBill);
	System.out.println("Thank you for visiting GRAND HOTEL!");
	System.out.println("------------------------------------------------"); 
	break;
	default:
	System.out.println("Invalid choice! Please try again.");
	}
	} while (choice != 6);
	sc.close();
	}
	}

 
