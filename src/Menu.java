import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 1. 속성
    private String categoryName;
    private String symbol;
    private List<MenuItem> menuItems;


    // 2. 생성자
    Menu(String categoryName, String categoryTitle){
        this.categoryName = categoryName;
        this.symbol = categoryTitle;
        this.menuItems = new ArrayList<>();
    }

    // 3. 기능
    static void displayMainMenu(){
        System.out.println("\n[⭐ MAIN MENU ⭐]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료");
//      System.out.println("-----------------------------------------------------------------------");
    }

    void displayCategoryMenu(){
        System.out.println("\n[" + symbol + " " + categoryName + " MENU " + symbol +"]");
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %-15s | W %-3.1f | %s\n",
                    i + 1, // 상세 번호 출력
                    menuItems.get(i).getName(),
                    menuItems.get(i).getPrice(),
                    menuItems.get(i).getDetail());
        }
        System.out.println("0. 뒤로가기");
    }

    public void addMenuItems(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
