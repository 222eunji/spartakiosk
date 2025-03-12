import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 관리
//        Menu menu = new Menu();
//        List<List<MenuItem>> menuItems = new ArrayList<>();
//        menuItems.add(menu.burgers);
//        menuItems.add(menu.drinks);
//        menuItems.add(menu.desserts);

        // Kiosk 호출
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}