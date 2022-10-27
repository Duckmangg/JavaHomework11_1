import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CartManager;
import ru.netology.domain.PurchaseItem;
public class CartManagerTest {
    PurchaseItem first = new PurchaseItem(0,1,"first");
    PurchaseItem second = new PurchaseItem(1,2,"second");
    PurchaseItem third = new PurchaseItem(2,3,"third");
    PurchaseItem fourth = new PurchaseItem(3,4,"fourth");
    PurchaseItem fifth = new PurchaseItem(4,5,"fifth");
    PurchaseItem sixth = new PurchaseItem(5,6,"sixth");
    PurchaseItem seventh = new PurchaseItem(6,7,"seventh");
    PurchaseItem eighth = new PurchaseItem(7,8,"eighth");
    PurchaseItem ninth = new PurchaseItem(8,9,"ninth");
    PurchaseItem tenth = new PurchaseItem(9,10,"tenth");
    PurchaseItem eleventh = new PurchaseItem(10,11,"eleventh");
    PurchaseItem twelfth = new PurchaseItem(11,12,"twelfth");

    @Test
    public void findAll12Test(){
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

        PurchaseItem[] actual = repo.findAll();
        PurchaseItem[] expected = { first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAll5Test(){
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);


        PurchaseItem[] actual = repo.findAll();
        PurchaseItem[] expected = { first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest(){
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

        PurchaseItem[] actual = repo.findLast();
        PurchaseItem[] expected = { twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast5Test(){
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

        PurchaseItem[] actual = repo.findLast(5);
        PurchaseItem[] expected = { twelfth, eleventh, tenth, ninth, eighth };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast7Test(){
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);


        PurchaseItem[] actual = repo.findLast(10);
        PurchaseItem[] expected = { seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast6Test(){
        CartManager repo = new CartManager();
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);


        PurchaseItem[] actual = repo.findLast();
        PurchaseItem[] expected = { sixth, fifth, fourth, third, second, first };
        Assertions.assertArrayEquals(expected, actual);
    }
}
