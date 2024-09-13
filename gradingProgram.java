import java.util.Scanner;

public class gradingProgram {
    public static void main (String [] args){

        Scanner grader = new Scanner(System.in);
        System.out.println("Enter marks");
        int grade = grader.nextInt();

        if ( grade > 90 ){
            System.out.println("Excellent");
        }else if( grade >= 80 ){
            System.out.println("Very Good");
        }else if( grade >= 70){
            System.out.println("Good");
        }else if( grade >= 60){
            System.out.println("Medium");
        }else if( grade >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        grader.close();
    }
}
