package Tourists;


import Locations.*;

public class Phoebe implements Tourist {
    static int budget = 2000;


    public void visit() {
        System.out.print("Let's enjoy!");
    }

    public void visit(Boracay boracay) {
        System.out.println("My allocated budget for this vacation is" + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("I wanna see the white sand" );
            budget -= boracay.airFare;

        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();

    }

    public void visit(Batangas batangas) {

        if(budget >batangas.airFare){
            System.out.println("Let's go see the Taal Volcano");
            budget -= batangas.airFare;
        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();
    }
    public void visit(Bicol bicol) {
        if(budget >bicol.airFare){
            System.out.println("Next stop, Mayon Volcano!");
            budget -= bicol.airFare;
        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();
    }

    public void visit(Ifugao ifugao) {
        if(budget >ifugao.airFare){
            System.out.println("I wanna see the Rice Terraces");
            budget -= ifugao.airFare;
        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();
    }

    public void visit(Samar samar) {
        if(budget >samar.airFare){
            System.out.println("Let's swim in Tarabangan Falls!");
            budget -= samar.airFare;
        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();
    }

    public void visit(Davao davao) {
        if(budget >davao.airFare){
            System.out.println("Let's go to Davao next");
            budget -= davao.airFare;
        }else{
            System.out.println("I don't have any money left huhu");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("My budget is: " + budget);
    }

    public static int getBudget() {
        return budget;
    }
}

