import ru.netology.javaqa.WorkRestService;

public class Main {

    public static void main(String[] args) {
        WorkRestService service = new WorkRestService();
        service.calcBalance(10_000, 3_000, 20_000);
    }
}
