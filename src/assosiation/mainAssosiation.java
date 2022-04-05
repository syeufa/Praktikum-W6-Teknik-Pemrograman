package assosiation;

/**
 * PRAKTIKUM W6 TEKPRO (ASSOSIATION)
 * Author: Syifa Khairina - 211524063
 * Date : 04/05/2022
 */

public class mainAssosiation {
 // Main driver method
    public static void main(String[] args)
    {
        // Creating objects 
        Sekolah sch1 = new Sekolah("SMAN 5 Bekasi Timur");
        Siswa stu1 = new Siswa("Amalia S. Zahri");
 
        // Print and display name and
        // corresponding school of student
        System.out.println(stu1.getStudentName()
                           + " merupakan murid dari "
                           +sch1.getSchoolName());
    }   
}
