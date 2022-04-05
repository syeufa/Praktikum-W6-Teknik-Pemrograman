package dependency;
/**
 * PRAKTIKUM W6 TEKPRO (DEPENDENCY)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */
public class Restaurant {
    private String name; // restaurant's name
    private String menu;// menu is food's name
    private float foodPrice;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, String menu, float foodPrice) {
        this.name = name;
        this.menu = menu;
        this.foodPrice = foodPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    public void Order(String menu, float foodPrice){
        System.out.println("----------"+ name + "----------");
        System.out.println("Ordered "+ menu + "\nPrice : "+ foodPrice);
    }
    
    
}
