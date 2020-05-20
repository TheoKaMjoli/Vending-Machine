package vending;

public class OverloadedVendingMachine {
    private int softDrinkCount = 0;
    private int saltySnackCount = 0;
    private int chocolateCount = 0;
    private int productCount = 0;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.softDrinkCount = softDrinkQty;
        this.saltySnackCount = saltySnacksQty;
        this.chocolateCount = chocolatesQty;

    }

    public void buy(SoftDrink softDrink) {
        System.out.println("buy 1 Soft Drink");
        softDrinkCount--;
    }

    public void buy(SaltySnack saltySnack) {
        System.out.println("buy 1 Salty Snack");
        saltySnackCount--;
    }

    public void buy(Chocolate chocolate) {
        System.out.println("buy 1 Chocolate");
        chocolateCount--;
    }

    public void buy(Product product) {
        System.out.println("1 SoftDrink " + "1 SaltySnack " + "1 Chocolate");
        softDrinkCount--;
        saltySnackCount--;
        chocolateCount--;
    }

    public void addStock(SoftDrink softDrinks) {
        System.out.println("1 SoftDrink has been added to the stock");
        softDrinkCount++;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("1 SaltySnack has been added to the stock");
        saltySnackCount++;
    }

    public void addStock(Chocolate chocolate) {
        System.out.println("1 Chocolate has been added to the stock");
        chocolateCount++;
    }
    public void addStock(Product product){
        System.out.println("1 of Each Product has been added to the stock");
        softDrinkCount++;
        saltySnackCount++;
        chocolateCount++;
    }

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
    public void getStock(Product product){
        int counterSoft = softDrinkCount;
        int counterSalt = saltySnackCount;
        //System.out.println("The available stock for all products is: >> " + counterC );
    }
}


