import java.util.Scanner;

public class FindGrade{

    public static void main(String[] args){


        int length_of_args = args.length;
        if (length_of_args == 0){
            System.out.println("you should give a score");
        }
        else{
            int grade = Integer.parseInt(args[0]);
            if(grade>= 90){
                System.out.println("grade : A");
            }   else if(grade >= 80 && grade <89){
                System.out.println("grade : B");
            }   else if(grade >= 70 && grade < 79){
                System.out.println("grade : C");
            }   else if(grade >= 60 && grade < 69) {
                System.out.println("grade : D");
            }else if(grade >= 50 && grade < 59){
                    System.out.println("grade : F");
            }else{
                System.out.println("Invalid score");
            }
        }
    }

}