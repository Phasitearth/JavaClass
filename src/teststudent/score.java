package teststudent;

import java.util.Scanner;

public class score {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int num = sc.nextInt();

//        double[] score = new double[num];
//        System.out.print("Enter " + num + " scores : ");
//        for (int i = 0; i < num; i++) {
//            score[i] = sc.nextDouble();
//        }

//        double best = score[0];
//
//        for (int i = 0; i < num; i++) {
//            if (best < score[i]) {
//                best = score[i];
//            }
//        }

        double scores[] = getScore(num);
        
        double best = getBestScore(scores);
        
        
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grade);
        }
    }

    public static double getBestScore(double[] tempScore) {
        double best = tempScore[0];
        for (int i = 0; i < tempScore.length; i++) {
            if (best < tempScore[i]) {
                best = tempScore[i];
            }
        }
        return best;

    }

    public static double[] getScore (int num){
        Scanner sc = new Scanner(System.in);
        double[] score = new double[num];
        System.out.print("Enter " + num + " scores : ");
        for (int i = 0; i < num; i++) {
            score[i] = sc.nextDouble();
        }
        return score ;
    }
    
    
    
    
}
