
import org.junit.jupiter.api.Test;
import vending.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
    public class productTest {
        @Test
        void canProductWork() {
            Product product = new Product();
            product.description();
            assertEquals("This is a product", product.description());
        }

        @Test
        void softDrinkTest() {
            SoftDrink softDrink = new SoftDrink();
            Product product = new Product();
            softDrink.description();
            assertEquals("This is a SoftDrink", softDrink.description());
        }

        @Test
        void chocolateTest() {
            Chocolate chocolate = new Chocolate();
            chocolate.description();
            assertEquals("This is a Chocolate", chocolate.description());
        }

        @Test
        void saltySnacksTest() {
            SaltySnack saltySnack = new SaltySnack();
            saltySnack.description();
            assertEquals("This is a SaltySnack", saltySnack.description());
        }

        @Test
        public void mustOverloadedVendingMachine() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(6, 5, 100);
            Chocolate chocolate = new Chocolate();
            overloadedVendingMachine.buy(chocolate);
            overloadedVendingMachine.addStock(chocolate);
            overloadedVendingMachine.getStock(chocolate); 
            assertEquals(100, overloadedVendingMachine.chocolateCount);

        }
    }
