
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
            SoftDrink softDrinks = new SoftDrink();
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(50,60,70);
            overloadedVendingMachine.buy(softDrinks);
            assertEquals("This is a SoftDrink", overloadedVendingMachine.buy(softDrinks));
        }

        @Test
        void chocolateTest(){
            Chocolate chocolate = new Chocolate();
            chocolate.description();
            assertEquals("This is a Chocolate", chocolate.description());
        }
       /* @Test
        void overloadedVendingMachine(){
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(6,5,3);

            assertEquals("buy 1 Salty Snack", overloadedVendingMachine.buy(chocolate));
        }*/
        @Test
        void saltySnacksTest(){
            SaltySnack saltySnack = new SaltySnack();
            saltySnack.description();
            assertEquals("This is a SaltySnack", saltySnack.description());
        }

    }
