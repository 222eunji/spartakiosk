import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 1. 속성
    List<MenuItem> burgers = new ArrayList<>();
    List<MenuItem> drinks = new ArrayList<>();
    List<MenuItem> desserts = new ArrayList<>();


    // 2. 생성자
    public Menu() {
        // 햄버거 이름,가격,설명 세팅
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 이름,가격,설명 세팅
        drinks.add(new MenuItem("Coke", 2.0, "상쾌한 탄산음료"));
        drinks.add(new MenuItem("Sprite", 2.0, "레몬과 라임 향이 나는 탄산음료"));
        drinks.add(new MenuItem("Icedtea", 2.3, "달달한 복숭아 아이스티"));
        drinks.add(new MenuItem("Americano", 2.5, "고소한 원두 커피"));
        drinks.add(new MenuItem("Milkshake", 4.8, "상하목장 우유로 만든 밀크쉐이크"));

        // 사이드 이름,가격,설명 세팅
        desserts.add(new MenuItem("FrenchFries",1.9,"바로 튀겨낸 바삭바삭한 감자튀김"));
        desserts.add(new MenuItem("CheeseSticks",2.6,"통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 치즈튀김"));
        desserts.add(new MenuItem("ChickenNuggets",2.9,"닭안심살로 만든 담백하고 촉촉한 치킨너겟"));
    }


    // 3. 기능
    void displayMainMenu(){
        System.out.println("\n[⭐ MAIN MENU ⭐]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료");
//      System.out.println("-----------------------------------------------------------------------");
    }

    void displayBurgers(){
        System.out.println("\n[🍔 BURGERS MENU 🍔]");
        int index = 1;
        for (MenuItem b : burgers) {
            System.out.print(index++ + ". ");
            System.out.printf("%-15s | W %-3.1f | %s\n", b.name, b.price, b.detail);
        }
        System.out.println("0. 뒤로가기");
//        System.out.println("-----------------------------------------------------------------------");
    }

    void displayDrinks(){
        System.out.println("\n[🥤 DRINKS MENU 🥤]");
        int index = 1;
        for (MenuItem d : drinks) {
            System.out.print(index++ + ". ");
            System.out.printf("%-15s | W %-3.1f | %s\n", d.name, d.price, d.detail);
        }
        System.out.println("0. 뒤로가기");
//        System.out.println("-----------------------------------------------------------------------");
    }

    void displayDesserts(){
        System.out.println("\n[🍟 DESSERTS MENU 🍟]");
        int index = 1;
        for (MenuItem de : desserts) {
            System.out.print(index++ + ". ");
            System.out.printf("%-15s | W %-3.1f | %s\n", de.name, de.price, de.detail);
        }
        System.out.println("0. 뒤로가기");
//        System.out.println("-----------------------------------------------------------------------");
    }

    public List<MenuItem> getBurgers() {
        return burgers;
    }

    public List<MenuItem> getDrinks() {
        return drinks;
    }

    public List<MenuItem> getDesserts() {
        return desserts;
    }


}
