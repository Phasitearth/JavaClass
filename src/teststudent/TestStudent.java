package teststudent;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
//        Scanner sc = new Scanner  (System.in);
//        System.out.print("enter student id : ");
//        long id = sc.nextLong();
//        System.out.print("enter student name : ");
//        String name = sc.next();

        student[] sitStudent = new student[2];
//        student[] sitStudent2 = sitStudent;
        sitStudent[0] = new student(60130500112l, "phasit");
        sitStudent[1] = new student(60130500121l, "phasit2");
//        sitStudent[2] = new student();
//        sitStudent2[2].setName("AAAAAA");
        
        for (student Std: sitStudent) {
            System.out.println(Std);

        }

//        double[] values = {2, 5, 9, 11, 25,26,27,28,29,30};
//        double sum = 0;
//        for (int i =0 ; i <=4 ; i++) {
//            sum +=  values[i];
//        }
//        System.out.println("Average: "+ (sum / values.length));
//        

    }
}
