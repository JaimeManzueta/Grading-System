import java.util.Scanner;
public class Grade{

    public static void main(String[] args){
        // Scan function. 
        Scanner scanf = new Scanner(System.in);


        // Input the Weight of the Grades. 
    
        System.out.println("Homework Weight?");
        int num = Integer.parseInt(scanf.nextLine());

        System.out.println("Exam 1 Weight:");
        int examnum1 = Integer.parseInt(scanf.nextLine());

        System.out.println("Exam 2 Weight:");
        int exam2num1 = Integer.parseInt(scanf.nextLine());

        System.out.println("Using Weights: Hw: " + num + ", Exam 1: " + examnum1 + ", Exam 2: " + exam2num1);
        System.out.println();



        // Homework grade 
        System.out.println("Number of assignments: ");
        int num2 = Integer.parseInt(scanf.nextLine());

        System.out.println("Average Homework grade: ");
        float num3 = Float.parseFloat(scanf.nextLine());

        System.out.println("Number of late days used: ");
        int num4 = Integer.parseInt(scanf.nextLine());

        System.out.println("Labs attended: ");
        int num5 = Integer.parseInt(scanf.nextLine());

        //Outputs
        System.out.println("Total Points = " + (num2 * num3 + num4 * num5)+ " / 140.0");
        float hw_weight = hw_grade(num, num2, num3, num4, num5);
        System.out.println("HW Weighted Score:" + hw_weight);

        System.out.println();


        // Exam 1 Grade:

        
        System.out.println("Exam 1 Score: ");
        int examnum2 = Integer.parseInt(scanf.nextLine());

        System.out.println("Curve: ");
        int curve1 = Integer.parseInt(scanf.nextLine());

        float curvedvariable1 = examnum2 + curve1;
        
        // Validate score 
        if (curvedvariable1 > 100.0) {
            System.out.println("Invalid Test Score. Please enter a score less or equal to 100");
            // Assuming you prompt the user to input the values again

            System.out.println("Exam 1 Score:");
            examnum2 = Integer.parseInt(scanf.nextLine());

            System.out.println("Curve: ");
            curve1 = Integer.parseInt(scanf.nextLine());

            curvedvariable1 = examnum2 + curve1; // Update curvedvariable1
        }

        //output
        float exam1_weight = exam1_grade(examnum1,examnum2,curve1);
        System.out.println("Total Points = " + curvedvariable1 + " / 100.0");
        System.out.println("Exam 1 Weighted Score: " + exam1_weight);


        System.out.println("");



        // Exam 2 Grade: 
        System.out.println("Exam 2 Score: ");
        int exam2num2= Integer.parseInt(scanf.nextLine());

        System.out.println("Curve: ");
        int curve2 = Integer.parseInt(scanf.nextLine());

        float curvedvariable2 = exam2num2 + curve2;

        if (curvedvariable2 > 100.0) {
            System.out.println("Invalid Test Score. Please enter a score less or equal to 100");
            // Assuming you prompt the user to input the values again

            System.out.println("Exam 2 Score:");
            exam2num2 = Integer.parseInt(scanf.nextLine());

            System.out.println("Curve: ");
            curve2 = Integer.parseInt(scanf.nextLine());

            curvedvariable2 = exam2num2 + curve2; // Update curvedvariable1
        }
        
        float exam2_weight = exam2_grade(exam2num1,exam2num2,curve2);
        System.out.println("Total Points = " + curvedvariable2 + " / 100.0");
        System.out.println("Exam 2 Weighted Score: " + exam2_weight);


        System.out.println("");

       // Accumulative_Grade
       float accumalative_grade = hw_weight + exam1_weight + exam2_weight;

            if (accumalative_grade <= 69.4) {
                System.out.println("You Failed with: " + accumalative_grade);
            } 
            else {
                System.out.println("You passed With: " + accumalative_grade);
            }
}
     

    public static float hw_grade(int weight1, int num_assigmet, float avg_hm_grade, int late_days, int lab_attend) {
    
        return weight1 * (num_assigmet * avg_hm_grade + late_days * lab_attend) / (10.0f * 10 + 4 * 10);
    }

    public static float exam1_grade(float examnum1, float examnum2, float curve1) {
        float result = (examnum1 * (examnum2 + curve1)) / 100.0f;
        return result;
    }
        

    
    public static float exam2_grade(float exam2num1, float exam2num2, float curve2) {
        float result = (exam2num1 * (exam2num2 + curve2)) / 100.0f;
        return result;
    }
    
}




