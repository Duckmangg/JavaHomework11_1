import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CartManager;
import ru.netology.domain.PurchaseItem;
public class CartManagerTest {
    PurchaseItem first = new PurchaseItem(0,1,"first");
    PurchaseItem second = new PurchaseItem(1,2,"second");
    PurchaseItem third = new PurchaseItem(2,3,"third");

    @Test
    public void myTest(){
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);

        PurchaseItem[] actual = repo.findAll();
        PurchaseItem[] expected = { first, second, third };
        Assertions.assertArrayEquals(expected, actual);
    }
}
