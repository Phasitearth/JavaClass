
package learning061;

import java.util.Scanner;
public class inClass {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

     
        System.out.print("Enter the number of student: ");
        int num =sc.nextInt();
        int[] score;
        score =new int[num];
        
        
        score = iScore(num);
        
        int best = best(score,num);

        for(int i=0;i<score.length;i++){
            System.out.println("Student "+i +" score is "+score[i] +" and grade is "+checkGrade(score[i],best));
        }
 String re="";
        for(int i=score.length-1 ;i>=0;i--){
            re+=score[i]+" ";
            if(i==0){
                System.out.println("score reverse : "+re);
           }
//i=2  --> 0(10) 1(20) -->เงื่อนไขเริ่มที่ iต้องน้อยกว่า 0 เริ่ม 1>0 ทำงาน เก็บ re =20 แล้ว i-- --> 1-1=0 i=0 ทำงาน i 0 reเก็บ re1(20) +ด้วยre(10) i=0 แสดงผล  20 10 แล้ว i-- i<0 แล้ว ออกลูป 
            
        }
        
    }
    
    public static char checkGrade(int score,int best){
        char grade;
       if(score >=best-10){     
       grade='A';    
       }
       else if(score>=best-20){
           grade='B';
       }
       else if(score>=best-30){
           grade='C';
       }
       else if(score>=best-40){
           grade='D';
       }
       else{
           grade='F';
       }
        
       return grade;
    }
    
    public static int best(int score[],int num){
        int best=0;
          for(int i=0;i<num;i++){
            if(score[i]>best){
                best = score[i];
            }
            
        }
        return best;
    }
    public static int[] iScore(int num){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter "+num +" score :");
    
    int[] iScore= new int[num];
    for(int i =0; i<num;i++){
        iScore[i]=sc.nextInt();
    }

        return iScore ;
    }
}
