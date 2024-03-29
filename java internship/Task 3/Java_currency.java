import java.util.Scanner;
public class CurrencyConverter {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Define exchange rates (simplified)
 double usdToEurRate = 0.85;
 double usdToGbpRate = 0.73;
 System.out.println("Welcome to the Currency Converter!");
 System.out.print("Enter the amount in USD: ");
 double amountInUSD = scanner.nextDouble();
 System.out.println("Choose the target currency:");
 System.out.println("1. EUR");
 System.out.println("2. GBP");
 System.out.print("Enter the number for your choice: ");
 int choice = scanner.nextInt();
 double convertedAmount = 0.0;
 String targetCurrency = "";
 if (choice == 1) {
 convertedAmount = amountInUSD * usdToEurRate;
 targetCurrency = "EUR";
 } else if (choice == 2) {
 convertedAmount = amountInUSD * usdToGbpRate;
 targetCurrency = "GBP";
 } else {
 System.out.println("Invalid choice");
 return;
 }
 System.out.println(amountInUSD + " USD is equivalent to " + convertedAmount + " " +
targetCurrency);
 }
}
