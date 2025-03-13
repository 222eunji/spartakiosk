import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 1. 속성

    // 2. 생성자

    // 3. 기능

    static void start() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        // 메뉴 초기화
        List<Menu> menus = new ArrayList<>();
        initializeMenu(); // 상세 메뉴 정보 담기

        // 메뉴 입출력 반복문 시작
        int answer = -1; // while문 반복 종료를 위한 변수

        while (answer != 0) {
            // 기본 메뉴판 출력
            Menu.displayMainMenu();

            // 사용자 값 입력 받기
            answer = inputAnswer(sc);

            // 메뉴 출력하기
//            burgers.displayCategoryMenu();


        }
        System.out.println("\n프로그램을 종료합니다.");

//        while(answer != 0){
//            // 기본 메뉴판 출력
//            Menu.displayMainMenu();
//
//           // 사용자 입력, 검증 출력
//            while (true) {
//            System.out.print("▶️ 입력: ");
//
//            // 입력 값 정수여부 검증하기
//            if (!sc.hasNextInt()) { // 입력 값 정수여부 확인하기
//                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
//                sc.nextLine();
//                continue; // 정수가 아니면 다시 입력받음
//            }
//
//            // 정수일 경우 answer에 값 대입하기
//            answer = sc.nextInt();
//            sc.nextLine();
//
//            // 상세 메뉴 리스트 출력하기
//            List<MenuItem> chosenMenu = menu.getBurgers();
//            switch (answer) {
//                case 0:
//                    System.out.println("\n프로그램을 종료합니다.");
//                    return;
//
//                case 1:
//                    menu.displayBurgers();
//                    chosenMenu = menu.getBurgers();
//                    break;
//
//                case 2:
//                    menu.displayDrinks();
//                    chosenMenu = menu.getDrinks();
//                    break;
//
//                case 3:
//                    menu.displayDesserts();
//                    chosenMenu = menu.getDesserts();
//                    break;
//
//                default:
//                    System.out.println("[error] 보기에 있는 값을 입력해주세요.");
//                    continue;
//            }
//
//            // 상세 메뉴 입력받기 (예외처리 일단 보류....)
//            System.out.print("▶️ 메뉴 선택: ");
//            int chosenItem = sc.nextInt();
//            sc.nextLine();
//
//            if(chosenItem ==0) {
//                System.out.println("\n이전으로 돌아갑니다.");
//                break;
//            } else {
//                System.out.print("✅ 선택한 메뉴: ");
//                System.out.printf("%s | W %-3.1f | %s\n",
//                        chosenMenu.get(chosenItem - 1).name,
//                        chosenMenu.get(chosenItem - 1).price,
//                        chosenMenu.get(chosenItem - 1).detail);
//            }
//
//            break;
//        }
//
//        }
    }

    // 메뉴 초기화하기
    static void initializeMenu() {
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
//        menus.add(burgers);



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

            // 정수일 경우 answer에 값 대입하기
            int answer = sc.nextInt();
            sc.nextLine();
            return answer; // 입력값 반환
        }


    }

    //
}