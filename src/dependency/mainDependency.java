package dependency;
/**
 * PRAKTIKUM W6 TEKPRO (DEPENDENCY)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */

public class mainDependency {
    public static void main(String[] args) {
     Restaurant r1 = new Restaurant("Roxy Resto");
     Customer c1 = new Customer(01,"Mrs. Elliene");
     
     c1.takeOrder(r1);
     
    }
}
