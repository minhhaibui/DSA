import Practice_astract.ItStudent;
import Practice_astract.MachinalStudent;
import Practice_astract.Student;

public class Main {
    public static void main(String[] args) {
         Student Itstudent = new ItStudent("java",7.8,8,"Voi con",22,"Thai Binh","62PM2");
         Student Machinalstudent = new MachinalStudent("Dung",23,"Phu tho","^62PM2","CNC",8.3,9);

        Itstudent.study();
        Machinalstudent.study();
        System.out.println(Itstudent.getName() + " is score "+ Itstudent.getScore());
        System.out.println(Machinalstudent.getName() + " is score "+ Machinalstudent.getScore());
    }
}
