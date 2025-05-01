package kiosklv3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>(); //데이터 초기화 및 리스트 선언

        MenuItem menuItems1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");  //
        MenuItem menuItems2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거 ");
        MenuItem menuItems3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거 ");
        MenuItem menuItems4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거 ");
        menuItems.add(menuItems1);
        menuItems.add(menuItems2);
        menuItems.add(menuItems3);
        menuItems.add(menuItems4);

        System.out.println("==================================");
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println(menuItems1);
        System.out.println(menuItems2);
        System.out.println(menuItems3);
        System.out.println(menuItems4);

        System.out.println("주문 할 메뉴 숫자를 입력하세요. :");

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }



}
