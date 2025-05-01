package kiosklv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //속성
   private List<MenuItem> menuItems = new ArrayList<>();

    //생성자 -조립설명서
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //기능
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1 -> System.out.println(menuItems.get(0));
                case 2 -> System.out.println(menuItems.get(1));
                case 3 -> System.out.println(menuItems.get(2));
                case 4 -> System.out.println(menuItems.get(3));
                case 0 -> {
                    System.out.println(". 종료      | 종료");
                    return;
                }
                default -> System.out.println("0~4 외의 번호를 입력하지 마세요.");

            }

        }

    }
}
