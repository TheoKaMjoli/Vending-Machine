
import org.junit.jupiter.api.Test;
import vending.Chocolate;
import vending.Product;
import vending.SoftDrinks;

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
            SoftDrinks softDrinks = new SoftDrinks();
            softDrinks.description();
            assertEquals("This is a soft drink", softDrinks.description());
        }

        @Test
        void ChocolateTest() {
            Chocolate chocolate = new Chocolate();
            chocolate.description();
            assertEquals("This is a chocolate", chocolate.description());
        }
    }
