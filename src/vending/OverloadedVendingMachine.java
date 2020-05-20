package vending;

public class OverloadedVendingMachine {
    private int softDrinkCount = 0;
    private int saltySnackCount = 0;
    private int chocolateCount = 0;
    private int productCount = 0;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        softDrinkCount = softDrinkQty;
        saltySnackCount = saltySnacksQty;
        chocolateCount = chocolatesQty;

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
        softDrinkCount++;
    }

    void addStock(SaltySnack saltySnack) {
        saltySnackCount++;
    }

    void addStock(Chocolate chocolate) {
        chocolateCount++;
    }
}


