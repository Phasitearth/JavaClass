
package teststudent;
import java.util.Scanner;
public class student2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner  (System.in);
        int num ;
        double [][] score;
        double best;
        char grade;
        System.out.print("Enter the number of student : ");
        num = sc.nextInt();
        score = new double [num][3];
        double total =0;
        for (int i=0; i<num ; i++){
            System.out.print("input score of student "+i +" mid/final/assign : ");
            score[i][0]= sc.nextDouble();
            score[i][1]= sc.nextDouble();
            score[i][2]= sc.nextDouble();
            total =  score[i][0]+ score[i][1]+ score[i][2];
            
        }
        
        
        System.out.print("mid/final/ass : \n");
        for(int i =0;i<num;i++){
            System.out.print("student "+ i+" : \nMidterm score is : "
                    +score[i][0]+"\nFinal score is : "+score[i][1]+"\nAssing score is "+score[i][2]+"\n"+"total is " +total+"\n");
        }
        
    }
}
