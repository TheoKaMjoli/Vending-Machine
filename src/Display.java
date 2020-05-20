import vending.*;

public class Display {
    public static void main(String[] args){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(50,60,80);
        Product product = new Product();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);
        OverloadedVendingMachine overloadedVendingMachine1 = new OverloadedVendingMachine(32,65,95);



    }
}
