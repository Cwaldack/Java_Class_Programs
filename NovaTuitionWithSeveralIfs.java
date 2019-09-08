import java.util.Scanner;

public class NovaTuitionWithSeveralIfs

{

    public static final double STUDENT_ACTIVITIES_FEE = 4.60;

    public static final double PARKING_FEE = 2.00;



    public static void main(String[] args)

    {

        Scanner keyboard = new Scanner(System.in);


        String studentType = " ";

        String name = " ";

        double basicPrice = 0.0;

        double capitalFee = 0.0;

        double totalTuitionAndFeesPerCredit = 0.0;

        int credits = 0;

        double totalTuitionAndFees = 0.0;

//str1.equals(str2);

//Getting user input

        System.out.println("Please enter your name:");

        name = keyboard.nextLine();



        System.out.println("Please choose the type of student.");

        System.out.println("VR. Virginia Resident 180.40 per credit");

        System.out.println("MC. Military Contract 180.40 per credit");

        System.out.println("VD. Veterans and Dependents 180.40 per credit");

        System.out.println("DE. Dual Enrolled 180.40 per credit");

        System.out.println("BC. Business Contract 240.40 per credit");

        System.out.println("OS. Out of State 359.65 per credit");
        studentType = keyboard.nextLine();

        studentType = studentType.toUpperCase();



        System.out.println("Please enter the number of credits that you are taking:");

        credits = keyboard.nextInt();



//setting basicPrice based on studentType

        if (studentType.equals("VR")|| studentType.equals("MC") || studentType.equals("VD") || studentType.equals("DE"))

        {

            basicPrice = 180.40;

        }

        else if (studentType.equals("BC"))

        {

            basicPrice = 240.40;

        }

        else

        {

            basicPrice = 359.65;

        } //end of if else if for basicPrice



        if (studentType.equals("MC")|| studentType.equals("BS") || studentType.equals("OS"))

        {

            capitalFee = 21.00;

        }

        else

        {

            capitalFee = 0.00;

        }


        totalTuitionAndFeesPerCredit = basicPrice + capitalFee + STUDENT_ACTIVITIES_FEE + PARKING_FEE;

        totalTuitionAndFees = totalTuitionAndFeesPerCredit * credits;


//Display results

//System.out.println("Student Name: " + name);

        System.out.printf("%-40s%15s\n", "Student Name", name);

//System.out.println("Student Type: " + studentType);

        System.out.printf("%-40s%15s\n", "Student Type", studentType);

//System.out.println("Basic Tuition: " + basicPrice);

        System.out.printf("%-40s%,15.2f\n", "Basic Tuition", basicPrice);

//System.out.println("Capital Fee: " + capitalFee);

        System.out.printf("%-40s%,15.2f\n", "Capital Fee", capitalFee);

//System.out.println("Student Activities Fee: " +STUDENT_ACTIVITIES_FEE);

        System.out.printf("%-40s%,15.2f\n", "Student Activities Fee", STUDENT_ACTIVITIES_FEE);

//System.out.println("Parking Infrastructure Fee: " + PARKING_FEE);

        System.out.printf("%-40s%,15.2f\n", "Parking Infrastructure Fee", PARKING_FEE);

//System.out.println("Total Tuition and Fees Per Credit: " + totalTuitionAndFeesPerCredit);

        System.out.printf("%-40s%,15.2f\n", "Total Tuition and Fees Per Credit", totalTuitionAndFeesPerCredit);

//System.out.println("X Number of Credits " + credits);

        System.out.printf("%-40s%15d\n", "X Number of Credits", credits);

//System.out.println("Total Tuition and Fees " + totalTuitionAndFees);

        System.out.printf("%-40s%,15.2f\n", "Total Tuition and Fees", totalTuitionAndFees);






    } //end of main

} //end of class
