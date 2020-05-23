import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;
import vending.*;

import javax.xml.bind.SchemaOutputResolver;

public class Display {
    public static void main(String[] args){
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(56,70,90);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buyInQty(50, softDrink);
        overloadedVendingMachine.getStock(softDrink);
        overloadedVendingMachine.buyInQty(50, softDrink);
    }
}
