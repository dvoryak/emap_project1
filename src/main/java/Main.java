import controller.MainController;
import view.View;
import view.ViewImpl;

public class Main {
    public static void main(String[] args) {
        View view = new ViewImpl();
        MainController controller = new MainController(view);
        controller.run();
    }
}
