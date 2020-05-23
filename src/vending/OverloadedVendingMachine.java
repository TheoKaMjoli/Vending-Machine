package vending;
import java.util.Scanner;

public class OverloadedVendingMachine {
    private int softDrinkCount = 0;
    private int saltySnackCount = 0;
    public int chocolateCount = 0;
    private int productCount = 0;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.softDrinkCount = softDrinkQty;
        this.saltySnackCount = saltySnacksQty;
        this.chocolateCount = chocolatesQty;

    }

    public void buy(SoftDrink softDrink) {
        System.out.println("1 Soft Drink coming up");
        this.softDrinkCount--;
    }

    public void buy(SaltySnack saltySnack) {
        System.out.println("1 Salty Snack coming up");
        this.saltySnackCount--;
    }

    public void buy(Chocolate chocolate) {
        System.out.println("1 chocolate coming up");
        this.chocolateCount--;
    }

    public void buy(Product product) {
        System.out.println("1 SoftDrink /n" + "1 SaltySnack /n" + "1 Chocolate");
        this.softDrinkCount--;
        this.saltySnackCount--;
        this.chocolateCount--;
    }
    /********************************** addStock *******************************************/
    public void addStock(SoftDrink softDrinks) {
        System.out.println("1 Soft Drink has been added to the stock");
        this.softDrinkCount++;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("1 Salty Snack has been added to the stock");
        this.saltySnackCount++;
    }

    public void addStock(Chocolate chocolate) {
        System.out.println("1 Chocolate has been added to the stock");
        this.chocolateCount++;
    }
    public void addStock(Product product){
        System.out.println("1 Soft Drink added to the Stock");
        System.out.println("1 Salty Snack added to the Stock");
        System.out.println("1 Chocolate added to the Stock");
        this.softDrinkCount++;
        this.saltySnackCount++;
        this.chocolateCount++;
    }
    /******************************* getStock ***********************************************************************/
    public void getStock(Chocolate chocolate){
        int counterC = chocolateCount;
        System.out.println("The available stock for chocolate is: >> " + counterC);
    }
    public void getStock(SaltySnack saltySnack){
       int counterC = saltySnackCount;
        System.out.println("The available stock for chocolate is: >> " + counterC);
    }
    public void getStock(SoftDrink softDrink){
        int counterC = softDrinkCount;
        System.out.println("The available stock for chocolate is: >> " + counterC);
    }
    public void getStock(Product product, int i){

        System.out.println("The available stock for all products is: ");
        System.out.println("Available Stock for SoftDrink >> " + this.softDrinkCount);
        System.out.println("Available Stock for SaltySnacks >> " + this.saltySnackCount);
        System.out.println("Available Stock for Chocolate >> " + this.chocolateCount);
    }
    public void buyInQty(int quantity, SoftDrink softDrink){

       // int stockCount = getStock(softDrinkCount) - quantity;
        System.out.println("#" + quantity + "Soft Drink/s coming!!!");
    }

    /*public void buyOpt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of Soft Drinks ordered >> ");
       int quantity = input.nextInt();
       int stock = softDrinkCount - quantity; //I want to deduct the quantity entered, from the available stock.
        System.out.println("#" + quantity + " Soft Drink/s, Coming Up, Enjoy!");
    }*/

}


