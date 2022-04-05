package composition;

/**
 * PRAKTIKUM W6 TEKPRO (COMPOSITION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */
public class Teacher {
    private String ID, name, fieldOfStudy;
    private Address address;
    
public Teacher(String ID,String name, String fieldOfStudy, Address address){
    this.ID = ID;
    this.name = name;
    this.fieldOfStudy = fieldOfStudy;
    this.address = address;
}
void display(){  
System.out.println("ID: "+ ID +"\nName: "+name+ "\nField Of Study: "+fieldOfStudy+"\nAddress: "+address.street+" "+address.number+" "+ address.city);  
  
}  

}
