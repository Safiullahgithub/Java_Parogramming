package mooc.vandy.runcalc.logic;

import mooc.vandy.runcalc.view.CalculatorViewInterface;

/**
 *
 */
public class RunCalcLogic {

    CalculatorViewInterface out;

    // Constructor.
    public RunCalcLogic(CalculatorViewInterface activity){
        out = activity;
    }

    public void process(){

        double currentMileage, goalMileage, temp;
        int weeks, raceDist, neededWeeks;

        // Obtain values from 'Android' UI
        currentMileage = out.getWeeklyMilage();
        raceDist = out.getDesiredDistance();
        weeks = out.getWeeks();

        if (raceDist == 13){
            goalMileage = 30;
        }
        else if (raceDist == 10){
            goalMileage = 20;
        }
        else{
            goalMileage = 15;
        }

        temp = Math.log((goalMileage/currentMileage))/Math.log(1.1); //allows for weekly increase of 10%
        neededWeeks = (int)Math.ceil(temp);

        if (neededWeeks <= weeks){ //they have time to complete the program
            out.println("You have time to meet your goal!  Increasing your weekly mileage by approximately 10% per week");
            out.println("you will achieve the suggested weekly total of " + goalMileage + " miles before your race.");
        }
        else{
            out.println("You do not have enough time to complete this program. ");
            out.print("Consider selecting a later race");
            if (raceDist == 5){
                out.println(".");
            }
            else {
                out.println(" or switching to a shorter race.");
            }
        }
        out.println("Good luck!" + neededWeeks);
    }

}
