//Ashesi Premier League – Football Player Management System
//Ashesi Premier League
//TASK 01

import java.util. Scanner;
public class Football{
    public static void main(String [] args){
        //the program will accept the name of the players with their name
        /* weight, and the jersey number*/
        Scanner input = new Scanner(System.in);

        System.out.print("You're a player so enter your full name; \n ");
        String  playername  = input.nextLine();

        System.out.print("Pleaase input youe age: \n ");
        Integer age = input.nextInt();

        System.out.print("Enter your height: \n ");
        Double height = input.nextDouble();

        System.out.print("Enter your weight : \n");
        Double weight = input.nextDouble();

        System.out.print("Enter your jersy number: \n");
        Integer jerseyNumber = input.nextInt();

        //output
        System.out.println("Player Name - "+ playername);
        System.out.println("Age -"+ age);
        System.out.println("Height - "+ height+"m");
        System.out.println("Weight - "+ weight+"lbs");
        System.out. println("Jerset Number -"+ jerseyNumber);


        //TASK 02
        
        //converting the data. weight into kilogram and height into centimenter
        //constants given
        final double POUND = 0.4535237;
        final int METER = 100;

    
        //Convertions
        double heightCm = height * Meter;

        double weightKg = weight * POUND;

        int weightKgInt = (int)weightKg;

        // Display
        System.out.println("\n---player Details----");
        System.out.println("player Name - " + name);
        System. out.println("Age - "+ age);
        System.out.println("Height in Centimeter  -" + (int)heightCm + "cm");
        System.out.println("Weight in Kilograms - " + weightKgInt + "kg");
        System.out.println("Jesrsey Number - " + JesrseyNumber);

        //TASK 03

        //increment
        age++ ;

        //decrement
        jerseyNumber--;

        //display updated player's info
        System.out.println("\n---Updated Stats---");
        System.out.println("player new age: " + age);
        System.out.println("player new jersey number: " +jerseyNumber);

        //TASK 04
        //player eligibility
        
        //using &&
        boolean eligible = (age >=18) && (age <= 35) && (weight < 90);
        if (eligible) {
            System.out.println("enligible");
        } else{
            System.out.println("Not Eligible");
        }

        //using OR conditon ||
        boolean problem = (age < 18) || (weight >= 90);
        if (problem){
            System.out.println("player has a problem");
        }

        //using NOT (!)
        if (!eligible) {
            System.out.println("Not Eligible");
        } else{
            System.out.println("Eligible");
        }

        //TASK 05
        if (age < 20){
            System.out.println("player category: Rising star");
        } else if ( age >= 20 && age <= 30){
            System.out.println("Player category: Prime Player");
        } else {
            System.out.println("player Category: Veteran");
        }

        //TASK 06
        switch (jerseyNumber){
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playermaker");
                break;
            default:
                System.out.println("Player Position not known");
                break;
            
        }

        //TASK 07
        System.out.println("\n=== Part A : Unwanted Fall Through ===");
        switch (jerseyNumber){
            case 1:
                System.out.println("goalkeeper");
                break;
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("midfielder");
            case 7:
                System.out.println("winger");
            case 9:
                System.out.println("stricker");
                break;
            default:
                System.out.println("Player positions not known");
        }
        //Part B: Grouped Cases
        System.out.println("\n === Part B Groupd case ===");
        switch (jerseyNumber){
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("defender");
                break;
            case 6:
            case 8:
                System.out.println("midfielder");
                break;
            case 7:
            case 11:
                System.out.println("wingers");
                break;
            case 9:
                System.out.println("striker");
                break;
            case 10:
                System.out.println("playermkaer");
                break;
            default:
                System.out.println("the player position is unkwknow");
        }

        //TASK 08
        String category = "Prime Player";

        //let check the category
        if (category.equals("Prime Player")){
            if (weight < 80){
                System.out.println("Player is selected for the starting lineup");
            } else {
                System.out.println("Plyer wait to the bench");
            }
        } else {
            System.out.println("Player wait to the bench");
        }
        

    
            
        }








        










    }
}