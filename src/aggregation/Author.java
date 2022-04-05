package aggregation;

/**
 * PRAKTIKUM W6 TEKPRO (AGGREGATION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */
public class Author {
  String authorName;
  int age;
  String place;

  // Author class constructor
  Author(String name, int age, String place){
    this.authorName = name;
    this.age = age;
    this.place = place; 
  }
  
   //setter and getteer
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
  
}
