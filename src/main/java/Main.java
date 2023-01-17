import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int number = service.numberSqr(10, 9999999);
        System.out.println(number);
    }
}
