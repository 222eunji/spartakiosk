import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[🍔 SHAKESHACK MENU 🍔]"); // 메뉴판 출력
        System.out.printf("%-15s | W %-3.1f | %s\n", "1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.printf("%-15s | W %-3.1f | %s\n", "2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.printf("%-15s | W %-3.1f | %s\n", "3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.printf("%-15s | W %-3.1f | %s\n", "4. Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료");
        System.out.println("-----------------------------------------------------------------------");

        int answer;
        while (true) {
            System.out.print("입력: ");

            if(!sc.hasNextInt()) { // 입력 값 정수여부 확인하기
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
                sc.next();
                continue;
            }

            answer = sc.nextInt();
            sc.nextLine();

            if (answer>=0 && answer <=4) { // 입력 값 0~4인지 확인하기
                break;
            } else {
                System.out.println("[error] 보기에 있는 값을 입력해주세요.");
            }
        }

        if (answer == 0) {
            System.out.println("\n종료합니다.");
        }


    }
}