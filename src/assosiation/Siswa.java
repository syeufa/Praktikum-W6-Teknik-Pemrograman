
package assosiation;

/**
 * PRAKTIKUM W6 TEKPRO (ASSOSIATION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */
public class Siswa {
    private String name;
    
    Siswa(String name){ //constructor
        this.name=name;
    }
    
    //setter and getter
    public String getStudentName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
