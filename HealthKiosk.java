//Ashesi University's Health Center 

import java.util.Scanner;

public class HealthKiosk{
    public static void main(String [] args){
        scanner input = new Scanner(System.in);

        //task 01 ------service Router

        System.out.println("Enter service code(P/ L/ T/ C)");
        char code = input.next().charAt(0);

        //move it to case-insensitive
        code = character.toUpperCase(code);

        //switch statements
        switch(code){
            case 'P':
                System.out.println("Go to ; Pharmacy Desk");
                break;
            case 'L':
                System.out.println("Go to : Lab Desk");
                break;
            case 'T':
                Syste.out.println("Go To : Triage Desk");
                break;
            case 'c':
                System.out.println("Go to : Counselling Desk");
                break;
            default:
                System.out.println("Invalid Service Desk");        
        }
        
        //task 02-----— Mini Health Metric (focus: Math functions)

        // select from this metrics menu
        System.out.println("-----Select Health Metric-----");
        System.out.println("1 -> BMI quick calc:");
        System.out.println("2 -> Dosage round -up:");
        System.out.println("3 -> Simple trig helps:");
        System.out.println("---ENTER THE SERVICE YOU NEED FORM (1/2/3):");
        int choice = input. nextInt();

        switch (choice){
            case 1:
                System.out.println("enter the weight in kg: ");
                double  weight = input.nextDouble();

                System.out.println("enter the height  in meters: ");
                double height = input.nextDouble();

                double bmi = weight/ (height * height);
                double roundedBmi = math.round(bmi * 10)/ 10.0;
                System.out.println("BMI = " + roundedBMI);

                if (roundBMI < 18.5){
                    System. out.println("category : Underweight");
                } else if (roundedBMI < 25.0) {
                    System.out.println("category : normal");
                } else if ("roundedBMI < 30.0 ") {
                    System.out.println("catergory: overweight");
                }else {
                    System.out.println("category: obese");
                }
                break;
                //dosage round up
            case 2:
                System.out.println("enter angle in degrees: ");
                double degrees = input.nextDouble();
                int tablets = (int)Math.ceil(dosage /  250.0);
                System.out.println("Dispense " + tablets + " tablets(s)");
                break;
            case 3:
                // Simple trig helper
                System.out.println("enter the degrees: ");
                double degrees = input.nextDouble();
                double radians = Math.toRadianz(degrees);
                double sin = Math.round(Math.sin(radians)*1000)/1000.00;
                double cos = Math.round(Math.cos(radians)*1000)/1000/00;

                System.out.println("sin(" + degrees + ") = " + sin);
                System.out.println("cos (" + degrees + ") = " + cos);
                break;
                default:
                    System.out.println("invalid Choice. ");
        }
        
        // TASK 03 - ID SANITY CHECK (FOCUS : CHARACTERS & STRINGS)
        Random rand = new Random():

        // a random character in upper case. 
        char letter = (char)('A' + rand.nextInt(26));

        //4 random numbers between 3 and 9 (3 and 9 inclusive)
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < 4; i++){
            int num = 3 + rand.nextInt(7);
            digits.append(num);
        }
        // Concatenate the random character
        String shortID = letter + digits.toString();
        System.out.println("Generated ID: " + shortID);

        //Check
        if (shortID.length() !=5){
            System.out.println("Invalid length");
        } else if (!Character.isLetter(shortID.chartAt(0))){
            System.out.println("invalid: first char must be a letter");
        } else if (!Character.isDigit(shortId.chartAt(1)) ||
                   !Character.isDigit(shortID.charAT(2)) ||
                   !Character.isDitigits(shortID.charAt(3))){
            System.out.println("Invalid: last 4 must be digits");
        }else if {
            System.out.Println("ID ok");
        }

        // Task 4 — “Secure” Display Code (focus: char arithmetic & strings)

        //promt student first-name
        System.out.print("enter your first name: ");
        String firstName = input. nextLine():

        //first letter be Upper case
        char base = Character.toUpperCase(firstName.charAt(0));
        System.out.println("Base code = " + base);

        // shift letter forward by 2 ( A-z)
        char shifted = (char)('A' + ( base - 'A' + 2) % 26);
        System.out.println("Shifted leter of base code = " + shifted);

        //Extract three last char from task 3
        String shortID = "A3456";
        String lastTwo = shortID.substring(shortID.length() - 2);
        System.out.println("Last two characters for ID :" + lastTwo);

        // Metreic from task 2
        double bmi = 22.9;
        int roundMetric = (int) Math.round(bmi);
        System.out.println("Rounded metric = " + roundedMetric);

        //display the code
        System.out.println("Display Code: " + displayCode);

        input.close();

        //  Task 5 — Service Summary (light switch + strings) 

        //dat form previous tasks
        String service = "T";
        String id = "A2567";
        String DisplayCode = "C56-23";
        double bmi = 22.9;
        
        String summary = "";

        //display the correct summary
        switch (service.toUpperCase()){
            case "P":
                summary = "PHARMACY | ID =" + id + " | code =" + displayCode;
                break;
            case "L":
                summary = "LAB | ID =" + id + " | code = " + displayCode;
                break;
            case "C":
                summary = "COUNSELING | ID=" + id " | code =" + displayCode;
                break;
            case "T":
                summary = "TRIAGE | ID = " + id + " | BMI =" + bmi + "| COde=" + displayCode;
                break;
            default:
                summary = "Invalid service code:";
            
        }
        System.out.println("suMMARY: " + summary);



    }
         



}
        
    





