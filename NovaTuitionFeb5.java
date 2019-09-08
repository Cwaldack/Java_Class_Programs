import java.util.Scanner;
public class NovaTuitionFeb5 {
    public static void main(String[] args)

    {

        Scanner keyboard = new Scanner(System.in);


        int studentType = 0;

        String name = " ";

        double basicPrice = 0.0;


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

                basicPrice = 180.40;
                break;

            case 3:

                basicPrice = 180.40;
                break;

            case 4:

                basicPrice = 180.40;
                break;

            case 5:

                basicPrice = 240.40;
                break;

            case 6:

                basicPrice = 359.65;
                break;

            default:

                basicPrice = 0.0;

                //end of switch for basicPrice




//Display results

                System.out.println("Student Name: " + name);

                System.out.println("Student Type: " + studentType);

                System.out.println("Basic Tuition: " + basicPrice);

//System.out.println("Adder: " + adder);

//System.out.println("Extras: " + extraPrice);

//System.out.println("Total Price: " + totalPrice);


        } //end of main

    }
}
