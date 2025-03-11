import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 햄버거 이름,가격,설명 세팅
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 메뉴판 출력
        System.out.println("[🍔 SHAKESHACK MENU 🍔]");
        int index = 1;
        for (MenuItem b : burgers) {
            System.out.print(index++ + ". ");
            System.out.printf("%-15s | W %-3.1f | %s\n", b.name, b.price, b.detail);
        }
        System.out.println("0. 종료");
        System.out.println("-----------------------------------------------------------------------");

        // switch로 작성 해보기
        int answer; // index값 기반 입력
        while (true) { // 입력 값 검증하기! (정수 여부, 보기에 있는 번호인지)
            System.out.print("입력: ");

            if(!sc.hasNextInt()) { // 입력 값 정수여부 확인하기
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
                sc.next();
                continue;
            }

            answer = sc.nextInt();
            sc.nextLine();

            switch(answer) {
                case 0:
                    System.out.println("\n종료합니다.");
                    return;

                case 1,2,3,4 :
                    System.out.println("");
                    System.out.println("선택하신 메뉴는 "+ burgers.get(answer-1).name + "입니다.\n" +
                                        "가격은 " + burgers.get(answer-1).price + "천원 입니다. \n" +
                                        "(메뉴 설명: " + burgers.get(answer-1).detail + ")");
                    return;

                default :
                    System.out.println("[error] 보기에 있는 값을 입력해주세요.");
            }
        }


    }
}