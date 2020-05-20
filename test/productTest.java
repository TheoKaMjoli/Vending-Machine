
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
            softDrinks.description();
            assertEquals("This is a SoftDrink", softDrinks.description());
        }

        @Test
        void chocolateTest(){
            Chocolate chocolate = new Chocolate();
            chocolate.description();
            assertEquals("This is a Chocolate", chocolate.description());
        }
        /*@Test
        void overloadedVendingMachine(){
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine();
            Product product = new Product();
            SoftDrink softDrinks = new SoftDrink();
            SaltySnack saltySnack = new SaltySnack();
            Chocolate chocolate = new Chocolate();

            overloadedVendingMachine.buy(saltySnack);
            assertEquals("buy 1 Salty Snack", overloadedVendingMachine.buy(chocolate));
        }*/
        @Test
        void saltySnacksTest(){
            SaltySnack saltySnack = new SaltySnack();
            saltySnack.description();
            assertEquals("This is a SaltySnack", saltySnack.description());
        }

    }
