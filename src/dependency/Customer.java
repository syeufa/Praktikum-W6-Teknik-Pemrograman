package dependency;
/**
 * PRAKTIKUM W6 TEKPRO (DEPENDENCY)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */

public class Customer {
  private int custNumber;
  private String name;

    public Customer(int custNumber, String name) {
        this.custNumber = custNumber;
        this.name = name;
    }
  
  public void takeOrder(Restaurant r){
      System.out.println("Customer No. : "+ custNumber + "\nName :"+ name);
      r.Order("Spaghetti Marinara", 75000);
  }
  
}
