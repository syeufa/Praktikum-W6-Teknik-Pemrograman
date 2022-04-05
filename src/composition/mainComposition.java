package composition;

/**
 * PRAKTIKUM W6 TEKPRO (COMPOSITION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */
public class mainComposition {
   public static void main(String[] args) {  
      Address add1 = new Address("Jl.Mawar","No. 177","Bandung");
      Address add2 = new Address("Jl.Kencana","No. 5","Cimahi");
      
      Teacher t1 = new Teacher("11215JP","Juan Salim","Bahasa Jepang",add1);
      Teacher t2 = new Teacher("18806MT","Diniyati","Matematika Wajib", add2);
      
      t1.display();
      t2.display();
      
   } 
}
