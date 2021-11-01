import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Initializing the variables needed
    System.out.println("How much has been paid?");
    float amountPaid = input.nextFloat();
    System.out.println("How many days have been defaulted?");
    byte daysDefaulted = input.nextByte();
    System.out.println("How much is to be paid each day?");
    float amountPerDay = input.nextFloat();

    // Declaration of variables to store the results
    float totalAmountToPay, amountLeftToPay;
    byte daysPaidFor, daysLeftToPay;

    // calculate the total amount the debtor has to pay
    totalAmountToPay = daysDefaulted * amountPerDay;
    System.out.println("The amount the debtor is to pay is " + totalAmountToPay);

  // calculate the days the debtor paid for based on the amount paid
    daysPaidFor = (byte) (amountPaid/amountPerDay);
    System.out.println("The days the debtor paid for is "+ daysPaidFor);
    
    int daysIncomplete = (int)(amountPaid % amountPerDay);
    // a check for a day with incomplete payment
    if (daysIncomplete > 0) {
      float amountRemaining = amountPerDay - daysIncomplete;
      System.out.println("The incomplete day is day " + ((int)amountPaid /(int) amountPerDay + 1) + ".\nThe amount to be paid that day is " + amountRemaining);
    } 
    else {
    System.out.println("No day was incompetely paid for");
    
  // calculate the amount the debtor is left to pay
    amountLeftToPay = totalAmountToPay - amountPaid;
    System.out.println("The amount the debtor is left to pay is "+ amountLeftToPay);

    // calculate the amount the debtor is left to pay
    daysLeftToPay = (byte) (daysDefaulted - daysPaidFor);
    System.out.println("The days the debtor is left to pay is "+ daysLeftToPay);
    
    
    }
  }
} 