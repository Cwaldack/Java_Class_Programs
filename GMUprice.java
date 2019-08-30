// IMPORTS ---------------------------
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import java.util.Scanner;
// END IMPORTS -----------------------

public class GMUprice extends JFrame
{
    public static void  main(String[] args)
    {
        /**
         * So in here i need to make all the main logic and such
         * its gonna be a little bit like this
         *
         * name_in = textbox_in("pls enter name")
         * Tuition_type = ('pls enter tuition type i.e Instate out of state
         * program_type ='select program type, undergrad, grad, law
         * if program_type = law,  display new object 'time'
         * time = day(am) or night(pm)
         *
         * and math (rip)
         * so undergrad tuition rate is based off 12-16 credits per semester, im just gonna take 14 creds and devide
         * by 12,462 coming out to $890 per credit for instate and 2565 for out of state,
         * gonna just roll with that number
         *
         * and grad is 11354 per 9 credit semester so 1261 per cr in state and 26794/9 = 2977 oos.
         *
         * law is in state 25354/9 (i think, it is a grad program and thats what the ex showed) 2817 per cr for day,
         * 20660/9 = 2295 per cr for night. oos follows same principals so 40740/9 =  4526 day, 33298/9 = 3699 night
         *
         * nerd shit done tl;dr =  undergrad = 890is/2565os; grad = 1261is/2977os; law = 2817isd/4526osd/2295isn/3699osn
         *
         * so every student need the education resource fee of 100 bucks and grads also get a special surprise fee of 60
         *
         * we dont have to do the math(actually i dont know if we are supposed to but im gonna do it anyway since it
         * takes like 2 lines maybe (foreshadowing)
         *
         * now, we code
         */
        boolean bError = true;
        String uName = "";
        String residency = "";
        String program = "";
        String progTime = "";
        int credits = 0;

        Scanner initOptions =  new Scanner(System.in);
        System.out.println("Welcome to the GMU CoA calculator, please enter your First and Last name:");

        uName = initOptions.nextLine();
        System.out.println("Great, welcome to the calculator " + uName + ". Now are you in state or out of state (please" +
                " reply with \"in\" or \"out\" ");

        residency = initOptions.nextLine();
        System.out.println("Great, now that we have that, are you going for a undergrad degree, graduate degree, " +
                "or a law degree?");

        program = initOptions.nextLine();
        if(program.equals("law"))
        {

            System.out.println("Amazing will you be attending school during the day, or during the night? ");

            progTime = initOptions.nextLine();
        }

        System.out.println("now that we have that done, how many credits will you be taking?");


        do {
            try {
                credits = Integer.parseInt(initOptions.nextLine());
                bError = false;
            } catch (Exception e) {
                System.out.println("Error! please put in a number value");
                initOptions.reset();

            }
        }
        while (bError);
        System.out.printf("Great lets verify your information. your name is %s and you are %s state, you are taking the " +
                "%s degree program and %d credits. is this all correct? [y/n]: \n ", uName, residency, program, credits);

        String validation = initOptions.nextLine();

        if(validation.equalsIgnoreCase("n")) {
            System.out.println("Ok lets fix whatever is wrong");
            System.out.println("whats your name");
            uName = initOptions.nextLine();
            System.out.println("in state or out of state? \"in\" or \"out\" only");
            residency = initOptions.nextLine();
            System.out.println("undergrad, graduate, or law");
            program = initOptions.nextLine();
            if (program.equalsIgnoreCase("law")) {
                System.out.println("day or night?");

            }
            do {
                try {
                    credits = Integer.parseInt(initOptions.nextLine());
                    bError = false;
                } catch (Exception e) {
                    System.out.println("Error! please put in a number value");
                    initOptions.reset();
                }
            }
            while (bError);
            System.out.println("Awesome, now let me run some math to figure out what you will be paying next semester");
        }
        int ungradIn = 890;
        int ungradOut = 2565;
        int gradIn = 1261;
        int gradOut = 2977;
        int lawInAM = 2817;
        int lawOutAM = 4526;
        int lawInPM = 2295;
        int lawOutPM = 3699;
        int erf = 100;
        System.out.printf("Tuition and fees report for %s\n", uName);
        if(program.equalsIgnoreCase("law") && progTime.equalsIgnoreCase("day") && residency.equalsIgnoreCase("in"))
        {
            System.out.printf("Tuition Per Credit...............%d.00\n", lawInAM);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (lawInAM*credits+erf+60) +".00");
        }
        else if(program.equalsIgnoreCase("law") && progTime.equalsIgnoreCase("day") && residency.equalsIgnoreCase("out"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", lawOutAM);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (lawOutAM*credits+erf+60) +".00");
        }
        else if(program.equalsIgnoreCase("law") && progTime.equalsIgnoreCase("night") && residency.equalsIgnoreCase("in"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", lawInPM);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (lawInPM*credits+erf+60) +".00");
        }
        else if(program.equalsIgnoreCase("law") && progTime.equalsIgnoreCase("night") && residency.equalsIgnoreCase("out"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", lawOutPM);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (lawOutPM*credits+erf+60) +".00");
        }
        else if(program.equalsIgnoreCase("undergrad")  && residency.equalsIgnoreCase("out"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", ungradOut);
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (ungradOut*credits+erf) +".00");
        }
        else if(program.equalsIgnoreCase("undergrad")  && residency.equalsIgnoreCase("in"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", ungradIn);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (ungradIn*credits+erf) +".00");
        }
        else if(program.equalsIgnoreCase("graduate")  && residency.equalsIgnoreCase("out"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", gradOut);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (gradOut*credits+erf+60) +".00");
        }
        else if(program.equalsIgnoreCase("graduate")  && residency.equalsIgnoreCase("in"))
        {
            System.out.printf("Tuition Per Credit..........%d\n", gradIn);
            System.out.println("Graduate New Student Fee.........60.00");
            if(credits<7){erf = 60; System.out.printf("Education Resource Fee...........%d", erf);}
            else{System.out.println("Education Resource Fee...........100.00");}
            System.out.printf("Number of credits................%d\n", credits);
            System.out.println("Total Tuition...................." + (gradIn*credits+erf+60) +".00");
        }

    }
}

