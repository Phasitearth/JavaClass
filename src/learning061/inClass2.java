
package learning061;
import java.util.Scanner;
public class inClass2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stdNo;
        System.out.print("Enter the number of student: ");
        stdNo = input.nextInt();
        double[][] scores = new double[stdNo][2];
        for(int i =0 ; i<stdNo;i++){
            System.out.println("Enter midterm and final score of student "+i+": ");
            scores[i][0]=input.nextDouble();
            scores[i][1]=input.nextDouble();
        }
        
        for(int i =0 ; i<stdNo;i++){
            System.out.println("Student "+i+" score: mid= "+scores[i][0]+" final= "+scores[i][1]
            +"\nStudent "+i+" score mid&final = "+(scores[i][0]+scores[i][1])  );
            
        }
        
        
        
    }
}
