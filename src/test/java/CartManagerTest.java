import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CartManager;
import ru.netology.domain.PurchasedItem;

public class CartManagerTest {
    PurchasedItem first = new PurchasedItem(0, 1, "first");
    PurchasedItem second = new PurchasedItem(1, 2, "second");
    PurchasedItem third = new PurchasedItem(2, 3, "third");
    PurchasedItem fourth = new PurchasedItem(3, 4, "fourth");
    PurchasedItem fifth = new PurchasedItem(4, 5, "fifth");
    PurchasedItem sixth = new PurchasedItem(5, 6, "sixth");
    PurchasedItem seventh = new PurchasedItem(6, 7, "seventh");
    PurchasedItem eighth = new PurchasedItem(7, 8, "eighth");
    PurchasedItem ninth = new PurchasedItem(8, 9, "ninth");
    PurchasedItem tenth = new PurchasedItem(9, 10, "tenth");
    PurchasedItem eleventh = new PurchasedItem(10, 11, "eleventh");
    PurchasedItem twelfth = new PurchasedItem(11, 12, "twelfth");

    @Test
    public void findAll12Test() {
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);
        repo.add(eleventh);
        repo.add(twelfth);

        PurchasedItem[] actual = repo.findAll();
        PurchasedItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll5Test() {
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);


        PurchasedItem[] actual = repo.findAll();
        PurchasedItem[] expected = {first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);
        repo.add(eleventh);
        repo.add(twelfth);

        PurchasedItem[] actual = repo.findLast();
        PurchasedItem[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5Test() {
        CartManager repo = new CartManager(5);
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);
        repo.add(eleventh);
        repo.add(twelfth);

        PurchasedItem[] actual = repo.findLast();
        PurchasedItem[] expected = {twelfth, eleventh, tenth, ninth, eighth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast7Test() {
        CartManager repo = new CartManager(10);
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);


        PurchasedItem[] actual = repo.findLast();
        PurchasedItem[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast6Test() {
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);


        PurchasedItem[] actual = repo.findLast();
        PurchasedItem[] expected = {sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
}
