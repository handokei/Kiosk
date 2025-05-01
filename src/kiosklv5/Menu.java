package kiosklv5;

import java.util.List;

public class Menu {

    //속성
   private String category;
   private List<MenuItem> menuItems;
//    List<MenuItem> bugermenuItems;
//    List<MenuItem> drinksmenuItems;
//    List<MenuItem> dessertmenuItems = new ArrayList<>();



    //생성자-조립설명서
    public Menu (String category,List<MenuItem> menuItems){
        this.category = category;
        this.menuItems = menuItems;
    }
    public String getCategory(){
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    //기능

    public void printMenu() {
        int a = 1;
       for (MenuItem item : getMenuItems() ){
           System.out.println(a++ + ". "+ item);
        }
        System.out.println("0.  종료  |  종료");
    }
}
