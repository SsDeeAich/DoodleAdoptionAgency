import java.util.Scanner;

import models.Dood;
import models.Agency;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Dood[] doods = new Dood[] {
            new Dood("Pixel", 29.99, 0, "Black", "Mini", 2022), 
            new Dood ("Jamie", 49.98, 1, "Brown", "Large", 2020), 
            new Dood ("Cypress", 65.78, 1, "Golden", "Mini", 2018)
        };
        

        Agency agency = new Agency(doods);

        System.out.println("\t************************************************");
        System.out.println("\t     WELCOME TO THE DOODLE ADOPTION AGENCY!          ");
        System.out.println("\t************************************************");
        
        while (true) {
            System.out.println(agency);
            if (agency.isEmpty()) {
                System.out.println("Every fren has been adopted!");
                break;
            }
            
            System.out.print("Enter the kennel number of the forever fren you want to adopt: "); 
            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("INVALID INPUT.");
                continue;
            }
            int spot = scan.nextInt();
            
            scan.nextLine();
            if (spot < 0 || spot > agency.getLength() - 1) {
                System.out.println("INVALID INDEX.");
                continue;
            } else if (agency.getDood(spot) == null) {
                System.out.println("EMPTY KENNEL.");
                continue;
            }
            agency.adoption(spot);    
            System.out.print("Type 'yes' to continue adopting: ");
            if (!scan.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

       scan.close();

    }
}
