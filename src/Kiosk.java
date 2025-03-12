import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 1. 속성


    // 2. 생성자


    // 3. 기능
    void start() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int answer = -1;

        while(answer != 0){
        // 기본 메뉴판 출력
        menu.displayMainMenu();

        // 사용자 입력, 검증 출력
        answer = -1;
        while (true) {
            System.out.print("▶️ 입력: ");

            // 입력 값 검증하기! (정수 여부, 보기에 있는 번호인지)
            if (!sc.hasNextInt()) { // 입력 값 정수여부 확인하기
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
                sc.nextLine();
                continue;
            }

            answer = sc.nextInt();
            sc.nextLine();

            // 상세 메뉴 리스트 출력하기
            List<MenuItem> chosenMenu = menu.getBurgers();

            switch (answer) {
                case 0:
                    System.out.println("\n프로그램을 종료합니다.");
                    return;

                case 1:
                    menu.displayBurgers();
                    chosenMenu = menu.getBurgers();
                    break;

                case 2:
                    menu.displayDrinks();
                    chosenMenu = menu.getDrinks();
                    break;

                case 3:
                    menu.displayDesserts();
                    chosenMenu = menu.getDesserts();
                    break;

                default:
                    System.out.println("[error] 보기에 있는 값을 입력해주세요.");
                    continue;
            }

            // 상세 메뉴 입력받기 (예외처리 일단 보류....)
            System.out.print("▶️ 메뉴 선택: ");
            int chosenItem = sc.nextInt();
            sc.nextLine();

            if(chosenItem ==0){
                break;
            }
            else {
                System.out.print("✅ 선택한 메뉴: ");
                System.out.printf("%s | W %-3.1f | %s\n",
                        chosenMenu.get(chosenItem - 1).name,
                        chosenMenu.get(chosenItem - 1).price,
                        chosenMenu.get(chosenItem - 1).detail);
            }

            break;
        }
//            switch (chosenMenu) {
//                case 0:
//                    System.out.println("\n이전으로 돌아갑니다.");
//                    return;
//
//                case 1, 2, 3, 4, 5:
//                    System.out.println("");
//                    System.out.println("선택하신 메뉴는 " + burgers.get(answer - 1).name + "입니다.\n" +
//                            "가격은 " + burgers.get(answer - 1).price + "천원 입니다. \n" +
//                            "(메뉴 설명: " + burgers.get(answer - 1).detail + ")");
//                    return;
//
//                default:
//                    System.out.println("[error] 보기에 있는 값을 입력해주세요.");
//            }
        }
    }

}
