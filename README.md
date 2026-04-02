This is a simple Java program I created in which a User can make decisions that affect the Student's stats. 
There are 7 endings in total that you can achieve!
This is a parody meant to symbolize how we simplify the system from high school to college, almost like a game.
Really, there are a lot of factors and stats that affect high school kids.

I made this to prepare for my APCSA exam, but Java is really fun :)

import java.util.Scanner; 

import java.util.Random;


public class Main {

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
                System.out.println("ENDING 1/7: LOST ENDING\n You got into a good college however you don't know what you're passionate about. \n You feel lost and lonely. Was studying this much really worth it?");
            }
            else if(WellBeing <= 0)
            {
                System.out.println("ENDING 2/7: DEPRESSION ENDING\n You drove your health in the pavement. You got so sad you never applied to college. Remeber to let loose and relax once in a while.");
            }
            else if(Grades >= 9 && EXTRACURRICULAR >=5 && WellBeing >0)
            {
                System.out.println("ENDING 7/7: IVY LEAGUE ENDING \n Amazing job! You focused on your passion and your drive with academics. Pairing these two truly shows you have a goal you want to achieve in the future! :) Just make sure you don't get burnt out! Keep an eye on that mental health!");
            }
            else if(Fitness >= 10 && Grades >= 8)
            {
                System.out.println("ENDING 3/7: ATHLETIC SCHOLARSHIP ENDING\n Congrats! You got into an amazing college doing the sport you love :) Can't wait to see you on TV playing at the professional level!");
            }
            else if(Social >= 10 && WellBeing >= 7)
            {
                System.out.println("ENDING 4/7: NETWORKED ENDING \n You went to a low ranked college to be with your friends, however turns out that wasn't a bad idea! You networked your way into an amzazing intership thanks to your social skills!");
            }
            else if(WellBeing > 10)
            {
                System.out.println("ENDING 5/7: ENLIGHTNED ENDING\n You became mentally so healthy that you have the mindset of a monk. You've decided to take a gap year and travel the world connecting to nature and spiritualism. You live life against society norms.");

            }
            else if(EXTRACURRICULAR >= 10)
            {
                System.out.println("ENDING 6/7: PASSION ENDING\n GREAT JOB, you got into an amazing college thanks to your pursuit towards your passion that related to your career. You are excited to do the thing you love for the rest of your life :D!");

            }
            else{
                System.out.println("ENDING 0/7: Average Ending\n nice job, you got into an average-good college, lived a medicore life. Life is Simple but Peaceful. \n Wanna try getting all Endings?");
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

        String[] studyVerbs = {"studied a really long time", "pulled an all nighter", "absorbed your physic's book", "digested the periodic table", "watched endless videos on calculus", "wrote 30 essays"};
        int randVerbs = rand.nextInt(5);
        System.out.println(" \n   You successfully " + studyVerbs[randVerbs] +"\n");
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

        String[] partyVerbs = {"went to a party", "spent a day at the mall with friends", "met the love of your life", "explored the city with new friends", "acquired a new best friend", "called and played video games with friends"};
        int randVerbs = rand.nextInt(6);
        System.out.println(" \n   You successfully " + partyVerbs[randVerbs] +"\n");

        showStats();
    }
    public static void Meditate()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 

        WellBeing += increaseBy;
        daysLeft -= 1;
        String[] meditateVerbs = {"took a long nap", "learned and ate healthy meals", "journaled all your pent up emotions", "went outside in nature and meditated", "drank some medicine", "went to the doctor and therapy"};
        int randVerbs = rand.nextInt(6);
        System.out.println(" \n   You successfully " + meditateVerbs[randVerbs] +"\n");

        showStats();
    }
    public static void Gym()
    {
        Random rand = new Random();
        int increaseBy = rand.nextInt(3) + 1; 

        Fitness += increaseBy;
        daysLeft -= 1;

        String[] gymVerbs = {"grinded in the gym", "ran 5 miles", "played a basketball tournament", "did 50 karate lessons", "swam 50 laps", "biked across two cities"};
        int randVerbs = rand.nextInt(6);
        System.out.println(" \n   You successfully " + gymVerbs[randVerbs] +"\n");

        showStats();
    }
    public static void Clubs()
    {
        EXTRACURRICULAR += 1;
        daysLeft -= 1;

        String[] clubsVerbs = {"joined a STEM club", "volunteered at the place that needed help", "researched more about your dream career", "built a passion project", "acquired a leadership position in your club", "got a job"};
        
        Random rand = new Random();
        int randVerbs = rand.nextInt(6);
        System.out.println(" \n   You successfully " + clubsVerbs[randVerbs] +"\n");

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
