import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void testUnderRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.numberSqr(10, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpperRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.numberSqr(10000, 999999);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValues() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.numberSqr(100, 9801);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.numberSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testError() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.numberSqr(1000, 0);
        Assertions.assertEquals(expected, actual);
    }
}