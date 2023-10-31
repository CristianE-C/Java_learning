// Lesson-4
package java_udemi;

public class Student {
    int stud_ticket_num;
    String first_name;
    String last_name;
    int year_of_studies;
    double avg_mat;
    double avg_economie;
    double avg_foreign_lang;

}


class TestStudent {
    public static void main(String[] args) {

        Student stud_1 = new Student();
        stud_1.stud_ticket_num = 22;
        stud_1.first_name = "Max";
        stud_1.last_name = "Peyn";
        stud_1.year_of_studies = 2023;
        stud_1.avg_mat = 9.68;
        stud_1.avg_economie = 10;
        stud_1.avg_foreign_lang = 9.10;
        
        
        Student stud_2 = new Student();
        stud_2.stud_ticket_num = 39;
        stud_2.first_name = "Vasya";
        stud_2.last_name = "Pupkin";
        stud_2.year_of_studies = 2023;
        stud_2.avg_mat = 9.30;
        stud_2.avg_economie = 8.50;
        stud_2.avg_foreign_lang = 9;
       
        
        Student stud_3 = new Student();
        stud_3.stud_ticket_num = 39;
        stud_3.first_name = "Van";
        stud_3.last_name = "Dam";
        stud_3.year_of_studies = 2023;
        stud_3.avg_mat = 10;
        stud_3.avg_economie = 10;
        stud_3.avg_foreign_lang = 10;


        double avg_stud1 = (stud_1.avg_mat + stud_1.avg_economie + stud_1.avg_foreign_lang) / 3;
        double avg_stud2 = (stud_2.avg_mat + stud_2.avg_economie + stud_2.avg_foreign_lang) / 3;
        double avg_stud3 = (stud_3.avg_mat + stud_3.avg_economie + stud_3.avg_foreign_lang) / 3;


        System.out.println("Средняя арифметическая оценка для: " + stud_1.first_name + " " + stud_1.last_name + " = " + avg_stud1);
        System.out.println("Средняя арифметическая оценка для: " + stud_2.first_name + " " + stud_2.last_name + " = " + avg_stud2);
        System.out.println("Средняя арифметическая оценка для: " + stud_3.first_name + " " + stud_3.last_name + " = " + avg_stud3);
        
    }
    
}