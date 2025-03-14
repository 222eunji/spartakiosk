import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 1. 속성
    private final List<Menu> menus = new ArrayList<>(); // 메뉴 초기화
    private final List<MenuItem> cart = new ArrayList<MenuItem>();
    Scanner sc = new Scanner(System.in);


    // 2. 생성자


    // 3. 기능
    void start() {

        // 메뉴 초기화
        initializeMenu();

        // 메뉴 입출력 반복문 시작
        int answer1 = -1; // 카테고리 선택 변수 초기화
        int orderCount = 0;


        while (answer1 != 0) {
            Menu.displayMainMenu(); // 기본 메뉴판 출력
            if (orderCount >= 1) {
                System.out.println("\n [🌟 ORDER MENU 🌟]");
                System.out.printf("%10s | %s", "4. Orders", "장바구니를 확인 후 주문합니다.\n");
                System.out.printf("%10s | %s", "5. Cancel", "진행중인 주문을 취소합니다.\n");
            }
            answer1 = inputAnswer(sc); // 사용자 값 입력 받기

            if (answer1 == 0) break; // 0이면 종료
            else if (answer1 >= 1 && answer1 <= 3) {
                menus.get(answer1 - 1).displayCategoryMenu(); // 카테고리 상세 메뉴 출력하기
                int chosenItem = inputAnswer(sc); // 상세 메뉴 고르기
                showChosenItem(answer1, chosenItem); // 선택한 메뉴 출력하기
                if (chosenItem != 0) {
                    addCart(answer1, chosenItem);
                    orderCount++;
                } // 카트담은 횟수 카운트
            } else if (answer1 == 4) {
                // 장바구니 확인하기
                showOrderItem();
                System.out.println("죄송합니다. 주문 준비 중입니다.😭💦");

                // 총액 확인하기
//                System.out.println("🪙 TOTAL 🪙");

                return;
                // 장바구니 확인하기 [Orders]
                // 총액 확인하기 []
            } else if (answer1 == 5) {
                // 장바구니 초기화
                System.out.println("🛒 장바구니를 초기화 합니다.");
                cart.clear();
                orderCount = 0;
            } else {
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
            }
        }
        System.out.println("\n프로그램을 종료합니다.");
    }

    // 메뉴 초기화하기
    public void initializeMenu() {
        // 카테고리별 객체 만들기
        Menu burgers = new Menu("BURGERS", "🍔");
        Menu drinks = new Menu("DRINKS", "🥤");
        Menu desserts = new Menu("DESSERTS", "🍟");

        // 버거 상세 메뉴 초기화
        burgers.addMenuItems(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItems(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItems(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItems(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 상세 메뉴 초기화
        drinks.addMenuItems(new MenuItem("Coke", 2.0, "상쾌한 탄산음료"));
        drinks.addMenuItems(new MenuItem("Sprite", 2.0, "레몬과 라임 향이 나는 탄산음료"));
        drinks.addMenuItems(new MenuItem("Icedtea", 2.3, "달달한 복숭아 아이스티"));
        drinks.addMenuItems(new MenuItem("Americano", 2.5, "고소한 원두 커피"));
        drinks.addMenuItems(new MenuItem("Milkshake", 4.8, "상하목장 우유로 만든 밀크쉐이크"));

        // 디저트 상세 메뉴 초기화
        desserts.addMenuItems(new MenuItem("FrenchFries", 1.9, "바로 튀겨낸 바삭바삭한 감자튀김"));
        desserts.addMenuItems(new MenuItem("CheeseSticks", 2.6, "통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 치즈튀김"));
        desserts.addMenuItems(new MenuItem("ChickenNuggets", 2.9, "닭안심살로 만든 담백하고 촉촉한 치킨너겟"));

        // List<Menu>에 추가
        menus.add(burgers);
        menus.add(drinks);
        menus.add(desserts);
    }

    // 정수값 입력 받기
    static int inputAnswer(Scanner sc) {
        while (true) {
            System.out.print("▶️ 입력: ");

            // 입력 값 정수여부 검증하기
            if (!sc.hasNextInt()) { // 입력 값 정수여부 확인하기
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
                sc.nextLine();
                continue; // 정수가 아니면 다시 입력받음
            }

            // 정수일 경우 num에 값 대입하기
            int num = sc.nextInt();
            sc.nextLine();
            return num; // 입력값 반환
        }


    }

    // 선택한 메뉴 출력하기
    public void showChosenItem(int answer1, int chosenItem) {
        if (chosenItem == 0) {
            System.out.println("\n이전으로 돌아갑니다.");
        } else {
            System.out.print("✅ 선택한 메뉴: ");
            System.out.printf("%s | W %-3.1f | %s\n",
                    menus.get(answer1 - 1).getMenuItems().get(chosenItem - 1).getName(),
                    menus.get(answer1 - 1).getMenuItems().get(chosenItem - 1).getPrice(),
                    menus.get(answer1 - 1).getMenuItems().get(chosenItem - 1).getDetail());
        }
    }

    // 카트 담기
    void addCart(int answer1, int chosenItem) {
        System.out.println("🛒 위 메뉴를 장바니에 추가하시겠습니까? \n" +
                "1. 확인　　　　　　　2.취소");
        while (true) {
            try {
                System.out.print("▶️ 입력: ");
                int answer = 0;
                answer = sc.nextInt(); // 값 입력받기
                sc.nextLine();

                if (answer == 1) { // 1,2 외는 모두 예외처리
                    System.out.println(menus.get(answer1 - 1).getMenuItems().get(chosenItem - 1).getName() +
                            " 이 장바구니에 추가되었습니다.");
                    cart.add(menus.get(answer1 - 1).getMenuItems().get(chosenItem - 1));
                    return;
                } else if (answer == 2) {
                    System.out.println("진행중인 주문을 취소합니다.");
                    return;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("[error] 올바른 값을 입력해주세요.");
                sc.nextLine();
            }
        }
    }

    // 주문할 메뉴 출력하기
    public void showOrderItem() {
        System.out.println(" ");
        System.out.println("🧾 ORDERS 🧾");
        for (MenuItem c : cart) {
            System.out.printf("%-15s | W %-3.1f | %s\n",
                    c.getName(),
                    c.getPrice(),
                    c.getDetail());
        }
    }

}


