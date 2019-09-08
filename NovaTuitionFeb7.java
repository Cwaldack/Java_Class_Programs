import java.util.Scanner;

public class NovaTuitionFeb7 {
    public static final double STUDENT_ACTIVITIES_FEE = 4.60;
    public static final double PARKING_FEE = 2.00;
    public static void main(String[] args)

    {

        Scanner keyboard = new Scanner(System.in);

        int studentType = 0;
        String name = " ";
        double      basicPrice = 0.0;
        double capitalFee = 0.0;
        double totalTuitionAndFeesPerCredit = 0.0;
        int credits = 0;
        double totalTuitionAndFees = 0.0;



//Getting user input

        System.out.println("Please enter your name:");

        name = keyboard.nextLine();



        System.out.println("Please choose the type of student.");

        System.out.println("1. Virginia Resident 180.40 per credit");

        System.out.println("2. Military Contract 180.40 per credit");

        System.out.println("3. Veterans and Dependents 180.40 per credit");

        System.out.println("4. Dual Enrolled 180.40 per credit");

        System.out.println("5. Business Contract 240.40 per credit");

        System.out.println("6. Out of State 359.65 per credit");

        studentType = keyboard.nextInt();

        keyboard.nextLine();//needed any time you input a string or char after double or int




//setting basicPrice based on studentType

        switch (studentType)

        {

            case 1:

                basicPrice = 180.40;
                break;

            case 2:
                capitalFee = 180.40;
                basicPrice = 180.40;
                break;

            case 3:

                basicPrice = 180.40;
                break;

            case 4:

                basicPrice = 180.40;
                break;

            case 5:
                capitalFee = 21.00;
                basicPrice = 240.40;
                break;

            case 6:
                capitalFee = 21.00;
                basicPrice = 359.65;
                break;

            default:

                basicPrice = 0.0;

                //end of switch for basicPrice


                totalTuitionAndFeesPerCredit = basicPrice + capitalFee + STUDENT_ACTIVITIES_FEE + PARKING_FEE;
                totalTuitionAndFees = totalTuitionAndFeesPerCredit * credits;


//Display results


                System.out.printf("%-40s%15s\n", "Student Name", name);

                System.out.printf("%-40s%15d\n", "Student Type", studentType);

                System.out.printf("%-40s%15.2f\n", "Basic Tuition", basicPrice);

                System.out.printf("%-40s%15.2f\n", "Capital Fee", capitalFee);

//System.out.println("Student Activities Fee: " +STUDENT_ACTIVITIES_FEE);

                System.out.printf("%-40s%15.2f\n", "Student Activities Fee", STUDENT_ACTIVITIES_FEE);

//System.out.println("Parking Infrastructure Fee: " + PARKING_FEE);

                System.out.printf("%-40s%15.2f\n", "Parking Infrastructure Fee", PARKING_FEE);

//System.out.println("Total Tuition and Fees Per Credit: " + totalTuitionAndFeesPerCredit);

                System.out.printf("%-40s%15.2f\n", "Total Tuition and Fees Per Credit", totalTuitionAndFeesPerCredit);

//System.out.println("X Number of Credits " + credits);

                System.out.printf("%-40s%15d\n", "X Number of Credits", credits);

//System.out.println("Total Tuition and Fees " + totalTuitionAndFees);

                System.out.printf("%-40s%15.2f\n", "Total Tuition and Fees", totalTuitionAndFees);


//System.out.println("Adder: " + adder);

//System.out.println("Extras: " + extraPrice);

//System.out.println("Total Price: " + totalPrice);


        } //end of main

    }
}
