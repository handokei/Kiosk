package kiosjlv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> menuList;


    //생성자
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }


    //기능

    public void start() {
             int inputNum = 0;
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("=====Main Menu=====");
            int a = 1;
            for (Menu menu : menuList) {
                menu.getCategory();
                System.out.println(a++ + ". " + menu.getCategory()); //단순 카테고리 출력하기
            }
            System.out.println("0. 종료      | 종료");
            inputNum = sc.nextInt();
            switch (inputNum) {
                case 1 -> {
                    System.out.println("[  BUGERS MENU  }");
                    int i = 1;
                    for (MenuItem menuItem : menuList.get(0).getMenuItems()) {
                        System.out.println(i++ + ". " + menuItem);
                    }System.out.println("0. 뒤로가기. ");

                    int bugerMenuItemInput = sc.nextInt();
                    switch (bugerMenuItemInput) {
                        case 1 -> System.out.println("선택한 메뉴 : "+menuList.get(0).getMenuItems().get(0));
                        case 2 -> System.out.println("선택한 메뉴 : "+menuList.get(0).getMenuItems().get(1));
                        case 3 -> System.out.println("선택한 메뉴 : "+menuList.get(0).getMenuItems().get(2));
                        case 4 -> System.out.println("선택한 메뉴 : "+menuList.get(0).getMenuItems().get(3));
                        case 0 -> {
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("[  DRINKS MENU  }");
                    int i = 1;
                    for (MenuItem menuItem : menuList.get(1).getMenuItems()) {
                        System.out.println(i++ +". "+menuItem);
                    }
                    System.out.println("0. 뒤로가기.");

                    int drinkMenuItemInput = sc.nextInt();
                    switch (drinkMenuItemInput) {
                        case 1 -> System.out.println("선택한 메뉴 : "+menuList.get(1).getMenuItems().get(0));
                        case 2 -> System.out.println("선택한 메뉴 : "+menuList.get(1).getMenuItems().get(1));
                        case 3 -> System.out.println("선택한 메뉴 : "+menuList.get(1).getMenuItems().get(2));
                        case 0 -> {
                            break;
                        }
                    }
                }
                case 3 -> {
                    System.out.println("[  DESSERTS MENU  }");
                    int i = 1;
                    for (MenuItem menuItem : menuList.get(2).getMenuItems()) {
                        System.out.println(i++ + ". " + menuItem);
                    }
                    System.out.println("0. 뒤로가기.");

                    int dessertMenuItemInput = sc.nextInt();
                    switch (dessertMenuItemInput) {
                        case 1 -> System.out.println("선택한 메뉴 : "+menuList.get(2).getMenuItems().get(0));
                        case 2 -> System.out.println("선택한 메뉴 : "+menuList.get(2).getMenuItems().get(1));
                        case 3 -> System.out.println("선택한 메뉴 : "+menuList.get(2).getMenuItems().get(2));
                        case 0 -> {
                            break;
                        }
                    }
                    }
                case 0 -> {
                    System.out.println("0. 종료      | 종료");
                    return;
                }
            }

        }

    }
}





