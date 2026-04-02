import java.util.Scanner; 
import java.util.Random;
import javax.lang.model.util.ElementScanner14;

public class StudentLifeSim {

    public static int Grades = 5;
    public static int Social = 5;
    public static int WellBeing = 10;
    public static int Fitness = 5;
    public static int EXTRACURRICULAR = 0;
    public static int daysLeft = 14;

    public static void showStats()
    {
        System.out.println("\nA) GRADES - " + Grades + "/10");
        System.out.println("B) SOCIAL - " + Social + "/10");
        System.out.println("C) WELL BEING - " + WellBeing + "/10");
        System.out.println("D) FITNESS - " + Fitness + "/10");
        System.out.println("E) EXTRACURRICULAR - " + EXTRACURRICULAR + "/10");

        if(daysLeft == 0)
        {
            System.out.println("\n  The day has arrived . . . YOU GRADUATED!\n");

            if(Grades >= 10 && Social <= 3 && WellBeing <= 5 && WellBeing > 0 && EXTRACURRICULAR <= 5)
            {
                System.out.println("ENDING 1/6: LOST ENDING\n You got into a good college however you don't know what you're passionate about. \n You feel lost and lonely. Was studying this much really worth it?");
            }
            else if(WellBeing <= 0)
            {
                System.out.println("ENDING 2/6: DEPRESSION ENDING\n You drove your health in the pavement. You got so sad you never applied to college. Remeber to have let loose and relax once in a while.");
            }
            else if(Fitness >= 10 && Grades >= 8)
            {
                System.out.println("ENDING 3/6: ATHLETIC SCHOLARSHIP ENDING\n Congrats! You got into an amazing college doing the sport you love :) Can't wait to see you on TV playing at the professional level!");
            }
            else if(Social >= 10 && WellBeing >= 7)
            {
                System.out.println("ENDING 4/6: NETWORKED ENDING \n You went to a low ranked college to be with your friends, however turns out that wasn't a bad idea! You networked your way into an amzazing intership thanks to your social skills!");
            }
            else if(WellBeing>= 10)
            {
                System.out.println("ENDING 5/6: ENLIGHTNED ENDING\n You became mentally so healthy that you have the mindset of a monk. You've decided to take a gap year and travel the world connecting to nature and spiritualism. You live life against society norms.");

            }
            else if(EXTRACURRICULAR >= 10)
            {
                System.out.println("ENDING 6/6: PASSION ENDING\n GREAT JOB, you got into an amazing college thanks to your pursuit towards your passion that related to your career. You are excited to do the thing you love for the rest of your life :D!");

            }
            else{
                System.out.println("ENDING 0/6: Average Ending\n nice job, you got into an average-good college, lived a medicore life. Life is Simple but Peaceful. \n Wanna try getting all Endings?");
            }


        }

        else
        {
        userChoice();
        }
    }

    public static void userChoice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+ daysLeft + " Days Remaining . . .");
        System.out.print("Enter one of the letters above to do that for the Day: ");
        String choice = input.next().toUpperCase();
        
        if(choice.equals("A"))
        {
            study();
        }
        else if (choice .equals("B"))
        {
            Party();
        }
        else if (choice.equals("C"))
        {
            Meditate();
        }
        else if (choice.equals("D"))
        {
            Gym();
        }
        else if (choice.equals("E"))
        {
            Clubs();
        }
        else{
            System.out.println("Please correctly enter an option!");
            userChoice();
        }

    }

    public static void study()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 
        int decreaseBy = rand.nextInt(2)+1;
        WellBeing -= decreaseBy;
        Social -= decreaseBy;
        Grades += increaseBy;
        daysLeft -= 1;

        showStats();
    }
    public static void Party()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 
        int decreaseBy = rand.nextInt(2)+1;
        Grades -= decreaseBy;
        Social += increaseBy;
        daysLeft -= 1;

        showStats();
    }
    public static void Meditate()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 

        WellBeing += increaseBy;
        daysLeft -= 1;

        showStats();
    }
    public static void Gym()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 

        Fitness += increaseBy;
        daysLeft -= 1;

        showStats();
    }
    public static void Clubs()
    {
        EXTRACURRICULAR += 1;
        daysLeft -= 1;

        showStats();
    }
    public static void main(String[] args) {
        System.out.println(" ____     ____    .   .     ____      ____    . ");
        System.out.println("|___     |        |___|    |    |    |    |   | ");
        System.out.println("____|    |____    |   |    |____|    |____|   |____ \n");
        System.out.println(".      .    ____    _____           SIMULATOR");
        System.out.println("|      |   |____   |____            GAME");
        System.out.println("|___   |   |       |____             \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");

        System.out.println("In the accelerated world of Nited Tates, You enter High School ,as a freshman, you have 14 days to graduate.");
        System.out.println("Get into the Best University, Goodluck! ");
        
        showStats();

    }
}

