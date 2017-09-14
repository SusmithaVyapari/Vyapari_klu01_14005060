
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                
                int length = sc.nextInt();
                 StudentGroup sg = new StudentGroup(length);
                Student[] students = new Student[length];
                   Student[] students1 = new Student[length];
                for(int i=0;i<length;i++){
                System.out.println("Enter details");
                        int id = sc.nextInt();
                        String fullName = sc.next()+sc.nextLine();
                        int year = sc.nextInt();
                        int month = sc.nextInt();
                        int day = sc.nextInt();
                        int avgmark=sc.nextInt();
                
                    java.util.Date utilDate = null;
                
                    String date = year + "/" + month + "/" + day;

                 try {
                 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                 utilDate = formatter.parse(date);
                 } catch (ParseException e) {
                        System.out.println(e.toString());
                         e.printStackTrace();
                 }

             
                
                Student st = new Student(id,fullName,utilDate,avgmark);
                students[i] = st;
                sg.setStudents(students);
                }
                Date date = new Date();
                Student s = new Student(3313,"mannu",date,85);
                sg.remove(1);
                students1 = sg.getStudents();
                for(int i=0;i<students1.length;i++){
               System.out.println( students1[i].getId());
                System.out.println( students1[i].getAvgMark());
                System.out.println( students[i].getBirthDate());
                System.out.println( students[i].getFullName());
                
                }
                /*
                Student g;
                g=sg.getStudent(1);
                System.out.println( g.getId());
                System.out.println( g.getAvgMark());
                System.out.println( g.getBirthDate());
                System.out.println(g.getFullName());
                
                */
	}

}
