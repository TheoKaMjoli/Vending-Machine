import vending.*;

import javax.xml.bind.SchemaOutputResolver;

public class Display {
    public static void main(String[] args){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(56,70,90);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.getStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.getStock(chocolate);
    }
}
