package kiosjlv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //속성
   private String category;
   private List<MenuItem> menuItems;

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



}
