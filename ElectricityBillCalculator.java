import java.util.Scanner;

public class ElectricityBillCalculator 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        // Input electricity units consumed
        System.out.print("Enter the electricity units consumed: ");
        int units = scanner.nextInt();

        double billAmount = 0;

        // Calculate bill based on units
        if (units <= 50)
 {
            billAmount = units * 0.50;
        } 
else if (units <= 150)
 {
            billAmount = 50 * 0.50 + (units - 50) * 0.75;
        }
 else if (units <= 250)
 {
            billAmount = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        }
 else 
{
            billAmount = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        // Adding surcharge of 20%
        double surcharge = billAmount * 0.20;
        double totalBill = billAmount + surcharge;

        // Display the total bill
        System.out.printf("Total Electricity Bill: Rs. %.2f%n", totalBill);
        
        scanner.close();
    }
}
