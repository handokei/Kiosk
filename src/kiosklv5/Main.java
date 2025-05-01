package kiosklv5;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        List<MenuItem> bugerMenuItems = new ArrayList<>(); //데이터 초기화 및 리스트 선언
        Menu bugerMenu = new Menu("Bugers",bugerMenuItems);

        List<MenuItem> drinkMenuItems = new ArrayList<>(); //데이터 초기화 및 리스트 선언
        Menu drinkMenu = new Menu("Drinks",drinkMenuItems);

        List<MenuItem> dessertMenuItems = new ArrayList<>(); //데이터 초기화 및 리스트 선언
        Menu dessertMenu = new Menu("Desserts",dessertMenuItems);

        MenuItem bugerMenus1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");  //
        MenuItem bugerMenus2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거 ");
        MenuItem bugerMenus3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거 ");
        MenuItem bugerMenus4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거 ");

        MenuItem drinkMenus1 = new MenuItem("Milkshake", 3.9, "상하목장 우유 100%로 만든 수제 밀크 쉐이크 ");
        MenuItem drinkMenus2 = new MenuItem("Zero Coke", 2.5, "제로칼로리 코카콜라 ");
        MenuItem drinkMenus3 = new MenuItem("100% mineral Water", 1.0, "100% 미네랄 에비앙 워터 ");

        MenuItem dessertMenus1 = new MenuItem("scon", 2.5, "100% 유기농 스콘 ");
        MenuItem dessertMenus2 = new MenuItem("Potato chip", 1.5, "100% 유기농 감자로 만든 칩 ");
        MenuItem dessertMenus3 = new MenuItem("Sweet Potato chip", 2.5, "100% 유기농 고구마로 만든 칩 ");

        bugerMenuItems.add(bugerMenus1);
        bugerMenuItems.add(bugerMenus2);
        bugerMenuItems.add(bugerMenus3);
        bugerMenuItems.add(bugerMenus4);
        drinkMenuItems.add(drinkMenus1);
        drinkMenuItems.add(drinkMenus2);
        drinkMenuItems.add(drinkMenus3);
        dessertMenuItems.add(dessertMenus1);
        dessertMenuItems.add(dessertMenus2);
        dessertMenuItems.add(dessertMenus3);

        menuList.add(bugerMenu);
        menuList.add(drinkMenu);
        menuList.add(dessertMenu);

        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();


    }
}
